pipeline {
    agent any

    stages {
        stage('pull code') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: '6619c029-9a5e-42ab-b572-7fe279d6b076', url: 'https://gitee.com/jankin_wu/springboot_demo.git']]])
            }
        }
        stage('build project') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('publish project') {
            steps {
                deploy adapters: [tomcat9(credentialsId: 'fabbd0ab-c51b-44ef-842b-c9c70b03884d', path: '', url: 'http://192.168.159.100:8080')], contextPath: '/springboot-demo', war: 'target/*.war'
            }
        }
    }
}
