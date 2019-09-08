# docker-spring-boot-example
Follow Below steps 

Build/create image
docker build -f <docker File name> -t <Image Name to create> .
docker build -f Dockerfile -t docker-spring-boot .

f= File
t=tag

To check  the images
docker images

Run the Image
docker run -p <On which port to run>:<docker file port> <ImageName>
docker run -p 8000:8080 docker-spring-boot
p= package 

List the containers
docker ps

Kill the container
docker container kill <container id>
docker container kill 5c5c76c73e07
