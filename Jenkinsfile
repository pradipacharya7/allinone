pipeline{
agent any
tools{
        maven 'Maven3'
    }
    stages{
        stage('Build'){
        steps{
        echo"process Building has been started."
        sh 'maven -f allinone/pom.xml clean compile'
        }
       }
        stage('Test'){
        steps{
        echo 'Process Testing has been started'
        sh 'mvn -f allinone/pom.xml clean test'
        }
        }

    }
}