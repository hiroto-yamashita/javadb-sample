javadb-sample
=============

This is JavaDB and Hibernate sample. Eclipse project.

JavaDB is an RDB included in JDK.
Originally it's Apache Derby, which is an opensource 
RDB made by Java.
It works in a single jar file.
It can run as a server, and also can run not as a server.
When it is running not as a server, you can only access 
from localhost and user is limited for single user.

JavaDB is installed when you install JDK.
In case of JDK7 windows it is located in
%JAVA_HOME%/db/lib
By default the classpath is not set, so you need to 
set it when you want to use.
When it run as not a server JDBC driver class is
org.apache.derby.jdbc.EmbeddedDriver
and connection string is
jdbc:derby:PATH-OF-DATABASE-FILE;create=XXXX
"XXXX" is true or false.
In case of true, the database file will be created 
automatically when it doesn't exist.

You can use RDB just above setting.
No need to install, configure.
It is useful when you want to show sample of 
something other than RDB.

To run this sample, run main method in 
com.oisix.javadb_sample.App
as a command line application.
