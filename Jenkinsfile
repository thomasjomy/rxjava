pipeline{
    agent{
        label "any"
    }

    stages{
        stage("build"){
            steps{
                echo "Building the application"
            }
            post{
                success{
                    echo "Build completed successfully"
                }
                failure{
                    echo "Build failed."
                }
            }
        }
        stage("test"){
            steps{
                echo "Running tests"
            }
            post{
                success{
                    echo "Test completed successfully"
                }
                failure{
                    echo "Test failed"
                }
        
            }
        }
    }
    post{
        always{
            echo "========always========"
        }
        success{
            echo "========pipeline executed successfully ========"
        }
        failure{
            echo "========pipeline execution failed========"
        }
    }
}