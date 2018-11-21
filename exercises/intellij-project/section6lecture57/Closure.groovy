def function(closure) {
    closure()
}

def myClosure = {
    println "This has been printed by \"myClosure\" closure"
}

function(myClosure)

List myList = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

myList.each {
    println it
}

Map myMap = [food: "pork", drink: "beer", desert: "pudding"]

myMap.each { entry ->
    println "For ${entry.key} we have ${entry.value}."
}

myMap.each { key, value ->
    println "I always have $value for $key."
}

def order =  { String person, String item, String request ->
    println "$person, I would like $item for $request please."
}

def waiterOrder = order.curry("Waiter")
def waiterDrinkOrder = waiterOrder.rcurry("drink")

waiterOrder("breadsticks", "apetizer")
waiterDrinkOrder("tap water")


List myItems = ["Computer", "Cellphone", "Keys", "Car"]

String selectedItem = myItems.find {
    it.contains("o")
}

println selectedItem

List selectedItems = myItems.findAll {
    it.contains("o")
}

println selectedItems

println myItems.any {
    it.contains("y") // Keys
}

println myItems.any {
    it.contains("w")
}

println myItems.every {
    it.size() >= 3
}

println myItems.every {
    it.contains("e")
}

Map groupedItemsMap = myItems.groupBy {
    it.charAt(0)
}
println groupedItemsMap