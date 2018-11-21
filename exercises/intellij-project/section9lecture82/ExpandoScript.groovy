Expando wallet = new Expando()

wallet.moneyInside = 0.25
wallet.cards = ["Visa", "Master", "CityBank"]
wallet.color = "black"
wallet.material = "leather"
wallet.warning = {
    println "Don't touch my wallet!"
}

println "Total amount of money inside my wallet is US\$ $wallet.moneyInside."
wallet.warning()

class Button {

    String function = "nothing happens"

    def whatHappens() {
        "If I press this button $function"
    }
}

Button coffeeButton = new Button()

println coffeeButton.whatHappens()
coffeeButton.function = "I get hot black tasty coffee"
println coffeeButton.whatHappens()

Button.metaClass.whatReallyHappens = { ->
    whatHappens() + ", but $consequence."
}
coffeeButton.metaClass.consequence = "a goat appears standing by my side"

println coffeeButton.whatReallyHappens()