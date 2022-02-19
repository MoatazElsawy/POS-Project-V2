# POS-Project-V2
Desktop APP that Involves all of Module, View and Controller(MVC Design Pattern). V2

Updates: I'm changed some features in UI interface Specifically on the user messages and some techniques

This project is fully object oriented programming(OOP) ,that represent a small point of sale project. 
Where I'm created (Item, Category, WareHouse, Client , Order, User, Invoice) for data transfer object to create, retraive, update and delete(CRUD) from and to database by UI interface.

I'm used MVC desin pattern to build my project, DAO, BAO, Factory desin patterns, Generic Interfaces to generalize and save in code Then, Exception Handling , Security ,Validation, 
And I used JDBC to connect to database by MySql JDBC Driver.
In fact I didn't complete the view (UI) perfectly because I'm satisfied with the main idea and understanding how it works. 

I'm used MySql DBMS to creat my schema of database for Project. and create (categort, warehouse, item, client, odrer, user and invoice) tables and relationship, constraint betwen them.

I'm used Swing GUI widget toolkit to represent my view of project.

<h1>tip</h1>, the user and password are ("moataz" , "ahmed") for logIn to POS project 
Then,, url, username and password for connection to database are locally, if you want t run this project you must chnages this(url, username and password) in jdbc.properties file from this path "JSE_POS\src\com\pos\dao\util\jdbc.properties" to your own paths.
and you must named the schema of database to "pos" .... because I'm used this name in my query strings with JDBC.
