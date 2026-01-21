pipeline{   
    agent {label 'slave2'}
    stages{
        stage('git pull'){
            steps{
                git branch: 'main', url: 'https://github.com/prash405/javaProject.git'
            }
        }
         stage('Install Dependencies') {
            steps {
                sh '/opt/node/bin/npm install'
            }
        }
        stage('Build'){
            steps{
                sh '/opt/node/bin/npm run build'
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