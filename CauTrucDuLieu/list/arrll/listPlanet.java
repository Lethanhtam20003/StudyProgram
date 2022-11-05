package arrll;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.Random;

public class listPlanet {
	private ListIterator<Planet> dsHT = null;
	private int size = 0;

	public listPlanet(Planet[] ds) {
		super();
		this.size = ds.length;
		this.dsHT = Arrays.asList(ds).listIterator();
	}

	@Override
	public String toString() {
		String result = "";

		refresh();
		while (dsHT.hasNext()) {
			result += dsHT.next() + "\n";
		}

		return result;
	}

	private void refresh() {
		// TODO Auto-generated method stub
		while (dsHT.hasPrevious()) {
			dsHT.previous();
		}
	}

	public Planet maxArea() {
		refresh();
		Planet result = dsHT.next();
		while (dsHT.hasNext()) {
			Planet temp = dsHT.next();
			if (result.getArea() < temp.getArea())
				result = temp;
		}

		return result;
	}

	public Planet maxWeight() {
		refresh();
		Planet result = dsHT.next();
		while (dsHT.hasNext()) {
			Planet temp = dsHT.next();
			if (result.getWeight() < temp.getWeight())
				result = temp;
		}

		return result;
	}

	public Planet maxCycle() {
		refresh();
		Planet result = dsHT.next();
		while (dsHT.hasNext()) {
			Planet temp = dsHT.next();
			if (result.getCycle() < temp.getCycle())
				result = temp;
		}

		return result;
	}

	public Planet findPlanet(String name) {
		refresh();
		Planet result = null;
		while (dsHT.hasNext()) {
			Planet temp = dsHT.next();
			if (temp.getEnglishName().equals(name) || temp.getEnglishName().equals(name))
				result = temp;
		}

		return result;
	}

	public int countPlanet() {
		refresh();
		int result = 0;
		while (dsHT.hasNext()) {
			dsHT.next();
			result++;
		}

		refresh();
		return result;
	}

	public String randomInformationPlanetString() {
		refresh();
		String result = "";
		Planet p = dsHT.next();
		Random rd = new Random();
		int i = rd.nextInt(countPlanet());
		for (; i > 0; i--) {
			p = dsHT.next();

		}
		int j = rd.nextInt(1, 6);
		result = p.getVietNameseName() + ": ";
		switch (j) {
		case 1:
			result += "englishName: " + p.getEnglishName();
			break;
		case 2:
			result += "vietNameseName: " + p.getVietNameseName();
			break;
		case 3:
			result += "area: " + p.getArea();
			break;
		case 4:
			result += "cycle: " + p.getCycle();
			break;
		case 5:
			result += "Weight: " + p.getWeight();
			break;
		}

		return result;

	}

	public static String  compareTheEarthWithCycle(Planet earth,Planet ht) {
		
		if(earth.getCycle() > ht.getCycle() ) {
			return "earth has cycle than "+ht.getEnglishName();
		}
		if(earth.getCycle() < ht.getCycle() ) {

			return "earth has cycle less "+ht.getEnglishName();
		}
		return "earth has cycle equals "+ht.getEnglishName();
	}

	public static void main(String[] args) {
		Planet earth = new Planet("Trai Dat", "Earth", (510.067420 * Math.pow(10, 6)), (5973.6 * Math.pow(10, 21)),
				365.25696);

		Planet mars = new Planet("sao hoa", "mars", (510.067420 * Math.pow(10, 6)), (5973.6 * Math.pow(10, 21)),
				365.25696);

		Planet jupiter = new Planet("sao moc", "jupiter", (510.067420 * Math.pow(10, 6)), (5973.6 * Math.pow(10, 21)),
				365.25696);

		Planet Saturn = new Planet("Sao Tho", "Saturn", (42.7 * Math.pow(10, 9)), (568.46 * Math.pow(10, 24)),
				10757.7365);
		Planet Venus = new Planet("Sao Kim", "Venus", (460 * Math.pow(10, 6)), (4868.5 * Math.pow(10, 21)), 224.70096);
		listPlanet list = new listPlanet(new Planet[] { earth, Saturn, Venus, jupiter, mars });

		 System.out.println(list.toString());
		 
		 System.out.println("1: max area: "+list.maxArea());
		 System.out.println("2:max weight:"+list.maxWeight());
		 System.out.println("3: max cycle"+list.maxCycle());
		 System.out.println("4: find planet: "+list.findPlanet("Saturn"));
		 System.out.println("5: get random information of planet: "+list.randomInformationPlanetString());
		 System.out.println("6: compare the earth with venus: "+compareTheEarthWithCycle(earth,Venus));
	}

}
