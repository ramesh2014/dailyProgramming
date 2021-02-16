package daily.samples.certification.basics;

public class StringBufferEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     String s = "";
     StringBuffer sb1 = new StringBuffer("hi");
     StringBuffer sb2 = new StringBuffer("hi");
     StringBuffer sb3 = new StringBuffer(sb2);
     StringBuffer sb4 = sb3;
     if(sb1.equals(sb2)) s += "1 ";
     if(sb2.equals(sb3)) s += "2 ";
     if(sb3.equals(sb4)) s += "3 ";
     String s2 = "hi";
     String s3 = "hi";
     String s4 = s3;
     if(s2.equals(s3)) s += "4 ";
     if(s3.equals(s4)) s += "5 ";
     System.out.println(s);
   
	}

}
