package daily.samples;

interface Add{
	String invoke();
}
public class Anonymous {

	Anonymous(){
		
		print(new Add() {
			public String invoke() {
				return "print";
			}
		});
		
	}
	
	void print(Object o) {
		System.out.println(((Add)o).invoke());
	}
	
	public static void main(String[] args) {
		
		Anonymous any = new Anonymous();
		
	}
}
