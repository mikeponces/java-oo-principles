package com.pluralsight.oo.chaining.good;

public class Painter {
	public boolean isAvailable() {
		return false;
	}

	public Money estimateCompensation(double sqMeters) {
		return Money.ZERO;
	}
}
