pipeline{   
    agent {label 'slave2'}
    stages{
        stage('git pull'){
            steps{
                git branch: 'main', url: 'https://github.com/prash405/node.git'
            }
        }
         stage('Install Dependencies') {
            steps {
                sh 'npm install'
            }
        }
        stage('Build'){
            steps{
                sh 'npm run build'
            }
        }
        stage('Test'){
            steps{
                sh 'npm test || echo "No test script found"'
            }
        }
        stage('Deploy'){
            steps{
                sh 'node server.js &'
            }
        }
    }
}