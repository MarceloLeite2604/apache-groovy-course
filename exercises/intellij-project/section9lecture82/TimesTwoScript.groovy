Integer.metaClass.timesTwo = { ->
    multiply(2)
}

Expando euller;



int myInt = 256

println myInt.timesTwo()

class IntegerCategory {
    Integer timesTwo(Integer i) {
        i *= 2
    }
}

use(IntegerCategory) {
    int myOtherInt = 7
    println myOtherInt.timesTwo()
}