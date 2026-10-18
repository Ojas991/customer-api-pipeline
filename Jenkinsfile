pipeline {
    agent any

    parameters {
        choice(
            name: 'ENVIRONMENT',
            choices: ['dev', 'qa', 'prod'],
            description: 'Select the deployment environment'
        )
    }

    stages {

        stage('Checkout') {
            steps {
                echo 'Checkout Stage: Source code checkout started.'
                echo 'Source code checkout completed (simulated).'
            }
        }

        stage('Build') {
            steps {
                script {
                    def appName = 'customer-api'
                    def appVersion = '1.0.0'

                    echo "Application Name: ${appName}"
                    echo "Application Version: ${appVersion}"
                    echo 'Build started from the GitHub-managed Jenkinsfile.'
                    echo 'Build completed successfully (simulated).'
                }
            }
        }

        stage('Test') {
            steps {
                echo 'Test Stage: Application testing started.'
                echo 'Tests passed (simulated).'
            }
        }

        stage('Deploy') {
            steps {
                script {
                    def appName = 'customer-api'
                    def appVersion = '1.0.0'
                    def environment = params.ENVIRONMENT

                    echo "Application: ${appName}"
                    echo "Version: ${appVersion}"
                    echo "Selected Environment: ${environment}"

                    if (environment == 'dev') {
                        echo 'Development deployment started'
                    } else if (environment == 'qa') {
                        echo 'QA deployment started'
                    } else if (environment == 'prod') {
                        echo 'Production deployment requires approval'
                    } else {
                        error "Invalid environment: ${environment}"
                    }
                }
            }
        }

        stage('Process Environments') {
            steps {
                script {
                    def environments = ['dev', 'qa', 'prod']

                    environments.each { env ->
                        echo "Processing environment: ${env}"
                    }
                }
            }
        }
    }
}
