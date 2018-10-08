pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('build') {
            steps {
                sh 'mvn compile'
            }
        }
        stage('test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('clean') {
            steps {
                sh 'mvn --version'
                sh 'mvn clean'
            }
        }
    }
}