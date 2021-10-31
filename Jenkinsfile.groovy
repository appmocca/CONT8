#!/usr/bin/env groovy
// 镜像仓库地址需要时打开
// 使用需要下载pipline
def registry = "xxx"
def project = "max"
def app_name = "java-demo"
def image_name = "springboot-node"
def git_address = "https://github.com/appmocca/CONT8.git"
pipeline {
    agent any
    stages {
        stage('Pulling code from github'){
            steps {
             sh 'git clone https://github.com/appmocca/CONT8.git'
            }
        }

        stage('Code compile'){
           steps {
             sh 'npm --version'
           }
        }

        stage('Build docker'){
           steps {
                sh 'npm --version'
                }
           } 
        }

        stage('Docker implement'){
           steps {
              sh 'npm --version'
            }
        }
    }