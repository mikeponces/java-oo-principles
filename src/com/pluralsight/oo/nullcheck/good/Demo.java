package com.pluralsight.oo.nullcheck.good;

import java.time.LocalDate;

public class Demo {
	LocalDate today = LocalDate.now();

	private void offerMoneyBack() {
		System.out.println("Offer money back.");
	}

	private void offerRepair() {
		System.out.println("Offer repair.");
	}

	public void claimWarranty(Article article) {
		article.getMoneyBackGuarantee().on(today).claim(this::offerMoneyBack);
		article.getExpressWarranty().on(today).claim(this::offerRepair);
		System.out.println("===");
	}

	public void run() {
		LocalDate sellingDate = LocalDate.now().minusDays(20);
		Warranty moneyBack = new TimeLimitedWarranty(sellingDate, 30);
		Warranty warranty = new TimeLimitedWarranty(sellingDate, 365);
		Article item = new Article(moneyBack, warranty);

		this.claimWarranty(item);
		this.claimWarranty(item.withVisibleDamage());
        this.claimWarranty(item.nonOperational());
        this.claimWarranty(item.nonOperational().withVisibleDamage());
        this.claimWarranty(item.withVisibleDamage().nonOperational());
	}

	public static void main(String[] args) {
		new Demo().run();
	}
}
