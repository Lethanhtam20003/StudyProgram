package arrll;

public class Planet {
	private String vietNameseName;
	private String englishName;
	private double cycle;
	private double area;
	private double weight;

	public Planet(String vietNameseName, String englishName, double cycle, double area, double weight) {
		this.vietNameseName = vietNameseName;
		this.englishName = englishName;
		this.cycle = cycle;
		this.area = area;
		this.weight = weight;
	}
	

	
	public String getVietNameseName() {
		return vietNameseName;
	}



	public void setVietNameseName(String vietNameseName) {
		this.vietNameseName = vietNameseName;
	}



	public String getEnglishName() {
		return englishName;
	}



	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}



	public double getCycle() {
		return cycle;
	}



	public void setCycle(double cycle) {
		this.cycle = cycle;
	}



	public double getArea() {
		return area;
	}



	public void setArea(double area) {
		this.area = area;
	}



	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}



	@Override
	public String toString() {
		return "Planet [vietNameseName=" + vietNameseName + ", englishName=" + englishName + ", cycle=" + cycle
				+ ", area=" + area + ", weight=" + weight + "]";
	}



	public static void main(String[] args) {
		Planet earth = new Planet("Trai Dat", "Earth", (510.067420 * Math.pow(10, 6)), (5973.6 * Math.pow(10, 21)),
				365.25696);

		Planet mars = new Planet("sao hoa", "mars", (510.067420 * Math.pow(10, 6)), (5973.6 * Math.pow(10, 21)),
				365.25696);

		Planet jupiter = new Planet("sao moc", "jupiter", (510.067420 * Math.pow(10, 6)), (5973.6 * Math.pow(10, 21)),
				365.25696);

	}

	
}
