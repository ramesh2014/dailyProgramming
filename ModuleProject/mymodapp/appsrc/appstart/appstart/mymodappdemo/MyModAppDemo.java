package appstart.mymodappdemo;
import appfuncs.simplefuncs.SimpleMathFuncs;

public class MyModAppDemo {
	
	public static void main(String[] args) {
		
		if(SimpleMathFuncs.isFactor(2,10))
			System.out.println("2 is a factor of 10");
		
		System.out.println("Smallest factor common to both 35 and 105 is "+
							SimpleMathFuncs.lcf(35, 105));
		System.out.println("Largest factor common to both 35 and 105 is "+
							SimpleMathFuncs.gcf(35, 105));
			
	}
}

//javac --module-path appmodules -d appmodules/appstart appsrc/appstart/module-info.java appsrc/appstart/appstart/mymodappdemo/MyModAppDemo.java

//java --module-path appmodules -m appstart/appstart.mymodappdemo.MyModAppDemo
//java --module-path ../mymodapp/appmodules -m appstart/appstart.mymodappdemo.MyModAppDemo

//appstart module present under appmodules directory
//-m <modulename>/fully qualified name of main class (package.mainclass)

/*java [options] <mainclass> [args...]
           (to execute a class)
   or  java [options] -jar <jarfile> [args...]
           (to execute a jar file)
   or  java [options] -m <module>[/<mainclass>] [args...]
       java [options] --module <module>[/<mainclass>] [args...]
           (to execute the main class in a module)
   or  java [options] <sourcefile> [args]s
           (to execute a single source-file program)

 Arguments following the main class, source file, -jar <jarfile>,
 -m or --module <module>/<mainclass> are passed as the arguments to
 main class.
 */