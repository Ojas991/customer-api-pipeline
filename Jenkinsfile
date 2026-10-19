pipeline {
    agent any

    parameters {
        choice(
            name: 'ENVIRONMENT',
            choices: ['dev', 'qa', 'prod'],
            description: 'Select the target deployment environment'
        )
    }

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out customer-api Python application from GitHub.'

                checkout scm

                echo 'Source code checkout completed successfully.'
            }
        }

        stage('Build') {
            steps {
                script {
                    def appName = 'customer-api'
                    def appVersion = '1.0.0'

                    echo "Application Name: ${appName}"
                    echo "Application Version: ${appVersion}"
                    echo 'Validating Python application.'

                    bat 'python --version'
                    bat 'python -m py_compile app.py'

                    echo 'Python application validation completed successfully.'
                }
            }
        }

        stage('Test') {
            steps {
                echo 'Running actual Python unit tests.'

                bat 'python -m unittest discover -s tests -v'

                echo 'All Python unit tests passed.'
            }
        }

        stage('Deploy') {
            steps {
                script {
                    def environment = params.ENVIRONMENT

                    echo "Selected Environment: ${environment}"

                    if (environment == 'dev') {
                        echo 'Development deployment started.'
                    } else if (environment == 'qa') {
                        echo 'QA deployment started.'
                    } else if (environment == 'prod') {
                        echo 'Production deployment requires approval.'
                    } else {
                        error("Invalid environment: ${environment}")
                    }

                    echo 'Deployment is simulated. No actual deployment performed.'
                }
            }
        }

        stage('Process Environments') {
            steps {
                script {
                    def environments = ['dev', 'qa', 'prod']

                    environments.each { envName ->
                        echo "Processing environment: ${envName}"
                    }
                }
            }
        }

        stage('Archive Artifacts') {
            steps {
                archiveArtifacts(
                    artifacts: 'app.py,tests/*.py',
                    fingerprint: true
                )

                echo 'Python application source files archived successfully.'
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully.'
        }

        failure {
            echo 'Pipeline failed. Please check the console output.'
        }
    }
}