package daily.samples.certification.streams;

import java.util.List;

public class StreamFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var cities = List.of(new City("Berlin", 3_520_000), new City("Hamburg", 1_790_000),
				new City("Munich", 1_450_000), new City("Cologne", 1_060_000), new City("Frankfurt", 730_000)); //underscore in number is allowed.
		
		//cities.stream().filter(city -> city.getPopulation() < 1_000_000).findFirst().orElse(new City("Not Found", 0));
		
		//findFirst -> Stream class -> Returned Optional
		//orElse -> Optional class 
		//Question is about, what is the origin of orElse ?
		
		
		System.out.println(cities.stream().filter(city -> city.getPopulation() < 1_000_000).findFirst().orElse(new City("Not Found", 0)).getPopulation());
	}

}

class City{
	
	private String name;
	private double value;
	
	City(String name, double value){
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	double getPopulation() {
		return this.value;
	}
}