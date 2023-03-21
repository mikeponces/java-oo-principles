package com.pluralsight.oo.nullcheck.good;

public class Article {
	private Warranty moneyBackGuarantee;
	private Warranty expressWarranty;

	public Article(Warranty moneyBackGuarantee, Warranty expressWarranty) {
		if ((moneyBackGuarantee == null) || (expressWarranty == null)) {
			throw new IllegalArgumentException();
		}

		this.moneyBackGuarantee = moneyBackGuarantee;
		this.expressWarranty = expressWarranty;
	}

	public Warranty getMoneyBackGuarantee() {
		return this.moneyBackGuarantee;
	}

	public Warranty getExpressWarranty() {
		return this.expressWarranty;
	}

	public Article withVisibleDamage() {
        return new Article(Warranty.VOID, this.expressWarranty);
    }

    public Article nonOperational() {
        return new Article(this.moneyBackGuarantee, this.expressWarranty);
    }
}
