// Define function
def call(String ProjectName, String ImageTag, String Docker_User){
  sh "docker build -t ${Docker_User}/${ProjectName}:${ImageTag} ."
}
