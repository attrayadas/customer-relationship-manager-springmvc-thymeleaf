# Customer Relationship Manager - Spring MVC, Thymeleaf, JPA, MySQL

A Spring MVC project for efficient customer data management using MySQL, leveraging Spring MVC, Thymeleaf, JPA, and MySQL

## Steps to Setup

**1. Clone the Application**

```bash
git clone https://github.com/attrayadas/customer-relationship-manager-springmvc-thymeleaf.git
```

**2. Create MySQL Database**
```bash
create database practice
```

**3. Change MySQL username and password as per your installation**

+ open `src/main/resources/application.properties`
+ change `spring.datasource.username` and `spring.datasource.password` as per your MySQL installation

**4. Run the app using maven**

```bash
mvn spring-boot:run
```
The app will start running at <http://localhost:8080/CRM>

## Architecture

**1. Read Operation**
![Read operation](https://github.com/attrayadas/customer-relationship-manager-springmvc/assets/96123861/b9645560-3acb-404e-afe0-cf87fe956a5d)

**2. Save Operation**
![Save operation](https://github.com/attrayadas/customer-relationship-manager-springmvc/assets/96123861/2f8ea71d-d526-481c-a343-013df36df77e)

**3. Update Operation**
![Update operation](https://github.com/attrayadas/customer-relationship-manager-springmvc/assets/96123861/89b4618d-152e-4c30-8a4c-19fe2ccb4a1f)

**4. Delete Operation**
![Delete operation](https://github.com/attrayadas/customer-relationship-manager-springmvc/assets/96123861/1e7a01d6-bb5d-44b8-a5ae-46924575bbdd)

## Demo
