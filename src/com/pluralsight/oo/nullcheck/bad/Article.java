package com.pluralsight.oo.nullcheck.bad;

public class Article {
	private Warranty moneyBackGuarantee;
	private Warranty expressWarranty;

	public Article(Warranty moneyBackGuarantee, Warranty expressWarranty) {
		this.moneyBackGuarantee = moneyBackGuarantee;
		this.expressWarranty = expressWarranty;
	}

	public Warranty getMoneyBackGuarantee() {
		return this.moneyBackGuarantee;
	}

	public Warranty getExpressWarranty() {
		return this.expressWarranty;
	}
}
