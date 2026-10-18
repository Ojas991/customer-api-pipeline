pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out source code from GitHub'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                dir('number-guessing-game') {
                    echo 'Building Java application using Maven'
                    bat 'mvn clean package -DskipTests'
                }
            }
        }

        stage('Test') {
            steps {
                dir('number-guessing-game') {
                    echo 'Running JUnit tests'
                    bat 'mvn test'
                }
            }
        }

        stage('Deploy') {
            steps {
                echo 'Simulating application deployment'
                echo 'Deployment completed successfully!'
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully!'
        }

        failure {
            echo 'Pipeline failed. Please check the console output.'
        }
    }
}