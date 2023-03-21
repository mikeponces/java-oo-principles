package com.pluralsight.oo.branching.bad;

import java.math.BigDecimal;

public class Account {
	private boolean isVerified;
	private boolean isClosed;
	private BigDecimal balance;
	private boolean isFrozen;
	// callback functions when unfreezing account
	private AccountUnfrozen onUnfrozen;

	public Account(AccountUnfrozen onUnfrozen) {
		this.balance = BigDecimal.ZERO;
		this.onUnfrozen = onUnfrozen;
	}

	public void holderVerified() {
		this.isVerified = true;
	}

	public void closeAccount() {
		this.isClosed = true;
	}

	public void freezeAccount() {
		if (this.isClosed || !this.isVerified)
			return;
		this.isFrozen = true;
	}

	public void deposit(BigDecimal amount) {
		if (this.isClosed)
			return;
		if (this.isFrozen) {
			this.isFrozen = false;
			this.onUnfrozen.handle();
		}
		this.balance = this.balance.add(amount);
	}

	// Needs identity verification
	public void withdraw(BigDecimal amount) {
		if (!this.isVerified || this.isClosed)
			return;

		if (this.isFrozen) {
			this.isFrozen = false;
			this.onUnfrozen.handle();
		}
		this.balance = this.balance.subtract(amount);
	}
}
