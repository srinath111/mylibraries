def newGit(repo)
{
  git "${repo}"
}
def newgit()
{
     mail bcc: '', body: 'jenkins unable to Download', cc: '', from: '', replyTo: '', subject: 'Download Failed', to: 'srinathkoraboina3@gmail.com'
                        
                exit(1)
  }
def newmaven()
{
 sh 'mvn package'
}
def newMaven()
{
    mail bcc: '', body: 'jenkins unable to built artfiacts from the code', cc: '', from: '', replyTo: '', subject: 'Built failed', to: 'srinathkoraboina3@gmail.com'
                        
        exit()
  }

def newDeploy()
{
  deploy adapters: [tomcat9(credentialsId: '74cb3562-c5c2-4c17-8072-85fe27d7c86c', path: '', url: 'http://172.31.2.180:8080')], contextPath: 'app', war: '**/*.war'
}
def newdeploy()
{
   mail bcc: '', body: 'jenkins unable to deploy tomcat on the QA server', cc: '', from: '', replyTo: '', subject: 'Deployment Failed', to: 'middleware.team@gmail.com'
                        
               exit()
}
def newTest()
{
   sh 'java -jar /home/ubuntu/.jenkins/workspace/Declarativepipeline/testing.jar'
}
def newtest()
{
  mail bcc: '', body: 'Jenkins unable to test', cc: '', from: '', replyTo: '', subject: 'Testing failed', to: 'tester.team@gmail.com'
                        
              exit()
}
def newDel()
{
  input message: 'need approved from DM', submitter: 'sri'
  deploy adapters: [tomcat9(credentialsId: 'a8446fea-4a9c-42b0-99cb-1cdc739ef10d', path: '', url: 'http://172.31.5.146:8080')], contextPath: 'paa', war: '**/*.war'
}
def newdel()
{
   mail bcc: '', body: 'jenkins unable to deploy on prod server', cc: '', from: '', replyTo: '', subject: 'Delivery failed', to: 'Delivery.team@gmail.com'
                        
                  exit()
}
