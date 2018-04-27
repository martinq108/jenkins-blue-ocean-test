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
        echo 'collecting test results'
        junit(allowEmptyResults: true, testResults: 'lib1/build/test-results/**/*.xml')
        junit 'lib2/build/test-results/**/*.xml'
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