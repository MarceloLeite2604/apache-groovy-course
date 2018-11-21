import groovy.transform.Memoized

@Memoized
def howMuchIsOnePlusOne() {
    println "Calculating..."
    sleep(3000)
    2
}

println howMuchIsOnePlusOne()
println howMuchIsOnePlusOne()
println howMuchIsOnePlusOne()
println howMuchIsOnePlusOne()
println howMuchIsOnePlusOne()
