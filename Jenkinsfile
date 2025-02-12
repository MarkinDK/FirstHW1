pipeline{
  agent any
  tools{
    maven 'my_maven'
  }
  stages{
    stage ('Build'){
      steps{
        sh 'mvn clean package'
      }
      post{
        success{
          echo "Archiving the artifact"
          archiveArtifacts artifacts: '**/target/*.war'
        }
      }
    }
    stage ('Deploy to tomcat'){
      steps{
      deploy adapters: [tomcat9(path: '', url: 'http://91.198.220.116:8085')], contextPath: '/opt/tomcat2/webapps', war: '**/*.war'
    }
    }

  }

}
