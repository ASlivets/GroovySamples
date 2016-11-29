@Grab('org.codehaus.groovy.modules:http-builder-ng:0.10.2')

def httpBin = groovyx.net.http.HttpBuilder.configure {
    request.uri = 'http://sq.services.ggs-hh.net/api/resources'
}.get{}

httpBin.findAll { it.creationDate.contains '2016-11-1' }.each{ println it.key}
