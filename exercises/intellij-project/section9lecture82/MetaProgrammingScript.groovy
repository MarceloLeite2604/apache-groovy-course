class Mosquito {

    String adjective = "small"

    Object invokeMethod(String name, Object arguments) {
        println "Someone requested the method $name with the arguments $arguments."
    }

    Object getProperty(String name) {
        println "Someone is insterested in the property \"$name\"."
        metaClass.getProperty(this, name)
    }

    void setProperty(String name, Object value) {
        println "Watch out! Someone is inserting the value \"$value\" on property \"$name\"."
        metaClass.setProperty(this, name, value)
    }

    def whatThisMosquitoIs() {
        "This mosquito is $adjective."
    }
}

Mosquito mosquito = new Mosquito()

println mosquito.adjective
mosquito.adjective = "noisy"
println mosquito.whatThisMosquitoIs()