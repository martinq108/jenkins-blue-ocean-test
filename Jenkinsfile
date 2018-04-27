pipeline {
  agent any
  stages {
    stage('initialize') {
      steps {
        echo 'Initializing'
        sh 'pwd'
        sh 'env'
        sh 'java -version'
        sh './gradlew --version'
      }
    }
    stage('build') {
      steps {
        echo 'Building'
        sh './gradlew clean build -s'
      }
    }
    stage('test results') {
      steps {
        echo 'testing'
        junit(allowEmptyResults: true, testResults: '**/build/test-results/**/*.xml', keepLongStdio: true)
      }
    }
    stage('archive artifacts') {
      steps {
        echo 'archive artifacts'
        archiveArtifacts(onlyIfSuccessful: true, artifacts: '**/build/libs/*.jar')
      }
    }
  }
}