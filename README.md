1)Develop your Project in Eclipse you need to go to the website,that is https://start.spring.io
in that select
	a)project = Maven
	b)Language = java
	c)SpringBoot = 3.3.5
	d) enter the project names and artfactId groupId and select java version and packaging file.
	
2) for Dependencies
		a)Spring web
		b)Spring Data JPA
		c)MYSQL Driver
		d)Spring Devtools
		e)Lombok
		
3)Click on download and extract where you want develop your project in your System.

4)Open Eclipse click on File and select open projects from file system.

5)First Create 4 packages, those names are model, repository,service,controller. 
	when we creating packages main class package should be in top order.
	
6)Create Model class in that annotated with @Entity Generate Setters and Getters.

7)Create Repository interface and it extends with JPARepository<Employee ,Integer>

8)Create Service package in that we need to create one interface and one class and
 extend it and in that file   we need to write @Service Annotation upon the class 
 and in that class @Autowired Annotation 
 
9)create Controller class in that file also we need to write @RestController annotation 
	and in class write @Autowired annotation.
	
10) before going to run our application we need to write application.properties  in that 
file we need to write Database URL ,UserName ,Password and JPA Properties.

11) Run the application and Check the URLs In PostMan Tool.

 
	
