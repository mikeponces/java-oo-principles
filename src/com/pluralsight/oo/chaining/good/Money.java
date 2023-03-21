package com.pluralsight.oo.chaining.good;

import java.math.BigDecimal;

public class Money implements Comparable<Money> {

	public static final Money ZERO = new Money(BigDecimal.ZERO);
	private BigDecimal amount;

	public Money(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	@Override
	public int compareTo(Money money) {
		return this.amount.compareTo(money.getAmount());
	}
}
