pipeline
{
    agent any

    stages
    {

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
    		success
    		{
        		emailext(
            			to: 'vinayvb592@gmail.com',
           		        subject: 'Jenkins Build Success',
            			body: 'The Jenkins pipeline build completed successfully.'
        		)
    		}

    		failure
    		{
        		emailext(
            			to: 'vinayvb592@gmail.com',
            			subject: 'Jenkins Build Failed',
            			body: 'The Jenkins pipeline build has failed. Please check Jenkins.'
        		)
    		}
	}
    
}
