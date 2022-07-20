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
def newTest()
{
   sh 'java -jar /home/ubuntu/.jenkins/workspace/Declarativepipeline/testing.jar'
}
def newDel()
{
  input message: 'need approved from DM', submitter: 'sri'
  deploy adapters: [tomcat9(credentialsId: 'a8446fea-4a9c-42b0-99cb-1cdc739ef10d', path: '', url: 'http://172.31.5.146:8080')], contextPath: 'paa', war: '**/*.war'
}
