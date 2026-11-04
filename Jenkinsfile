pipeline  {
	agent any

	environment {
		JAVA_OPTS = "-Xms4048m -Xmx4048m -XX:MaxMetaspaceSize=2048m -Dgosh.args=--nointeractive ${sh(script:'echo $JAVA_OPTS', returnStdout: true).trim()}"
		VERSION = "${env.BUILD_ID}"
  }

	tools {
		jdk 'OpenJDK25'
		nodejs 'NodeJS22'
	}

	options {
		buildDiscarder(logRotator(numToKeepStr: '5'))
	}

	stages {
		stage('clean workspace') {
			steps {
				deleteDir()
			}
		}
		stage('Checkout') {
			steps {
				// Get UDP from GitHub
				checkout([  
				           $class: 'GitSCM', 
				           branches: [[name: "refs/heads/${env.GIT_BRANCH}"]], 
				           doGenerateSubmoduleConfigurations: false, 
				           extensions: [[$class: 'RelativeTargetDirectory', relativeTargetDir: 'udp']], 
				           submoduleCfg: [], 
				           userRemoteConfigs: [[url: 'https://github.com/de-jena/urban-data-platform.git']]
				       ])
				// Get DAANSE from GitHub
				checkout([  
				           $class: 'GitSCM', 
				           branches: [[name: 'refs/heads/feature-viewClient']], 
				           doGenerateSubmoduleConfigurations: false, 
				           extensions: [[$class: 'RelativeTargetDirectory', relativeTargetDir: 'legacy.dashboard.client']], 
				           submoduleCfg: [], 
				           userRemoteConfigs: [[url: 'https://github.com/eclipse-daanse/legacy.dashboard.client.git']]
				       ])
		       }
		}
		


		
		stage('Backend build') {

			steps {
				echo "I am building app on branch: ${env.GIT_BRANCH}"

				dir("udp") {
					sh "./gradlew clean build -x testOSGi --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
				}				

			}
		}

		stage('Integration Tests') {

			steps {
				echo "I am running integration tests on branch: ${env.GIT_BRANCH}"

//				dir("udp") {
//					script {
//						try {
//	                        sh './gradlew testOSGi --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2 --no-daemon' //run a gradle task
//	                    } finally {
//	                        junit testResults: '**/generated/test-reports/testOSGi/TEST-*.xml', skipPublishingChecks: true, allowEmptyResults: true //make the junit test results available in any case (success & failure)
//	                    }
//                    }
//				}

			}
		}
	


        stage('Resolve MQTT Bridge') {

            steps {
                echo "I am building app on branch: ${env.GIT_BRANCH}"

				dir("udp") {
                    sh "./gradlew :de.jena.mqttbridge.runtime:resolve.mqttbridge --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
                }
            }
        }

        stage('MQTT Bridge Export') {
            when {
                branch 'main'
            }
            steps {
                echo "I am building app on branch: ${env.GIT_BRANCH}"

				dir("udp") {
                    sh "./gradlew :de.jena.mqttbridge.runtime:export.mqttbridge --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
                }
            }
        }
	
        stage('Resolve UDP Atlas Runtime') {

            steps {
                echo "I am building app on branch: ${env.GIT_BRANCH}"

				dir("udp") {
                    sh "./gradlew :de.jena.udp.atlas.runtime:resolve.de.jena.udp.atlas.runtime.docker --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
                }
            }
        }

        stage('UDP Atlas Runtime Export') {
            when {
                branch 'main'
            }
            steps {
                echo "I am building app on branch: ${env.GIT_BRANCH}"

				dir("udp") {
                    sh "./gradlew :de.jena.udp.atlas.runtime:export.de.jena.udp.atlas.runtime.docker --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
                }
            }
        }

		stage('Prepare UDP Docker') {
			when {
				branch 'main'
			}
			steps  {
				echo "I am preparing docker: ${env.GIT_BRANCH}"
				
				dir("udp/docker") {
					sh "./gradlew prepareDocker --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
				}
			}

		}

        stage('Docker Bridge Image build'){
            when {
                branch 'main'
            }
            steps  {
                echo "I am building and publishing a docker image on branch: ${env.GIT_BRANCH}"
                script {
                    docker.withRegistry('https://registry-git.jena.de', 'github-jena') {
                        def image = docker.build("registry-git.jena.de/scj/udp/mqtt-bridge:0.1.0.${VERSION}", 'udp/docker/bridge')
                        image.push()
                        image.push('latest')
                    }
                    docker.withRegistry('https://devel.data-in-motion.biz:6000', 'dim-nexus') {
                        def image = docker.build("devel.data-in-motion.biz:6000/scj/mqtt-bridge:0.1.0.${VERSION}", 'udp/docker/bridge')
                        image.push()
                        image.push('latest')
                    }
                }
          }
        }
        stage('Docker Atlas Runtime Image build'){
            when {
                branch 'main'
            }
            steps  {
                echo "I am building and publishing a docker image on branch: ${env.GIT_BRANCH}"
                script {
                    docker.withRegistry('https://registry-git.jena.de', 'github-jena') {
                        def image = docker.build("registry-git.jena.de/scj/udp/atlas-runtime:0.1.0.${VERSION}", 'udp/docker/atlas-runtime')
                        image.push()
                        image.push('latest')
                    }
                    docker.withRegistry('https://devel.data-in-motion.biz:6000', 'dim-nexus') {
                        def image = docker.build("devel.data-in-motion.biz:6000/scj/udp-atlas-runtime:0.1.0.${VERSION}", 'udp/docker/atlas-runtime')
                        image.push()
                        image.push('latest')
                    }
                }
          }
        }
        stage('Release'){
            when {
                branch 'main'
            }

            steps  {
				dir("udp") {
                    withCredentials([usernamePassword(credentialsId: 'dim-nexus', usernameVariable: 'NEXUS_USER', passwordVariable: 'NEXUS_PASSWORD')]) {
                        sh "./gradlew release --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
                    }
                }
            }
        } 
	}
}
