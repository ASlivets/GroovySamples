@Grab('org.codehaus.groovy.modules:http-builder-ng:0.10.2')

def httpBin = groovyx.net.http.HttpBuilder.configure {
    request.uri = 'http://localhost:8080/'
}.get{}

println (new String(httpBin as byte[]))
