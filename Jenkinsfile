pipeline {
  agent {
    docker {
      image 'martinq/gradle'
    }

  }
  stages {
    stage('initialize') {
      steps {
        echo '========== Initializing =========='
        sh 'pwd'
        sh 'env'
        sh 'java -version'
        sh './gradlew --version'
      }
    }
    stage('build') {
      steps {
        echo '========== Building =========='
        sh './gradlew clean build -s'
      }
    }
    stage('test results') {
      steps {
        echo '========== Collecting Test Results =========='
        junit(allowEmptyResults: true, testResults: 'lib1/build/test-results/**/*.xml')
        junit(allowEmptyResults: true, testResults: 'lib2/build/test-results/**/*.xml')
      }
    }
    stage('archive artifacts') {
      steps {
        echo '========== Archiving Artifacts =========='
        archiveArtifacts(onlyIfSuccessful: true, artifacts: 'lib1/build/libs/*.jar')
        archiveArtifacts(onlyIfSuccessful: true, artifacts: 'lib2/build/libs/*.jar')
      }
    }
  }
}