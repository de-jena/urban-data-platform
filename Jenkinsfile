pipeline  {
	agent any

	environment {
		JAVA_OPTS = "-Xms4048m -Xmx4048m -XX:MaxMetaspaceSize=2048m ${sh(script:'echo $JAVA_OPTS', returnStdout: true).trim()}"
		VERSION = "${env.BUILD_ID}"
  }

	tools {
		jdk 'OpenJDK17'
	}

	options {
		buildDiscarder(logRotator(numToKeepStr: '5'))
	}

	stages {
		stage('clean workspace and checkout') {
			steps {
				deleteDir()
				checkout scm
			}
		}

		stage('App build') {

			steps {
				echo "I am building app on branch: ${env.GIT_BRANCH}"

				dir("backend") {
					sh "./gradlew clean build -x testOSGi --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
				}				

			}
		}

		stage('Integration Tests') {

			steps {
				echo "I am running integration tests on branch: ${env.GIT_BRANCH}"

				dir("backend") {
					script {
						try {
	                        sh './gradlew testOSGi --info --stacktrace -Dgosh.args=--nointeractive -Dmaven.repo.local=${WORKSPACE}/.m2 --no-daemon' //run a gradle task
	                    } finally {
	                        junit testResults: '**/generated/test-reports/testOSGi/TEST-*.xml', skipPublishingChecks: true, allowEmptyResults: true //make the junit test results available in any case (success & failure)
	                    }
                    }
				}

			}
		}
	
		stage('Resolve UDP Broker') {

			steps {
				echo "I am building app on branch: ${env.GIT_BRANCH}"

				dir("backend") {
					sh "./gradlew :de.jena.udp.sensinact.runtime:resolve.de.jena.upd.sensinact.runtime.base --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
				}
			}
		}

		stage('UDP Broker Export') {
			when {
				branch 'main'
			}
			steps {
				echo "I am building app on branch: ${env.GIT_BRANCH}"

				dir("backend") {
					sh "./gradlew :de.jena.upd.sensinact.runtime:export.de.jena.upd.sensinact.runtime.docker --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
				}
			}
		}

	
		stage('Prepare UDP Docker') {
			when {
				branch 'main'
			}
			steps  {
				echo "I am preparing docker: ${env.GIT_BRANCH}"
				
				dir("docker") {
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
//				      dockerFileDirectory: 'docker/broker',
//							cloud: 'docker',
//							tagsString: """registry-git.jena.de/scj/udp-broker:latest
//                                        registry-git.jena.de/scj/udp-broker:0.1.0.${VERSION}""",
//							pushOnSuccess: true,
//							pushCredentialsId: 'github-jena'])

				step([$class: 'DockerBuilderPublisher',
				      dockerFileDirectory: 'docker/broker',
							cloud: 'docker',
							tagsString: """devel.data-in-motion.biz:6000/scj/udp-broker:latest
							            devel.data-in-motion.biz:6000/scj/udp-broker:0.1.0.${VERSION}""",
							pushOnSuccess: true,
							pushCredentialsId: 'dim-nexus'])
		  }
		}
	}
}
