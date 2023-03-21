package com.pluralsight.oo.nullcheck.good;

import java.time.LocalDate;

public class VoidWarranty implements Warranty {

	@Override
	public Warranty on(LocalDate date) {
		return this;
	}

	@Override
	public void claim(Runnable action) {
		// DO NOTHING
	}
}
