package lab_2;

import java.util.Scanner;

public class lab_2_Ship {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int length, weight, fuelType, serviceYears;

		System.out.println("Enter ship parameters: ");
		System.out.print("Length (in meters): ");
		length = in.nextInt();

		System.out.print("Weight (in tons): ");
		weight = in.nextInt();

		System.out.print("Fuel Type (1-4): ");
		fuelType = in.nextInt();

		System.out.print("Service Years: ");
		serviceYears = in.nextInt();

		Ship.ShipBuilder shipBuilder = new Ship.ShipBuilder();
		Ship ship = shipBuilder
				.setLength(length)
				.setWeight(weight)
				.setFuelType(fuelType)
				.setServiceYears(serviceYears)
				.build();

		// Виведення результатів
		System.out.println("Ship information:");
		System.out.println("Length: " + ship.getLength() + " meters");
		System.out.println("Weight: " + ship.getWeight() + " tons");
		System.out.println("Fuel Type: " + ship.getFuelType());
		System.out.println("Service Years: " + ship.getServiceYears());

		in.close();
	}
}
