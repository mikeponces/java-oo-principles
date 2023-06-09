package com.pluralsight.oo.flexibility.good;

public class DeviceStatus {
	public static DeviceStatus allFine() {
		return new DeviceStatus(1);
	}

	public static DeviceStatus notOperational() {
		return new DeviceStatus(2);
	}

	public static DeviceStatus visiblyDamaged() {
		return new DeviceStatus(3);
	}

	public static DeviceStatus sensorFailed() {
		return new DeviceStatus(4);
	}

	private int representation;

	private DeviceStatus(int representation) {
		this.representation = representation;
	}

	public DeviceStatus add(DeviceStatus status) {
		return new DeviceStatus(this.representation | status.representation);
	}

	@Override
	public boolean equals(Object other) {
		return other instanceof DeviceStatus && this.equals((DeviceStatus) other);
	}

	public boolean equals(DeviceStatus other) {
		return this.representation == other.representation;
	}

	@Override
	public int hashCode() {
		return this.representation;
	}

	@Override
	public String toString() {
		return String.valueOf(this.representation);
	}

}
