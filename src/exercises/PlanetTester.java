package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Planet implements Comparable<Planet> {

	private String name;
	private int distanceFromSun; // Average distance in millions of kilometers
	private double volume; // Relative to Earth which is 1.0
	private int satellites;

	public Planet(String name, int distanceFromSun, double volume,
			int satellites) {
		super();
		this.name = name;
		this.distanceFromSun = distanceFromSun;
		this.volume = volume;
		this.satellites = satellites;
	}

	@Override
	public String toString() {
		return String.format(
				"%nName: %s%nDistance from sun (in millions of kilometers): %d%nVolume relative to earth: %.2f%nNumber of satellites (moons): %d%n",
				name, distanceFromSun, volume, satellites);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDistanceFromSun() {
		return distanceFromSun;
	}

	public void setDistanceFromSun(int distanceFromSun) {
		this.distanceFromSun = distanceFromSun;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public int getSatellites() {
		return satellites;
	}

	public void setSatellites(int satellites) {
		this.satellites = satellites;
	}

}

public class PlanetTester {
	public static void main(String arguments[]) {

		List<Planet> planets = new ArrayList<Planet>();

		planets.add(new Planet("Earth", 152, 1.0, 1));
		planets.add(new Planet("Jupiter", 797, 1300.0, 7));
		planets.add(new Planet("Mars", 228, 0.15, 2));
		planets.add(new Planet("Mercury", 58, 0.054, 0));
		planets.add(new Planet("Neptune", 4500, 57.7, 14));
		planets.add(new Planet("Saturn", 1400, 764.0, 7));
		planets.add(new Planet("Uranus", 2900, 63.0, 7));
		planets.add(new Planet("Venus", 108, 0.866, 5));

		System.out.print(planets.toString().replaceAll(",", "") + "\n");

		System.out.println();

		System.out.println(
				"A L L   P L A N E T S   B E G I N N I N G   W I T H   T H E   L E T T E R   M:");

		planets.stream().filter(x -> x.getName().startsWith("M"))
				.collect(Collectors.toList()).forEach(System.out::println);

		System.out.println(
				"A L L   P L A N E T S   I N   D E S C E N D I N G   O R D E R   B Y   V O L U M E:");
		planets.stream()
				.sorted((x, y) -> Double.compare(y.getVolume(), x.getVolume()))
				.collect(Collectors.toList()).forEach(System.out::println);

		System.out.println(
				"A L L   P L A N E T S   I N   A L P H A B E T I C A L   O R D E R:");
		planets.stream()
				.sorted((x, y) -> x.getName().compareToIgnoreCase(y.getName()))
				.collect(Collectors.toList()).forEach(System.out::println);

		System.out.println(
				"A L L   P L A N E T S   I N   A S C E N D I N G   O R D E R   B Y   D I S T A N C E:");
		planets.stream()
				.sorted((x, y) -> Integer.compare(x.getDistanceFromSun(),
						y.getDistanceFromSun()))
				.collect(Collectors.toList()).forEach(System.out::println);
	}
}
