Introduction
---------------
This project an account management system for users to add, view, update and delete accounts.
-   [Spring Boot](https://spring.io/projects/spring-boot/) to be used for server-side webpages and services
-   [VueJS](https://vuejs.org/) for client-side user interfaces
-   [Vuetify](https://vuetifyjs.com/) framework for material design component
    - I used this framwork as it provides minimalist designs with simple instructions on implementing it 
-   [H2 Database](http://www.h2database.com/html/main.html) for in-memory database
    - I used this database as it is encrypted and supports memory mode compared to other database like MySQL

Prerequiste
---------------
Prior to running this application we need to setup our windows environments by following these steps:

Step 1:
Open up a command prompt as an administrator


Step 2:
Enter the following file path to run the springboot

cd accountmanagement
mvn --projects backend spring-boot:run

Step 3:
Enter the following file path to run the vuejs

cd accountmanagement/frontend
npm run dev


# accountmanagement

> account management system

## Build Setup

``` bash

# install dependencies
npm install

# serve with hot reload at localhost:8080
npm run dev

# build for production with minification
npm run build

# build for production and view the bundle analyzer report
npm run build --report
```

For a detailed explanation on how things work, check out the [guide](http://vuejs-templates.github.io/webpack/) and [docs for vue-loader](http://vuejs.github.io/vue-loader).
