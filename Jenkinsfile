pipeline
{
    agent any

    stages
    {

        stage('Clone Repository')
        {
            steps
            {
                git 'https://github.com/vinay592/scientific-calculator-devops.git'
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

        stage('Build Docker Image')
        {
            steps
            {
                sh 'docker build -t scientific-calculator .'
            }
        }

    }
}
