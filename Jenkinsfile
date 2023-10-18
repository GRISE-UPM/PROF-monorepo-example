pipeline {
  agent any
  stages {
    stage('Compile quicksort project') {
      steps {
        sh '''cd quicksort
              make'''
      }
    }
    stage('Move shared library') {
      steps {
        sh '''cp quicksort/quicksort.so arraysort/lib'''
      }
    }
    stage('Compile arraysort project') {
      steps {
        withAnt {
          sh '''cd arraysort
                ant compile'''
        }
      }
    }
  }
  scm {
        git {
            remote {
                github('https://github.com/GRISE-UPM/PROF-monorepo-example')
                refspec('+refs/pull/*:refs/remotes/origin/pr/*')
            }
            branch('${sha1}')
        }
  }
  triggers {
        githubPullRequest {
            admin(odieste')
            useGitHubHooks()
        }
    }
}
