pipeline{   
    agent {label 'slave2'}
    stages{
        stage('git pull'){
            steps{
                git branch: 'main', url: 'https://github.com/prash405/javaProject.git'
            }
        }
        stage('Build'){
            steps{
                sh '/opt/maven/bin/mvn clean package'
            }
        }
        stage('Test'){
            steps{
                echo 'Testing the application'
            }
        }
        stage('Deploy'){
            steps{
                echo 'Deploying the application'
            }
        }
    }
}