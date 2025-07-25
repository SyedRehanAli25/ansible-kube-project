def call(String message, String webhookUrl) {
    def payload = [text: message]
    def jsonPayload = new groovy.json.JsonBuilder(payload).toString()

    httpRequest httpMode: 'POST',
                contentType: 'APPLICATION_JSON',
                requestBody: jsonPayload,
                url: webhookUrl
}
