package com.pluralsight.oo.nullcheck.good;

import java.time.LocalDate;

public interface Warranty {
    Warranty VOID = new VoidWarranty();

    static Warranty lifetime(LocalDate issuedOn) {
        return new LifetimeWarranty(issuedOn);
    }

    Warranty on(LocalDate date);

    default void claim(Runnable action) {
        action.run();
    }
}
