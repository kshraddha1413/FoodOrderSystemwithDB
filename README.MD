
# Food Order System

Food Order System has two applications:
 1) Food Order System RESTFul service 
 2) Food Order Angular UI (https://github.com/kshraddha1413/FoodOrderAngularUI.git).

This is RESTFul Service (API) for Food Order System and it is built using Spring Boot with following dependencies:

1) Spring Web (MVC) - Starter for building web, including RESTful, applications using Spring MVC. Uses Tomcat as the default embedded container
   
2) Spring Data JPA (Hibernate) - Persist Data in SQL stores with Java Persistence API using Spring Data and Hibernate.
   
3) My SQL Driver -  MySQL JDBC and R2DBC driver.

## REST endpoints:

**GET all food items**

URL : http://localhost:8080/api/fooditem

Method: GET

Response :

```
[ 
   { 
      "id":1,
      "type":"breakfast",
      "name":"donuts",
      "price":1.0
   },
   { 
      "id":2,
      "type":"meal",
      "name":"chicken sandwhich",
      "price":5.0
   },
   { 
      "id":3,
      "type":"dinner",
      "name":"caesar salad",
      "price":4.5
   }
]
```

**GET specific food item**

URL : http://localhost:8080/api/fooditem/1

Method: GET

Response :

```
{ 
    "id":1,
    "type":"breakfast",
    "name":"donuts",
    "price":1.0
}
```


**Add new food item**

URL : http://localhost:8080/api/fooditem

Method: POST

Request Body :

```
{ 
   "type":"breakfast",
   "name":"hash browns",
   "price":1.5
}
```

Response :

```
{ 
    "id": 4,
   "type":"breakfast",
   "name":"hash browns",
   "price":1.5
}
```


**Update food item price**

URL : http://localhost:8080/api/fooditem

Method: PUT

Request Body :

```
{ 
    "id":1,
    "type":"breakfast",
    "name":"donuts",
    "price":1.5
}
```

Response :

```
{ 
    "id":1,
    "type":"breakfast",
    "name":"donuts",
    "price":1.5
}
```

**Delete food item**

URL : http://localhost:8080/api/fooditem/160

Method: DELETE


Response :

```
{
    "message": "FoodItem has been deleted with id:160"
}
```

## Prerequisite

1) Install MySQL database
   
2) Execute folllowing SQL commands for intial setup.


```

CREATE database food;

use food;

CREATE TABLE fooditems
(id INT AUTO_INCREMENT PRIMARY KEY , 
type VARCHAR(255) NOT NULL,
name VARCHAR(255) NOT NULL,
price DOUBLE );

select * from fooditems;

INSERT INTO fooditems(id,type,name,price) values
(201,'Lunch','Pizza',7.50),
(202,'Lunch','Noodles',6.50),
(203,'Lunch','Rice Bowl',8.50);

INSERT INTO fooditems(id,type,name,price) values
(301,'Dinner','Soup',6.50),
(302,'Dinner','Salad',5.50),
(303,'Dinner','Pasta',9.50);

```