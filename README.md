Spring-Data-access-with-JDBC
============================

Simple example of database connection in spring using JDBC,

1- must first launch the sql server.

2- Edit the data in ApplicationContext.xml :


    <bean id="dataSource"
		    class="org.springframework.jdbc.datasource.DriverManagerDataSource">
		    <property name="driverClassName" value="com.mysql.jdbc.Driver" />
		    <property name="url" value="jdbc:mysql://localhost:3306/test" />
		    <property name="username" value="root" />
		    <property name="password" value="0000" />
	  </bean>
	  
3- run the project as maven build (goals: jetty:run)
