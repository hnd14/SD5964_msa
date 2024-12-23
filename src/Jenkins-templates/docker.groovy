def buildDockerImage(String directory, String imageName, String imageTag) {
    echo "Building Docker image for ${imageName}:${imageTag} in directory ${directory}..."
    
    dir(directory) {
        // Build the Docker image using the specified image name and tag
        docker.build("${imageName}:${imageTag}", '.')
    }
}

return this