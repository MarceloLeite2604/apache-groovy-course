class Account {
    BigDecimal balance = 0.0

    BigDecimal deposit(BigDecimal amount) {
        if ( amount < 0 ) {
            throw new Exception("The amount of $amount is lower than zero.")
        }
        balance += amount
    }

    BigDecimal deposit(List<BigDecimal> amounts) {
        for ( amount in amounts ) {
            deposit(amount)
        }
        balance
    }
}

Account account = new Account()

println account.deposit(15.0)
println account.deposit([20, 5.5, 10, 2.25])