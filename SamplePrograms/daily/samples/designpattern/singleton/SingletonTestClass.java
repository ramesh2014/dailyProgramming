package daily.samples.designpattern.singleton;

public class SingletonTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//SingletonObject so = new SingletonObject();
		SingletonObject so = SingletonObject.getInstance();
		SingletonObject so1 = SingletonObject.getInstance();
		
	}

}

class SingletonObject{
	
	static SingletonObject obj = new SingletonObject();
	
	private SingletonObject() {
		
	}
	
	public static SingletonObject getInstance() {
		return obj;
	}
}