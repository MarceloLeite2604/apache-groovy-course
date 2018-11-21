import groovy.json.JsonBuilder
import groovyx.net.http.ContentType
@Grab('org.codehaus.groovy.modules.http-builder:http-builder:0.7')
import groovyx.net.http.RESTClient

String base = "https://randomuser.me"

RESTClient spotifyClient = new RESTClient(base)
spotifyClient.contentType = ContentType.JSON

parameters = [nat: "BR"]

spotifyClient.get(path: "/api/", query: parameters) { response, json ->
    println response.status
    JsonBuilder jsonBuilder = new JsonBuilder(json)
    println jsonBuilder.toPrettyString()
}
