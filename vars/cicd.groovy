def newGit(repo)
{
  git "${repo}"
}
def newmaven()
{
 sh 'mvn package'
}
def newDeploy()
{
  deploy adapters: [tomcat9(credentialsId: '74cb3562-c5c2-4c17-8072-85fe27d7c86c', path: '', url: 'http://172.31.2.180:8080')], contextPath: 'app', war: '**/*.war'
}
