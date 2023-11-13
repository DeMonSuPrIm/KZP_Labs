package lab_2;

public class Ship {
	private int length;
	private int weight;
	private int fuelType;
	private int serviceYears;

	private Ship(int length, int weight, int fuelType, int serviceYears) {
		this.length = length;
		this.weight = weight;
		this.fuelType = fuelType;
		this.serviceYears = serviceYears;
	}

	public int getLength() {
		return length;
	}

	public int getWeight() {
		return weight;
	}

	public int getFuelType() {
		return fuelType;
	}

	public int getServiceYears() {
		return serviceYears;
	}

	public static class ShipBuilder {
		private int length;
		private int weight;
		private int fuelType;
		private int serviceYears;

		public ShipBuilder setLength(int length) {
			this.length = length;
			return this;
		}

		public ShipBuilder setWeight(int weight) {
			this.weight = weight;
			return this;
		}

		public ShipBuilder setFuelType(int fuelType) {
			this.fuelType = fuelType;
			return this;
		}

		public ShipBuilder setServiceYears(int serviceYears) {
			this.serviceYears = serviceYears;
			return this;
		}

		public Ship build() {
			return new Ship(length, weight, fuelType, serviceYears);
		}
	}
}
