package daily.samples;

import java.util.ArrayList;
import java.util.List;

public class RQ12A15 {
	public static void main(String[] args) { 
		doIt1(); 
		doIt2(); 
	}

public static void doIt1() { 
	List<StringBuilder> sbListOne = new ArrayList<>(); 
	sbListOne.add(new StringBuilder("Anna")); 
	sbListOne.add(new StringBuilder("Ada")); 
	sbListOne.add(new StringBuilder("Bob")); 
	List<StringBuilder> sbListTwo = new ArrayList<>(sbListOne); 
	sbListOne.add(null);
	sbListTwo.get(1).reverse(); 
	System.out.println(sbListOne); 
 } 
public static void doIt2() 
{ 
	List<String> listOne = new ArrayList<>(); 
	listOne.add("Anna"); 
	listOne.add("Ada"); 
	listOne.add("Bob"); 
	List<String> listTwo = new ArrayList<>(listOne); 
	String strTemp = listOne.get(0);
    listOne.set(0, listOne.get(listOne.size()-1)); 
    listOne.set(listOne.size()-1, strTemp); 
    System.out.println(listTwo); 
 }
}