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
        		sh 'docker tag scientific-calculator vinay592/scientific-calculator'
        		sh 'docker push vinay592/scientific-calculator'
    		}
	}
    }
}
