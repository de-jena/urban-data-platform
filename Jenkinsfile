pipeline  {
	agent any

	environment {
		JAVA_OPTS = "-Xms4048m -Xmx4048m -XX:MaxMetaspaceSize=2048m -Dgosh.args=--nointeractive ${sh(script:'echo $JAVA_OPTS', returnStdout: true).trim()}"
		VERSION = "${env.BUILD_ID}"
  }

	tools {
		jdk 'OpenJDK17'
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
				           branches: [[name: 'refs/heads/main']], 
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
		
		stage('5G Democlient build') {

			steps {
				echo "I am building 5G Demo client on branch: ${env.GIT_BRANCH}"

				dir("udp/frontend/5gDemo") {
					sh "npm install"
					sh "npm run build"
				}				
			}
		}

		stage('Modelling UI build') {

			steps {
				echo "I am building Modelling UI client on branch: ${env.GIT_BRANCH}"

				dir("udp/frontend/model-ui") {
					sh "npm install"
					sh "npm run build-only"
				}				
			}
		}

		stage('DAANSE Dashboard UI build') {

			steps {
				echo "I am building Modelling UI client on branch: ${env.GIT_BRANCH}"

				dir("legacy.dashboard.client") {
					sh "npm install"
					sh "npm run build-only"
				}				
			}
		}
		
		stage('Backend build') {

			steps {
				echo "I am building app on branch: ${env.GIT_BRANCH}"

				dir("udp/backend") {
					sh "./gradlew clean build -x testOSGi --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
				}				

			}
		}

		stage('Integration Tests') {

			steps {
				echo "I am running integration tests on branch: ${env.GIT_BRANCH}"

//				dir("udp/backend") {
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
	
		stage('Resolve UDP Broker') {

			steps {
				echo "I am building app on branch: ${env.GIT_BRANCH}"

				dir("udp/backend") {
					sh "./gradlew :de.jena.udp.sensinact.runtime:resolve.de.jena.udp.sensinact.runtime.base --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
				}
			}
		}

		stage('UDP Broker Export') {
			when {
				branch 'main'
			}
			steps {
				echo "I am building app on branch: ${env.GIT_BRANCH}"

				dir("udp/backend") {
					sh "./gradlew :de.jena.udp.sensinact.runtime:export.de.jena.udp.sensinact.runtime.docker --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
				}
			}
		}

        stage('Resolve MQTT Bridge') {

            steps {
                echo "I am building app on branch: ${env.GIT_BRANCH}"

				dir("udp/backend") {
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

				dir("udp/backend") {
                    sh "./gradlew :de.jena.mqttbridge.runtime:export.mqttbridge --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
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

		stage('Docker UDP Image build'){
			when {
				branch 'main'
			}

			steps  {
				echo "I am building and publishing a docker image on branch: ${env.GIT_BRANCH}"

//				step([$class: 'DockerBuilderPublisher',
//				      dockerFileDirectory: 'udp/docker/broker',
//							cloud: 'docker',
//							tagsString: """registry-git.jena.de/scj/udp-broker:latest
//                                        registry-git.jena.de/scj/udp-broker:0.1.0.${VERSION}""",
//							pushOnSuccess: true,
//							pushCredentialsId: 'github-jena'])

				step([$class: 'DockerBuilderPublisher',
				      dockerFileDirectory: 'udp/docker/broker',
							cloud: 'docker',
							tagsString: """devel.data-in-motion.biz:6000/scj/udp-broker:latest
							            devel.data-in-motion.biz:6000/scj/udp-broker:0.1.0.${VERSION}""",
							pushOnSuccess: true,
							pushCredentialsId: 'dim-nexus'])
		  }
		}
        stage('Docker Bridge Image build'){
            when {
                branch 'main'
            }
            steps  {
                echo "I am building and publishing a docker image on branch: ${env.GIT_BRANCH}"
//                step([$class: 'DockerBuilderPublisher',
//                    dockerFileDirectory: 'udp/docker/bridge',
//                             cloud: 'docker',
//                             tagsString: """registry-git.jena.de/scj/mqtt-bridge:latest
//                                         registry-git.jena.de/scj/mqtt-bridge:0.1.0.${VERSION}""",
//                             pushOnSuccess: true,
//                             pushCredentialsId: 'github-jena'])

                step([$class: 'DockerBuilderPublisher',
                      dockerFileDirectory: 'udp/docker/bridge',
                            cloud: 'docker',
                            tagsString: """devel.data-in-motion.biz:6000/scj/mqtt-bridge:latest
                                        devel.data-in-motion.biz:6000/scj/mqtt-bridge:0.1.0.${VERSION}""",
                            pushOnSuccess: true,
                            pushCredentialsId: 'dim-nexus'])
          }
        }

	}
}
