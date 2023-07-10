# Ecommerce_sql_Application
>## Framework Used 
 * SpringBoot
>## Database Used 
 * Swagger
 * mysql workbench
>## Language Used
* Java
>## For Querying use these
* Crud Repository
* Custom Finder
* Custom Query
>## Data flow
In this project, we have four layers-
* **Controller** - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer. In short, it consists of views i.e., frontend part.
* **Service** -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
* **Repository** - This layer mainatains the h2-database thing on which CRUD operations are performed
* **Model** - This layer consists basically the class level things- the various classes required for the project and these classes consists the attributes to be stored.

>## Data Structure used in my project
  **User Model:**
   Id:integer
   name:string
   email:string
   password:string
   phoneNumber:string
**Product Model:**
      id:integer 
      name:string
      price:integer
      description:string
      category:string
      brand:string
**Address Model:**
       id:integer    
       name:string
       landmark:string
       phoneNumber:string
       zipcode:string
       state:string
       UserID : foreign key mapping
**Order Model:**
    id:integer
    userID:integer (foreign key mapping)
    productID:integer(foreign key mapping)
    addressID:integer(foreign key mapping)
    productQuantity:integer
>## project summery

*In the order entity class, add a @OneToOne annotation to the user attribute, to create a one-to-one mapping between order and user and we create four controller classes, UserController , ProductController , OrderController and AddressController, with the following methods to handle CRUD operations:

**Controller class**
*GET /product - get  all products
*GET /user/{id} - get an user by id
*GET /order/{id} - get an order by id
*POST /user - create a new user
*POST /product - create a new product
*POST /order - create a new order
*POST /address - create a new address
*DELETE /product/{id} - delete an product by id
>## Application_properties
spring.datasource.url=jdbc:mysql://localhost:3306/Ecommerce
spring.datasource.username=root
spring.datasource.password=<password>
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update

spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true
