pipeline {
    environment {
        registry = "abvroot/calculator"
        registryCredential = 'docker-hub'
    }
  agent any
  stages {

    stage('Clone GIT Repository') {
            /* Cloning the Repository to our Workspace */
        script{
           checkout scm
        }
    }
    stage('Clean') {
        steps{
             sh 'mvn clean'
             echo "clean"
        }
    }

    stage('Compile') {
        steps{
             sh 'mvn package'
             echo "compile"
        }
    }
    stage('Test') {
        steps{
           sh 'mvn test'
           echo "test"
        }
    }

    stage('Deploy Image to Docker Hub') {
        steps{
            script{
               dockerImage = docker.build registry + ":calc"
               docker.withRegistry( '', registryCredential){
                   dockerImage.push()
               }
            }
        }
    }

  }
}