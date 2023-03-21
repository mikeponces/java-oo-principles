package com.pluralsight.oo.flexibility.good;

public class Demo {
	public static void main(String[] args) {
		System.out.println(DeviceStatus.notOperational().add(DeviceStatus.allFine()));
		System.out.println(DeviceStatus.visiblyDamaged());
	}
}
