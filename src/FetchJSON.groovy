import groovy.json.JsonSlurper

@Grab('org.codehaus.groovy.modules:http-builder-ng:0.10.2')

def httpBin = groovyx.net.http.HttpBuilder.configure {
    request.uri = 'http://localhost:8080/'
}.get{}

def jsonSlurper = new JsonSlurper()
def object = jsonSlurper.parseText(new String(httpBin as byte[]))

println object.get('addresses').find { it.city == 'Hamburg' }.postalCode
