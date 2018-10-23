pipeline {
  agent {
    docker {
      image 'maven:3.3.3'
    }

  }
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
      parallel {
        stage('clean') {
          steps {
            sh 'mvn clean'
            sh 'echo "wat da??!"'
          }
        }
        stage('print version') {
          steps {
            sh 'mvn --version'
          }
        }
      }
    }
  }
}
