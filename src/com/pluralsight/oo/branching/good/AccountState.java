package com.pluralsight.oo.branching.good;

import java.math.BigDecimal;
import java.util.function.Consumer;

/**
 * @author msanchez
 *
 */
public interface AccountState {
	/**
	 * @param amount
	 * @param addToBalance
	 * @return
	 */
	AccountState deposit(BigDecimal amount, Consumer<BigDecimal> addToBalance);

	/**
	 *
	 * @param balance
	 * @param amount
	 * @param subtractFromBalance
	 * @return
	 */
	AccountState withdraw(BigDecimal balance, BigDecimal amount, Consumer<BigDecimal> subtractFromBalance);

	/**
	 *
	 * @return
	 */
	AccountState freezeAccount();

	/**
	 *
	 * @return
	 */
	AccountState holderVerified();

	/**
	 *
	 * @return
	 */
	AccountState closeAccount();
}
