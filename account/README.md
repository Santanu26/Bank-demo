```
H2-console: http://localhost:8080/h2-console
OPEN-API:http://localhost:8080/swagger-ui/index.html

docker build . -t shantonubarua/accounts:v1

docker images

docker inspect image shantonubarua/accounts

docker run -d -p 8080:8080 shantonubarua/accounts:v1

docker ps

Simply Scalability:

docker run -d -p 8080:8080 shantonubarua/accounts:v1
docker run -d -p 8081:8080 shantonubarua/accounts:v1


docker compose up -d
docker compose down
```