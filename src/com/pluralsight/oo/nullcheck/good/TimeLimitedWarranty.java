package com.pluralsight.oo.nullcheck.good;

import java.time.LocalDate;

public class TimeLimitedWarranty implements Warranty {

	private LocalDate issuedOn;
	private int dayLimit;

	public TimeLimitedWarranty(LocalDate issuedOn, int dayLimit) {
		this.issuedOn = issuedOn;
		this.dayLimit = dayLimit;
	}

	@Override
	public Warranty on(LocalDate date) {
		return date.compareTo(issuedOn.plusDays(dayLimit)) > 0 ? Warranty.VOID : this;
	}

}
