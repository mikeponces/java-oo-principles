package com.pluralsight.oo.nullcheck.bad;

import java.time.LocalDate;

public class Demo {
	LocalDate today = LocalDate.now();

	public void claimWarranty(Article article, boolean isInGoodCondition, boolean isNonOperational) {
		// faulty product
		if (isInGoodCondition && isNonOperational && article.getMoneyBackGuarantee() != null
				&& article.getMoneyBackGuarantee().isValidOn(today)) {
			System.out.println("Offer money back.");
		}
		// non-functioning (within warranty)
		if (isNonOperational && article.getExpressWarranty() != null && article.getExpressWarranty().isValidOn(today)) {
			System.out.println("Offer repair.");
		}
	}
}
