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
                echo 'Checkout stage started.'
                echo 'Source code checkout simulated successfully.'
            }
        }

        stage('Build') {
            steps {
                script {
                    def appName = 'customer-api'
                    def appVersion = '1.0.0'

                    echo "Application Name: ${appName}"
                    echo "Application Version: ${appVersion}"
                    echo "Build stage started."
                    echo 'Application build simulated successfully.'
                }
            }
        }

        stage('Test') {
            steps {
                echo 'Test stage started.'
                echo 'Application tests simulated successfully.'
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

                    echo 'Deployment simulation completed.'
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
