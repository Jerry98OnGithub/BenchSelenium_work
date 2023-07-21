pipeline {
    agent any
    
	 stages {
		        stage('Checkout') {
		            steps {
		                // Checkout your Selenium UI testing framework code from the Git repository
				 git branch: 'main', url:'https://github.com/Jerry98OnGithub/BenchSelenium_Assignment.git'

		                echo 'checkout'
		              }
		           }
		        
		        stage('Build') {
		            steps {
		                // Build your Selenium project using Maven
		                //sh 'mvn clean package' // Assuming your framework uses Maven
				        echo 'build'
				    bat 'mvn clean package'
		             }
		          }
        
		        stage('Test') {
		            steps {
		                // Run your Selenium UI tests using Maven
		               // sh 'mvn test' // Assuming your framework uses Maven to run tests
				        echo 'test'
		            }
		         }
        
		        stage('Publish Reports') {
		            steps {
		                // Publish test reports using HTML Publisher plugin
		               echo 'this is publish reports section'
			    }
		        }
        
      			  // Add more stages as per your requirements
        
          }
    
    post {
	        always {
	            // Clean up or other actions, if required
	            //sh 'rm -rf temp-files/' // Clean up temporary files
	            echo 'this is always command in post section'
	        }
        
	        success {
	            // Actions to perform when the pipeline succeeds
	            echo 'Pipeline succeeded!'
	        }
        
	        failure {
	            // Actions to perform when the pipeline fails
	            echo 'Pipeline failed!'
	        }
          }
	
}

