module appfuncs{
	//requires transitive java.sql;
	//requires public java.logging (inside java.sql module)
	//requires java.logging;
	exports appfuncs.simplefuncs;
	String name = "appfuncs";
}






//
//
//com.mysql.jdbc
//|--> com.mysql.jdbc.DriverImpl implements java.sql.Driver
//     										|-->org.slf4j
//
//java.sql (m) uses the driver     
//
//java.util.ServiceLoader must instantiate driver class via reflection { Class.forName(drivername, true, loader) }
//|<--com.mysql.jdbc.DriverImpl
//     
//module com.mysql.jdbc {
//    requires java.sql;
//    requires org.slf4j;
//    exports com.mysql.jdbc;
//}