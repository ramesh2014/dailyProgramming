package daily.samples;

public class RegularExpressionExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String xmlString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + 
				"<params>\n" + 
				"    <param>\n" + 
				"        <ExpenseMobileService>\n" + 
				"            <FindProjectTask c=\"true\"> 1234  \n \t \t \n 343 <FindProjectTask/>\n" + 
				"        </ExpenseMobileService>\n" + 
				"    </param>\n" + 
				"</params>";
		String replacedString = xmlString.replaceAll("((?)>(\\s*)<)", "><");
		System.out.println(replacedString);
		
	}
}
