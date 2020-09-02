package daily.samples;

public class SwitchClass {
	
	public static void main(String[] args) {

		int measurement = 3;
		int retValue = 0;
		switch(measurement) {
		
		case 3:
			retValue = 3;
			break;
		case 6:
			retValue = 6;
//			break;
		case 9:
			retValue = 9;
//			break; //fallthrough
		default:
			retValue = 10;
			break;
		}
		System.out.println("retValue: "+retValue);
	}
}
