package com.pluralsight.oo.chaining.bad;

import java.util.List;

public class Demo {
	public Painter findCheapest(double sqMeters, List<Painter> painters) {
        Money lowestCost = Money.ZERO;
        Painter winner = null;

        for(Painter candidate: painters) {
            if(candidate.isAvailable()) {
                Money cost = candidate.estimateCompensation(sqMeters);

                if(winner == null || cost.compareTo(lowestCost) <= 0) {
                    winner = candidate;
                    lowestCost = cost;
                }
            }
        }

        return winner;
    }

	public static void main(String[] args) {
		new Demo().findCheapest(0, null);
	}
}
