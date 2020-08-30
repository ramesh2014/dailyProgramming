package daily.samples;

public class ReplaceNewLine {

	public static void main(String[] args) {
		
		String str = "<!--params>\n" + 
				"	<param>\n" + 
				"		<ExpenseMobileService>\n" + 
				"			 <FindMobileExpenseReportApproval/>\n" + 
				"	</ExpenseMobileService>	\n" + 
				"</param>\n" + 
				"</params-->";
		
		System.out.println(str.replace("\n", "")
							  .replace("\t", "")
							  .replace("> ", ">")
							  .replace(" <", "<")
							  .replace("&lt; ", "&lt;")
							  .replace("&gt; ", "&gt;"));
	}
}
