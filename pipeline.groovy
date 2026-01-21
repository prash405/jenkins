pipeline{   
    agent any
    stages{
        stage('Build'){
            steps{
                git branch: 'main', url: 'https://github.com/prash405/javaProject.git'
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