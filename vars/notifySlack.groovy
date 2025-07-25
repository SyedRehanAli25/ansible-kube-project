def call(String message, String webhookUrl, String channel = null) {
    def payload = [
        text: message
    ]
    if (channel) {
        payload.channel = channel
    }

    def jsonPayload = groovy.json.JsonOutput.toJson(payload)

    httpRequest(
        httpMode: 'POST',
        contentType: 'APPLICATION_JSON',
        requestBody: jsonPayload,
        url: webhookUrl,
        validResponseCodes: '200'
    )
}
