pipeline {
    agent any
     stage('Running the Test') {
                steps {
                bat label:'',script:'mvn -version'
                }
            }
            stage('Running the Test') {
                steps {
                bat label:'',script:'mvn clean test'
                }
            }
    }
}
