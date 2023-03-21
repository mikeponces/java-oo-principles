package com.pluralsight.oo.nullcheck.bad;

import java.time.LocalDate;

public interface Warranty {
	boolean isValidOn(LocalDate date);
}
