// vars/notifySlack.groovy

def call(String message, String webhookUrl) {
    def payload = [text: message]
    def jsonPayload = new groovy.json.JsonBuilder(payload).toString()

    httpRequest(
        httpMode: 'POST',
        url: webhookUrl,
        contentType: 'APPLICATION_JSON',
        requestBody: jsonPayload
    )
}

