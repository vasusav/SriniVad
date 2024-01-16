def call(String project) {



        
  sh 'docker build . -t sriniVad/devops-training:$Docker_tag'
		   withCredentials([string(credentialsId: 'docker_password', variable: 'docker_password')]) {
				    
				  sh 'docker login -u vasusav -p $docker_password'
				  sh 'docker push sriniVad/devops-training:$Docker_tag'
			}
}
