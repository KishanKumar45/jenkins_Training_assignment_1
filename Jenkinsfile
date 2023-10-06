pipeline {
    agent any

    stages {
        stage('Maven Verion') {
            steps {
              bat label:'',script:'mvn -v'
            }
        }

            stage('Running the Test') {
                steps {
                bat label:'',script:'mvn clean test'
                }
            }
    }
}
