pipeline {
  agent any
  stages {
    stage('initialize') {
      steps {
        echo 'Initializing'
        sh 'pwd'
        sh 'env'
        sh 'java -version'
      }
    }
    stage('build') {
      steps {
        echo 'Building'
      }
    }
    stage('test') {
      steps {
        echo 'testing'
      }
    }
  }
}