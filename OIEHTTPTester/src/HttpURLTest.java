import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Set;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class HttpURLTest {
	
	private final byte[] charset= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=" .getBytes();
    private String cookiesStr = null;
    private ArrayList cookieList;
    private static String selectedService = null;
    private static String defaultTemplateId = null;
	private static String searchName = null;
    private static String toCurrencyCode = null;
    private static String fromCurrencyCode = null;
    private static String expenseDate = null;
	private static String retainConnection = null;
    
    private static void disableSslVerification() {
	    try
	    {
	        TrustManager[] trustAllCerts = new TrustManager[] {new X509TrustManager() {
	            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
	                return null;
	            }
	            public void checkClientTrusted(X509Certificate[] certs, String authType) {
	            }
	            public void checkServerTrusted(X509Certificate[] certs, String authType) {
	            }
	        }
	        };

	        SSLContext sc = SSLContext.getInstance("SSL");
	        sc.init(null, trustAllCerts, new java.security.SecureRandom());
	        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

	        HostnameVerifier allHostsValid = new HostnameVerifier() {
	            public boolean verify(String hostname, SSLSession session) {
	                return true;
	            }
	        };
	        
	        HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
	    } catch (NoSuchAlgorithmException e) {
	        e.printStackTrace();
	    } catch (KeyManagementException e) {
	        e.printStackTrace();
	    }
	}
    
	void getTimedServiceResult(String hostURL, String service, String cookieStr) {
		try{
            System.out.println("");
			HttpURLConnection conn = (HttpURLConnection)(new URL(hostURL+"OIE_MOBILE_EXPENSES").openConnection());
			conn.setRequestMethod("POST");
			 
			conn.addRequestProperty("Cookie", cookieStr);                 
			conn.addRequestProperty("Content-type", "application/xml");
			conn.addRequestProperty("Accept", "application/xml");
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			
			String params = "<params>" +
								"<param>" +
									"<ExpenseMobileService>" +
										"<"+service+"/>" +
									"</ExpenseMobileService>" +
								"</param>" +								
							"</params>";
							
			if ("FindCCTransaction".equals(service)) {
				params = "<params><param><ExpenseMobileService><FindCCTransaction><templateId>" + defaultTemplateId + "</templateId></FindCCTransaction></ExpenseMobileService></param></params>";
			}

			if ("SearchEmployee".equals(service)) {
				params = "<params><param><ExpenseMobileService><SearchEmployee><employeeName>" + searchName + "</employeeName></SearchEmployee></ExpenseMobileService></param></params>";
			}
			
			if ("SearchGuest".equals(service)) {
				params = "<params><param><ExpenseMobileService><SearchGuest><guestName>" + searchName + "</guestName></SearchGuest></ExpenseMobileService></param></params>";
			}
			
            if ("FetchExchangeRate".equals(service)) {
                params = "<params><param><ExpenseMobileService><FetchExchangeRate><fromCurrencyCode>" + fromCurrencyCode + "</fromCurrencyCode><toCurrencyCode>" + toCurrencyCode + "</toCurrencyCode><expenseDate>" + expenseDate + "</expenseDate></FetchExchangeRate></ExpenseMobileService></param></params>";
            }
            
            System.out.println("Request Payload: " + params);
            System.out.println("");
            System.out.print("Generating response.. Please wait.");
            System.out.println("");
            
			OutputStream os = null;
            try {
                os = conn.getOutputStream();
                if (params != null) {
                    os.write(params.getBytes());
                }
            } catch (Exception e) {
                System.out.println("Exception writing output " + e.getMessage());
                e.printStackTrace();
            }
			
			BufferedReader reader;
			
			if(conn.getResponseCode() == 200){
				reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			}
            else{
				if(conn.getResponseCode() == 401){
					System.out.println("User does not have access to the function Expenses Mobile.");
					System.out.println("Please create a grant as mentioned in Note: 1625446.1");
					System.out.println("Compile Menus by running the Compile Security (FNDSCMPI) concurrent program.");
				}
				reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
	        String line;
	        StringBuffer sb = new StringBuffer();
	        while ((line = reader.readLine()) != null) { 
	        	sb.append(line);
	        }
	        
            System.out.println("Response Code: " + conn.getResponseCode());
            System.out.println("Response : " + sb.toString());
            System.out.println("");
	         
	        reader.close(); 
			conn.disconnect();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

    void getTimedServiceResult(HttpURLConnection conn, String service) {
        try{
            System.out.println("");
            String params = "<params>" +
            "<param>" +
            "<ExpenseMobileService>" +
            "<"+service+"/>" +
            "</ExpenseMobileService>" +
            "</param>" +
            "</params>";
            
            System.out.println("Request Payload: " + params);
            System.out.print("Generating response.. Please wait.");
            System.out.println("");
            
            System.out.println("Connecting to end point..");
            conn.connect();
            OutputStream writer = conn.getOutputStream();
            writer.write(params.getBytes());
            writer.flush();
            writer.close();
            
            conn.connect();
            BufferedReader reader;
            
            int respCode = conn.getResponseCode();
            System.out.println("Response Code : " + respCode);
            if(respCode == 200){
                reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String line;
                StringBuffer sb = new StringBuffer();
                while ((line = reader.readLine()) != null) {
                    sb.append(line);
                }
                
                System.out.println("Response : " + sb.toString());
                System.out.println("");
            }
            else{
                reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
                String line;
                StringBuffer sb = new StringBuffer();
                while ((line = reader.readLine()) != null) {
                    sb.append(line);
                }
                
                System.out.println("Error Stream : " + sb.toString());
            }
            
            System.out.println("Request complete..");
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
	public String encode(String inStr) {
		byte[] inBytes = inStr.getBytes();
		byte[] outBytes = new byte[((inBytes.length + 2) / 3) * 4];
      
		for (int ix=0, index=0; ix<inBytes.length; ix+=3, index+=4){
			boolean byte2Present = false;
			boolean byte3Present = false;

			int val = ((int) inBytes[ix] & 0xFF) << 8;
             
			if ((ix+1) < inBytes.length) {
				val |= ((int) inBytes[ix+1] & 0xFF);
				byte2Present = true;
			}
			val <<= 8;
			if ((ix+2) < inBytes.length) {
				val |= ((int) inBytes[ix+2] & 0xFF);
				byte3Present = true;
			}
			outBytes[index+3] = charset[(byte3Present ? (val & 0x3F): 64)];
			val >>= 6;
			outBytes[index+2] = charset[(byte2Present ? (val & 0x3F): 64)];
			val >>= 6;
			outBytes[index+1] = charset[val & 0x3F];
			val >>= 6;
			outBytes[index+0] = charset[val & 0x3F];
      }
      return new String(outBytes);
    }
    
	public boolean login(String username, String password, String loginURL) throws Exception {
	  
      cookieList = new ArrayList();
	  cookiesStr = null;
      System.out.println(loginURL);
	  System.out.print("Generating Cookie String.. Please wait.");
      URL url = null;
      url = new URL(loginURL);
      HttpURLConnection conn = (HttpURLConnection)url.openConnection();      
      conn.setUseCaches(false);
      conn.setRequestMethod("GET");
      
      if (username == null || password == null || loginURL == null) {
        throw new Exception ("All arguments are mandatory. Pass non-null values for all.");
      }
      
      String authHeader = username +":"+password;
      String base64enc = encode(authHeader);
      
      conn.addRequestProperty("Authorization", "Basic "+base64enc);
	  
      conn.connect();
      conn.setInstanceFollowRedirects(false);      

      if (conn.getResponseCode() != 200) {    	  
          throw new Exception ("Login Service Response Status Code"+conn.getResponseCode()+" with message "+conn.getResponseMessage());
      } 
	  else {
          System.out.println("");
          
          String cookieHeaderKeyName = "Set-Cookie";
          Map headers = conn.getHeaderFields();
          
          try {
              if (headers != null) {
                  List<String> headersKeyList = new ArrayList<String>(headers.keySet());
                  int headersKeyListSize = (headersKeyList != null ? headersKeyList.size() : 0);
                  for (int i = 0; i < headersKeyListSize; i++) {
                      String headerKeyName = headersKeyList.get(i);
                      if (headerKeyName != null && "set-cookie".equalsIgnoreCase(headerKeyName)) {
                          cookieHeaderKeyName = headerKeyName;
                      }
                  }
              }
          }
          catch (Exception exception) {
              cookieHeaderKeyName = "Set-Cookie";
          }
          
          List cookies = (List)headers.get(cookieHeaderKeyName);
          String cookie = "";
          
          int cookieHeaderSize = cookies != null ? cookies.size() : 0;
          
          System.out.println("");
          System.out.println("Cookie Header Size: " + cookieHeaderSize);
          System.out.println("Cookie Header Key Name: " + cookieHeaderKeyName);
          System.out.println("");
          
          for(int i = 0; i < cookieHeaderSize; i++) {
             cookie = (String)cookies.get(i);
             
             StringTokenizer st = new StringTokenizer(cookie, ";");                    
             String cv = st.nextToken();
             StringTokenizer st2 = new StringTokenizer(cv, "=");
             String ckName = st2.nextToken();
             String ckValue = st2.nextToken();
             if (cookiesStr == null) {
                 cookiesStr = ckName + "=" + ckValue + ";";
             }
             else {
                 cookiesStr = cookiesStr + ckName + "=" + ckValue + ";";  
             } 
          }
      }
      
      System.out.println("Cookie String: " + cookiesStr);
      return true;
    }
    
	public boolean logout(String loginURL) throws Exception {
    	URL url = null;
        url = new URL(loginURL);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        
        conn.addRequestProperty("Cookie", cookiesStr);                 
		conn.addRequestProperty("Content-type", "application/xml");
		conn.addRequestProperty("Accept", "application/xml");
		conn.setDoOutput(true);
		conn.setRequestMethod("POST");
        conn.connect();
        conn.setInstanceFollowRedirects(false);
        
        System.out.println("");
        System.out.println("Sequence complete. Cookie Invalidated.");
        System.out.println("");
        return true;
    }
	
	public HttpURLTest() {
        cookiesStr = "";        
	}
	public String getCookieStr(){
		return cookiesStr;
	}

	public static void main(String[] args) {
		System.out.println("Fusion Expenses Mobile - Payload Tester");
        System.out.println("========================================");
        System.out.println("");
        System.out.println("1.  Fetch Settings");
        System.out.println("2.  Fetch Expense Templates and Types");
        System.out.println("3.  Fetch Child Types");
        System.out.println("4.  Fetch Project and Tasks");
        System.out.println("5.  Fetch Currency Rates");
        System.out.println("6.  Fetch Territories");
        System.out.println("7.  Fetch Tax Codes");
        System.out.println("8.  Fetch Lookups");
        System.out.println("9.  Fetch Policies");
        System.out.println("10. Fetch Credit Card Expense Lines");
        System.out.println("11. Fetch Descriptive Flex Fields");
        System.out.println("12. Fetch DFF Value Sets");
        System.out.println("13. Fetch Approval Reports");
        System.out.println("14. Search Employee");
        System.out.println("15. Search Guest");
        System.out.println("16. Fetch Exchange Rate");
        System.out.println("17. Batch Sync");
        System.out.println("18. Back to Back Sync");
        
        System.out.println("");
		System.out.print("Select a service: ");
        
        Scanner scanner = new Scanner(System. in);
        String optionSelected = scanner. nextLine();
        
		BufferedReader loginDetailsBufferedReader = null;
		String host = "";
		String user = "";
		String pwd = "";
		int    option = 0;
        
        if (optionSelected != null) {
            try {
                option = Integer.parseInt(optionSelected);
            }
            catch (Exception exception) {
                System.out.println("Invalid service selected. ");
                System.exit(1);
            }
            
            if(option <= 0 || option > 18) {
                System.out.println("Invalid service selected. ");
                System.exit(1);
            }
        }
        else {
            System.out.println("Invalid service selected. ");
            System.exit(1);
        }
			
        switch (option) {
            case  1: selectedService = "FindProfileAttribute"; break;
            case  2: selectedService = "FindExpenseTemplate"; break;
            case  3: selectedService = "FindChildTypes"; break;
            case  4: selectedService = "FindProjectTask"; break;
            case  5: selectedService = "FindCurrencyRate"; break;
            case  6: selectedService = "FindTerritoryCurrency"; break;
            case  7: selectedService = "FindTaxCodes"; break;
            case  8: selectedService = "FindLookups"; break;
            case  9: selectedService = "FindPolicyInformation"; break;
            case 10: selectedService = "FindCCTransaction"; break;
            case 11: selectedService = "FindDescriptiveFlex"; break;
            case 12: selectedService = "FindValueSets"; break;
            case 13: selectedService = "FindMobileExpenseReportApproval"; break;
            case 14: selectedService = "SearchEmployee"; break;
            case 15: selectedService = "SearchGuest"; break;
            case 16: selectedService = "FetchExchangeRate"; break;
            case 17: selectedService = "BatchSync"; break;
            case 18: selectedService = "BackToBackSync"; break;
                
            default: break;
        }
        
		try {
			String sCurrentLine;
 			loginDetailsBufferedReader = new BufferedReader(new FileReader("/Users/ramnagar/eclipse-workspace/OIEHTTPTester/src/details.txt"));
 
 			if ((sCurrentLine = loginDetailsBufferedReader.readLine()) != null) {
	 			host = sCurrentLine;
	 			
	 			if (host.equals("") || host == null) {
		 			System.out.println("No host URL found in details.txt file.");
		 			System.out.println("Sample host URL format: http://samplehost.oracle.com:8080/OAR");
		 			System.exit(1);
	 			}
 			}
            
            if(host.indexOf("OAR") == -1){
                System.out.println("Host URL should be of the format http(s)://<fully qualified host>:<port if required>/OAR");
                System.out.println("Exiting ExpenseMobileServiceTest");
                System.exit(1);
            }
            
 			if ((sCurrentLine = loginDetailsBufferedReader.readLine()) != null) {
	 			user = sCurrentLine;
	 			
	 			if (user.equals("") || user == null) {
		 			System.out.println("No user name found in in details.txt file.");
		 			System.out.println("Sample user name format: SAUSER");
		 			System.exit(1);
	 			}
 			}
            
 			if ((sCurrentLine = loginDetailsBufferedReader.readLine()) != null) {
	 			pwd = sCurrentLine;
	 			
	 			if (pwd.equals("") || pwd == null) {
		 			System.out.println("No password is entered in details.txt file.");
		 			System.exit(1);
	 			}
 			}
		}
		catch (IOException e) {
			e.printStackTrace();
		} 
		finally {
			try {
				if (loginDetailsBufferedReader != null) {
					loginDetailsBufferedReader.close();
				}
			} 
			catch (IOException ex) {
				ex.printStackTrace();
			}
		}
        
        if ("FindCCTransaction".equals(selectedService)) {
            System.out.print("Enter the default template id: ");
            
            scanner = new Scanner(System. in);
            defaultTemplateId = scanner. nextLine();
            
            if (defaultTemplateId == null || "".equals(defaultTemplateId)) {
                System.out.println("Invalid default template id entered. ");
                System.exit(1);
            }
        }
        else if ("SearchEmployee".equals(selectedService)) {
            System.out.print("Enter the search string for employee: ");
            
            scanner = new Scanner(System. in);
            searchName = scanner. nextLine();
            
            if (searchName == null || "".equals(searchName)) {
                System.out.println("Invalid search string entered. ");
                System.exit(1);
            }
        }
        else if ("SearchGuest".equals(selectedService)) {
            System.out.print("Enter the search string for guest: ");
            
            scanner = new Scanner(System. in);
            searchName = scanner. nextLine();
            
            if (searchName == null || "".equals(searchName)) {
                System.out.println("Invalid search string entered. ");
                System.exit(1);
            }
        }
        else if ("FetchExchangeRate".equals(selectedService)) {
            System.out.print("Enter the 'to' currency code: ");
            
            scanner = new Scanner(System. in);
            toCurrencyCode = scanner. nextLine();
            
            if (toCurrencyCode == null || "".equals(toCurrencyCode)) {
                System.out.println("Invalid 'to' currency code entered. ");
                System.exit(1);
            }
            
            System.out.print("Enter the 'from' currency code: ");
            
            scanner = new Scanner(System. in);
            fromCurrencyCode = scanner. nextLine();
            
            if (fromCurrencyCode == null || "".equals(fromCurrencyCode)) {
                System.out.println("Invalid 'from' currency code entered. ");
                System.exit(1);
            }
            
            System.out.print("Enter the expense date: ");
            
            scanner = new Scanner(System. in);
            expenseDate = scanner. nextLine();
            
            if (expenseDate == null || "".equals(expenseDate)) {
                System.out.println("Invalid 'expense date' entered. ");
                System.exit(1);
            }
        }
        
        host = host.trim();
        user = user.trim();
        pwd = pwd.trim();
        
		System.out.println();
		System.out.println("Running Payload Tester with following values:");
		System.out.println("Host URL         :  " + host);
		System.out.println("User Name        :  " + user);
		System.out.println("Password         :  " + pwd);
        
		HttpURLTest mobile = new HttpURLTest();
		
        if(host.endsWith("/")){
			host = host.replaceAll("OAR/", "OA_HTML/RF.jsp?function_id=");
		}
		else{
			host = host.replaceAll("OAR", "OA_HTML/RF.jsp?function_id=");
		}
        
		//disableSslVerification();

        try {
            /*
			HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier(){
				public boolean verify(String hostname, SSLSession session){
					System.out.println("Spoofing ssl certificates for host " + hostname);
					return true;
				}
			});
            */
            
            mobile.login(user, pwd, host+"mLogin");
            System.out.println("Selected Service: " + selectedService);
            
            if ("BackToBackSync".equals(selectedService)) {
                System.out.println("");
                System.out.print("Retain Connection? (Y/N): ");
                
                scanner = new Scanner(System. in);
                retainConnection = scanner. nextLine();
                retainConnection = retainConnection.toUpperCase();
                
                if (retainConnection == null || !("Y".equals(retainConnection) || "N".equals(retainConnection))) {
                    System.out.println("Invalid selection. ");
                    System.exit(1);
                }
                
                if ("Y".equals(retainConnection)) {
                    HttpURLConnection conn = (HttpURLConnection)(new URL(host+"OIE_MOBILE_EXPENSES").openConnection());
                    
                    conn.setRequestMethod("POST");
                    conn.addRequestProperty("Cookie", mobile.getCookieStr());
                    conn.addRequestProperty("Content-type", "application/xml");
                    conn.addRequestProperty("Accept", "application/xml");
                    conn.setDoOutput(true);
                    conn.setDoInput(true);
                    conn.setRequestMethod("POST");
                    
                    mobile.getTimedServiceResult(conn, "FindProfileAttribute");
                    mobile.getTimedServiceResult(conn, "FindExpenseTemplate");
                    mobile.getTimedServiceResult(conn, "FindChildTypes");
                    mobile.getTimedServiceResult(conn, "FindProjectTask");
                    mobile.getTimedServiceResult(conn, "FindTerritoryCurrency");
                    mobile.getTimedServiceResult(conn, "FindTaxCodes");
                    
                    conn.disconnect();
                }
                else {
                    mobile.getTimedServiceResult(host, "FindProfileAttribute", mobile.getCookieStr());
                    mobile.getTimedServiceResult(host, "FindExpenseTemplate", mobile.getCookieStr());
                    mobile.getTimedServiceResult(host, "FindChildTypes", mobile.getCookieStr());
                    mobile.getTimedServiceResult(host, "FindProjectTask", mobile.getCookieStr());
                    mobile.getTimedServiceResult(host, "FindTerritoryCurrency", mobile.getCookieStr());
                    mobile.getTimedServiceResult(host, "FindTaxCodes", mobile.getCookieStr());
                }
            }
            else {
                mobile.getTimedServiceResult(host, selectedService, mobile.getCookieStr());
            }

            //mobile.logout(host+"mLogout");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try{
				
			}catch(Exception e){
				
			}
		}
		
	}
    
	HashMap cookieStore = new HashMap();

}
