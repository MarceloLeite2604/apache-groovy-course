@Grapes(
        @Grab(group = 'org.mongodb', module = 'mongo-java-driver', version = '3.9.0')
)

import com.mongodb.client.MongoCollection
import com.mongodb.client.MongoClients
import com.mongodb.client.MongoDatabase
import com.mongodb.client.internal.MongoClientImpl
import groovy.json.JsonBuilder
import groovy.json.JsonSlurper
import org.bson.Document


MongoClientImpl mongoClient = MongoClients.create("mongodb://groovy:alphabeta@localhost:27017")
MongoDatabase mongoDatabase = mongoClient.getDatabase("groovyDb")
MongoCollection<Document> twittersCollection = mongoDatabase.getCollection("twitters")

Map twitter = [
        user : "@marceloLeite",
        message: "This is a twitter message for @pribibiana. #test #groovy",
        mentions: 1,
        hashtags: 2,
        replies: 0,
        date : new Date() ]

Document document = new Document(twitter)
twittersCollection.insertOne(document)

File outputFile = new File("../section13lecture118/data.csv")
outputFile.write("USER;MESSAGE;MENTIONS;HASHTAGS;REPLIES;DATE\n")

twittersCollection.find().each {
    outputFile.append(it.user+";")
    outputFile.append(it.message+";")
    outputFile.append(it.mentions+";")
    outputFile.append(it.hashtags+";")
    outputFile.append(it.replies+";")
    outputFile.append(it.date)
    outputFile.append('\n')
}