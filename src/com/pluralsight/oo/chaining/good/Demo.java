package com.pluralsight.oo.chaining.good;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Demo {
	public Optional<Painter> findCheapest(double sqMeters, List<Painter> painters) {
		return painters.stream()
	            .filter(Painter::isAvailable)
	            .min(Comparator.comparing(painter -> painter.estimateCompensation(sqMeters)));
    }

	public static void main(String[] args) {
		new Demo().findCheapest(0, null);
	}
}
