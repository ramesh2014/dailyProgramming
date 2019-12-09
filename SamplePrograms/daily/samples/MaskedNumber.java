package daily.samples;

public class MaskedNumber {

    public static String stripNumberOfChars(String cardNumber) {
        char[] arrChars = cardNumber.toCharArray();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < arrChars.length; i++) {
            if (Character.isDigit(arrChars[i]))
                buffer.append(arrChars[i]);
        }
        return buffer.toString();
    }
    
    public static String getMaskedCardNumber(String cardBrand, String cardNumber){
        
        //AMEX - is for CreditCardSetup, CARD_BRAND_AMEX - is for while uploading cc through feed
        Boolean bIsCardBrandAmex = (!(null == cardBrand) || (! "".equals(cardBrand))) && ("AmericanExpress".equals(cardBrand) || "AMEX".equals(cardBrand));
        String maskedCCNumber = null;
        String maskedCharAmex = "XXXXXXXXXXXX";
        String maskedCharCDF3 = "XXXXXXXXXXXX";
        String strippedNumber = stripNumberOfChars(cardNumber);
        
        int length = strippedNumber.length();
        
        if (bIsCardBrandAmex) 
            maskedCCNumber = (length >= 4 ? maskedCharAmex + strippedNumber.substring(length - 4) : 
            	(maskedCharAmex + maskedCharAmex.substring(maskedCharAmex.length()-4).substring(length) + strippedNumber));
        else
        	maskedCCNumber = (length >= 4 ? maskedCharCDF3 + strippedNumber.substring(length - 4) : 
            	(maskedCharCDF3 + maskedCharCDF3.substring(maskedCharCDF3.length()-4).substring(length) + strippedNumber));
        return maskedCCNumber;
    }
    
	public static void main(String[] args) {
		
		String finalValue = getMaskedCardNumber("AMEX","1234567890123456");
		System.out.println(finalValue);
		
		finalValue = getMaskedCardNumber("AMEX","456");
		System.out.println(finalValue);
		
		finalValue = getMaskedCardNumber("AMEX","1");
		System.out.println(finalValue);
		
		finalValue = getMaskedCardNumber("AMEX","12");
		System.out.println(finalValue);
		
		
	}
}
