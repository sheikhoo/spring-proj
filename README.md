** Run the Application
./mvnw spring-boot:run

** Get list users
http://localhost:8090/get_all (GET)

** Add new user
http://localhost:8090/new_user (POST)

body:
{
    "firstName":"M.Sadegh",
    "lastName":"Sheikh Zahedi",
    "phone":"09135059909"
}
