pipeline
{
    agent any
    options {
       disableConcurrentBuilds()
    }
    stages
    {

	stage('Checkout Code')
        {
            steps
            {
                checkout scm
            }
        }
        stage('Compile Program')
        {
            steps
            {
                sh 'javac src/program/Calculator.java'
            }
        }

        stage('Compile Test')
        {
            steps
            {
                sh 'javac -cp ".:src/program:lib/*" src/test/CalculatorTest.java'
            }
        }

        stage('Run Unit Tests')
        {
            steps
            {
                sh 'java -cp ".:src/program:src/test:lib/*" org.junit.runner.JUnitCore CalculatorTest'
            }
        }
        
	stage('Check Docker')
	{
    		steps
    		{
        		sh 'docker --version'
    		}
	}

        stage('Build Docker Image')
        {
            steps
            {
                sh 'docker build -t scientific-calculator .'
            }
        }
	stage('Push Docker Image')
	{
    		steps
    		{
        		sh 'docker tag scientific-calculator vinayvb18/scientific-calculator'
        		sh 'docker push vinayvb18/scientific-calculator'
    		}
	}
    }
    post
    {
       always
       {
        emailext(
            to: 'vinayvb592@gmail.com',
            subject: "Build Status: ${currentBuild.currentResult}",
            body: "Job: ${env.JOB_NAME}\nBuild Number: ${env.BUILD_NUMBER}\nStatus: ${currentBuild.currentResult}"
        )
       }
    }
    
}
