# Lab #1 Dinning Hall Api (Main part)

### Author: _Sorochin Nichita, FAF-191_

---

## Technologies used:
* ### JDK: 11
* ### Spring Boot: 2.5.5
* ### Jackson core: 2.12.5

## Configure

### To run project with and configure ins values, there is a config file named `configDH.txt`, where:
### 1. Id of the restaurant (integer number) and name of the restaurant (e.g. 1 McDonald's)
### 2. TimeUnits to run project with (written with capsLock, because represented as Enum TimeUnit in Java) e.g. MILLISECONDS, SECONDS, etc.
### 3. Free port to be reserved for this server.
### 4. IP-address or URL of other side (Kitchen) with its port. E.g. http://localhost:8080
### 5. IP-address or URL of Food Ordering service with its port.
### 6. Number of some units (In dinning hall, number of tables, number of waiters are just two times smaller than number of tables) as integer number

## Menu

### User can create their custom menu, which is formed as json-file placed in repository named `menu.json`

---

## !IMPORTANT! To make both projects run properly, run `kitchen-api` first, and only then `dinning_hall-api`. To launch with `food ordering service` and `client service` run projects in proposed order:

### 1. Food Ordering service
### 2. Kitchen
### 3. Dinning-Hall
### 4. Client Service

### If you want to run both projects in docker, in `dinning_hall-api` repository is located Shell script.
### 1. Clone both projects' directories into one general directory. 
### (e.g. "%commonD%\dinning_hall-api\" and "%commonD%\kitchen-api\")
### 2. Put both `1step.sh` and `2step.sh` scripts into general directory ("%commonD%")
### 3. Now you can create Docker Images, containters and run them in the same network just executing scripts.
