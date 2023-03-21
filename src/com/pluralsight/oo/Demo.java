package com.pluralsight.oo;

import java.util.Optional;

/**
 * @author msanchez
 *
 */
public class Demo {
	class LackFlexibility {
		// NOT FLEXIBLE
		public int sumNotFlexible(int[] values) {
			int sum = 0;
			for (int value : values) {
				sum += value;
			}
			return sum;
		}

		// Customer: "I only want odd numbers"
		public int sumOdd(int[] values) {
			int sum = 0;
			for (int value : values) {
				if (value % 2 != 0) {
					sum += value;
				}
			}
			return sum;
		}

		// Customer: "I only want odd numbers SOMETIMES"
		public int sumOddSometimes(int[] values, boolean oddNumbersOnly) {
			int sum = 0;

			for (int value : values) {
				if (oddNumbersOnly && value % 2 != 0) {
					sum += value;
				}
			}

			return sum;
		}

//		public int sum(int[] values, SomeSelector selector) {
//			// change values to an Object
//			// that can take Selector as parameter
//			int sum = values.sum(selector);
//			return sum;
//		}
	}

	class NullChecking {
		public void showIt(String data) {
			String upper;
			if (data == null) {
				upper = null;
			} else {
				upper = data.toUpperCase();
			}
			System.out.println(upper);
		}

		// No nulls, only objects.
		public void showItOptional(Optional<String> data) {
			String upper = data.map(String::toUpperCase).orElse("none");
			System.out.println(upper);
		}
	}
}