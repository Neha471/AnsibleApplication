pipeline
{
    agent any
    tools
    {
        maven "MAVEN"
        jdk "JDK-11"
    }

    stages
    {
        stage("Checkout code")
        {
            steps
            {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: 
                [[credentialsId: '3', url: 'https://github.com/Neha471/AnsibleApplication.git']]])
            }
        }

        stage("Code build")
        {
            steps
            {
                
                sh 'mvn -f /var/lib/jenkins/workspace/Deployment clean install'
                
            }
 
		}
	}
}
