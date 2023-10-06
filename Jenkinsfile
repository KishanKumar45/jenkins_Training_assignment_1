pipeline {
    agent any
    tools{
        maven "MVN_HO"
    }
    stages{
            stage('Stage-1 Checkout code') {
                steps {
               git branch: 'main', changelog: false, poll: false, url: 'https://github.com/KishanKumar45/jenkins_Training_assignment_1'
                }
            }
             stage('Stage-2 compile code') {
                steps {
                bat "mvn compile"
                }
            }
            stage('Stage-3 run Test Cases') {
                steps {
                bat "mvn test"
                }
            }
            stage('Stage-4 -Create Build') {
                steps {
                bat "mvn package"
                }
            }
    }
 }
