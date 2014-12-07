class Money {
	private int amount
	private String currency

	Money (amountValue, currencyValue) {
		amount = amountValue
		currency = currencyValue
	}

	boolean equals (Object other) {
		if (null == other)
			return false
		if (! (other instanceof Money)) return false
		if (currency != other.currency) return false
		if (amount!= other.amount)
			return false
		return true
	}
	int hashCode() {
		amount.hashCode() + currency.hashCode()
	}

	Money plus (Money other) {
		if (null == other)
			return null
		if (other.currency != currency) {
			throw new IllegalArgumentException("cannot add $other.currency to $currency")
		}
		return new Money(amount + other.amount, currency)
	}
	String toString(){
		return "${this.currency}${this.amount}"
	}
}

def buck = new Money(1, '$')
assert buck
assert buck == new Money(1, '$')
assert buck + buck == new Money(2, '$')
println "${buck} + ${buck} + ${buck} = ${(buck + buck + buck)}"

