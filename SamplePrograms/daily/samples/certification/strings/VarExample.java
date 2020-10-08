package daily.samples.certification.strings;

import java.util.ArrayList;
import java.util.List;

public class VarExample {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pet p = new Pet("Dog","breed"); 
		p.printPets();
	}

}

class Pet {
	//11
	//private var name;
	private String name;
	//12
	//private var breed = "German Shepherd";
    private String breed = "German Shepherd";
	
	//13
	public final static List petList = new ArrayList<>();
	//14
	//public Pet(String name, var breed){ 
	public Pet(String name, String breed){ 
		//15 
		this.name = name; 
		//16 
		this.breed = breed; 
		//17 
		petList.add(this); 
	//18 
	}
	//19

	public static void printPets(){ 
		//20 
		for(var pet : petList){ 
			//21
			//System.out.println(pet.name +", " +pet.breed); 
			System.out.println(((Pet)pet).name +", " +((Pet)pet).breed); 
			//22 
		} 
		//23 
	}
	//24
}

