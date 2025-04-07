# Springdemo3

This is a sample springboot application with docker. 

To Run: 
- mvn clean package 
- docker build -t <tag_name> . 
- docker run -p 8080:8080 -eIP_ADDRESS="<value1>" -e WELCOME_MESSAGE="<some_message>" <tag_name>
- Access the application at localhost:8080 and localhost:8080/greeting
- To run with production profile, use "-eSPRING_PROFILES_ACTIVE=prod"
  ex: docker run -p 8080:8080 -eSPRING_PROFILES_ACTIVE=prod -eIP_ADDRESS="<value1>" -e WELCOME_MESSAGE="<some_message>" <tag_name>
  