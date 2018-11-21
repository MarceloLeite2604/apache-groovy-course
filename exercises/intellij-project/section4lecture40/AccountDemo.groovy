class Account {
    BigDecimal balance = 0.0
    String type

    BigDecimal deposit(BigDecimal value) {
        balance += value
    }

    BigDecimal withdraw(BigDecimal value) {
        balance -= value
    }

    BigDecimal plus(Account other) {
        // new Account(type: this.type + other.type, balance: this.balance + other.balance)
        this.balance + other.balance
    }
}

Account checking = new Account(type: "Checking")
checking.deposit(100.0)
Account savings = new Account(type: "Savings")
savings.deposit(50.0)

BigDecimal total = checking + savings
println total