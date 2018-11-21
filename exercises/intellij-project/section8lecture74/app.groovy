class Tweet {
    String user
    String message
    int retweets = 0
    int favorites = 0

    def retrieveMentions() {
        message.findAll(/@[\w]+/)
    }

    List retrieveHashtags() {
        message.findAll(/#[\w]+/)
    }
}

def tweet = new Tweet(user:"@marceloLeite", message: "I bless the rains down in @Africa. #blessed #toto")
println tweet.retrieveMentions()
println tweet.retrieveHashTags()