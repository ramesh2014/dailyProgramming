package daily.samples.certification;

public class GarbageCollectionEx1 {
	private String str;
	GarbageCollectionEx1(String str) { 
		this.str = str; }
	  public void finalize() throws Throwable {
	    System.out.print(str);
	    super.finalize();
	  }
	  public void concat(String str2) {
	   this.str.concat(str2);
	  }
	
	public static void main(String[] args) {
	    new GarbageCollectionEx1("A").concat("B");
	    System.gc();
	  }
}
