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
                    bat '"D:\\Devops\\tools\\apache-maven-3.10.0-bin\\apache-maven-3.10.0\\bin\\mvn.cmd" clean package -DskipTests'
                }
            }
        }

        stage('Test') {
            steps {
                dir('number-guessing-game') {
                    echo 'Running JUnit tests'
                    bat '"D:\\Devops\\tools\\apache-maven-3.10.0-bin\\apache-maven-3.10.0\\bin\\mvn.cmd" test'
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