def call(String message, String webhookUrl) {
    sh """
        curl -X POST -H 'Content-type: application/json' \
        --data '{"text": "${message}"}' ${webhookUrl}
    """
}
