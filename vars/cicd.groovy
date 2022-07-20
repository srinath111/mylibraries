def newGit(repo)
{
  git "${repo}"
}
def newmaven()
{
 sh 'mvn package'
}
