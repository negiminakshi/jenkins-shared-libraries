def call(String Project, String ImageTag, String DOCKER_USER){
  withCredentials([usernamePassword(credentialsId: 'dockerhub', passwordVariable: 'DOCKER_PASS', usernameVariable: 'DOCKER_USER')]) {
      sh "docker login -u ${DOCKER_USER} -p ${DOCKER_PASS}"
  }
  sh "docker push ${DOCKER_USER}/${Project}:${ImageTag}"
}
