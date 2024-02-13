def call() {
    sh 'trivy image ibrahimben/youtube:latest > trivyimage.txt'
}
