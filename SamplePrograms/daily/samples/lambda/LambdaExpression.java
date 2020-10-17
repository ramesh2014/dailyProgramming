package daily.samples.lambda;

interface FunctionalInterface{
	String FunctionalMethodWithNoPram();
}

interface FunctionalInterface2{
	void FunctionalMethodWithNoParamAndNoReturnType();
}

interface FunctionalInterface3{
	String FunctionalMethodWithSingleParam(int iParam);
}

interface FunctionalInterface4{
	void FunctionalMethodWithSingleParamNoReturnType(int iParam);
}

interface FunctionalInterface5{
	String FunctionalMethodWithMultipleParam(int iParam, String sParam);
}

interface FunctionalInterface6{
	FunctionalClass FunctionalMethodReturnClassType(int iParam);
}

class FunctionalClass{
	
	int data;
	
	FunctionalClass(int data){
		this.data = data;
	}
	
	int getData() {
		return this.data;
	}	
}


public class LambdaExpression {
	
	public static void main(String[] args) {
		
		//Example1
		FunctionalInterface fi = () -> "Example1: No Param String";
		System.out.println(fi.FunctionalMethodWithNoPram());
		
		//Example1
		FunctionalInterface2 fi2 = () -> {
			System.out.println("Example2: No input param and no return type");
		};
		fi2.FunctionalMethodWithNoParamAndNoReturnType();
		
		//Example3
		FunctionalInterface3 fi3 = (int singleParam) -> "Example3: Single int Param Value:"+singleParam+" and returning String value";
		System.out.println(fi3.FunctionalMethodWithSingleParam(345));
		
		//Example4
		FunctionalInterface4 fi4 = (singleParam) -> {
			System.out.println("Example4: No return type, no use of passed parameter value: "+ singleParam);
		};
		
		fi4.FunctionalMethodWithSingleParamNoReturnType(123);
		
		//Example5
		FunctionalInterface5 fi5 = (int firstParam, String secondParam) -> {
			return "Example5: Two params: "+firstParam+" "+secondParam;
		};
		
		System.out.println(fi5.FunctionalMethodWithMultipleParam(14815,"is my employee id"));
		
		//Example6
		FunctionalInterface6 fi6 = (int singleParam) -> {
			return new FunctionalClass(6);
		};
		
		FunctionalClass fc = fi6.FunctionalMethodReturnClassType(5678);
		System.out.println("Example6: Data from Class Member: "+fc.getData());
		
	}
	
}
