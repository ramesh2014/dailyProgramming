package daily.samples;

import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
 
public class NPE 
{
	
	//https://docs.oracle.com/javase/7/docs/api/org/w3c/dom/Node.html
    public static void main(String[] args) 
    {
//        final String xmlStr = "<employees>" + 
//                                "   <employee id=\"101\">" + 
//                                "        <name>Lokesh Gupta</name>" + 
//                                "       <title>Author</title>" + 
//                                "   </employee>" + 
//                                "   <employee id=\"102\">" + 
//                                "        <name>Brian Lara</name>" + 
//                                "       <title>Cricketer</title>" + 
//                                "   </employee>" + 
//                                "</employees>";
        
        final String xmlStr = "<SubmitExpenseReportBatch>\n" + 
        		"            <MobileExpenseReportSVO>\n" + 
        		"               <MobileExpenseReportSVORow>\n" + 
        		"                  <Attribute12>3455 108th Avenue, Seattle WA 98101</Attribute12>\n" + 
        		"                  <Purpose>Demo</Purpose>\n" + 
        		"                  <ExpenseReportDate>2020-05-05</ExpenseReportDate>\n" + 
        		"                  <ReimbursementCurrencyCode>USD</ReimbursementCurrencyCode>\n" + 
        		"                  <MobileExpenseSVO>\n" + 
        		"                     <MobileExpenseSVORow>\n" + 
        		"                        <ExpenseTemplateId>10024</ExpenseTemplateId>\n" + 
        		"                        <ExpenseTypeId>10005</ExpenseTypeId>\n" + 
        		"                        <ReceiptAmount>200.0</ReceiptAmount>\n" + 
        		"                        <ReceiptCurrencyCode>USD</ReceiptCurrencyCode>\n" + 
        		"                        <ReceiptConversionRate>1.0</ReceiptConversionRate>\n" + 
        		"                        <Location>United States</Location>\n" + 
        		"                        <LocationId>10064</LocationId>\n" + 
        		"                        <MerchantName>Demo</MerchantName>\n" + 
        		"                        <Justification>Demo</Justification>\n" + 
        		"                        <StartDate>2020-05-05</StartDate>\n" + 
        		"                        <EndDate>2020-05-05</EndDate>\n" + 
        		"                        <ExpenseSource>CASH</ExpenseSource>\n" + 
        		"                        <ExpenseCategoryCode>BUSINESS</ExpenseCategoryCode>\n" + 
        		"                        <ExpenseTypeCategoryCode>AIRFARE</ExpenseTypeCategoryCode>\n" + 
        		"                        <PersonalAmount>0.0</PersonalAmount>\n" + 
        		"                        <TravelType>Domestic</TravelType>\n" + 
        		"                        <TicketClassCode>First</TicketClassCode>\n" + 
        		"                        <DestinationFrom>New Jersey</DestinationFrom>\n" + 
        		"                        <DestinationTo>California</DestinationTo>\n" + 
        		"                        <VatCode>DE VAT ZERO</VatCode>\n" + 
        		"                        <EndExpenseDate>2020-05-05</EndExpenseDate>\n" + 
        		"                        <MobileExpenseDistributionSVO>\n" + 
        		"                           <MobileExpenseDistributionSVORow>\n" + 
        		"                              <PJC_PROJECT_ID>4333</PJC_PROJECT_ID>\n" + 
        		"                              <PJC_TASK_ID>54900</PJC_TASK_ID>\n" + 
        		"                           </MobileExpenseDistributionSVORow>\n" + 
        		"                        </MobileExpenseDistributionSVO>\n" + 
        		"                     </MobileExpenseSVORow>\n" + 
        		"                  </MobileExpenseSVO>\n" + 
        		"               </MobileExpenseReportSVORow>\n" + 
        		"            </MobileExpenseReportSVO>\n" + 
        		"         </SubmitExpenseReportBatch>";
        		
        //Use method to convert XML string content to XML Document object
        Node doc = convertStringToXMLDocument( xmlStr );
         
        //Verify XML document is build correctly
        System.out.println(doc.getFirstChild().getNodeName());
        
        doc = doc.getFirstChild();
        
        System.out.println(doc.getNodeName());
    }
 
    private static Node convertStringToXMLDocument(String xmlString) 
    {
        //Parser that produces DOM object trees from XML content
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
         
        //API to obtain DOM Document instance
        DocumentBuilder builder = null;
        try
        {
            //Create DocumentBuilder with default configuration
            builder = factory.newDocumentBuilder();
             
            //Parse the content to Document object
            Node doc = builder.parse(new InputSource(new StringReader(xmlString)));
            return doc;
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        return null;
    }
}