def call(String dockerHubUsername, String imageName) {

    sh "docker build --build-arg REACT_APP_RAPID_API_KEY=66c3557e9cmshc6c39b5457ada59p1ffd83jsn3e9f3a9c9a3e -t ${imageName} ."
    sh "docker tag ${imageName} ${dockerHubUsername}/${imageName}:latest"
    withDockerRegistry([url: 'https://index.docker.io/v1/', credentialsId: 'docker']) {
        sh "docker push ${dockerHubUsername}/${imageName}:latest"
    }
}
