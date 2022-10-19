## Usage

- Build a docker image for the Mars picture service `mvn spring-boot:build-image`
- Start docker containers with Redis, NASA proxy service and NASA picture service by running `docker-compose up -d`
- Make a request to find the largest NASA
  picture `curl 'http://localhost:8085/mars/pictures/largest?sol=16&camera=NAVCAM`
- To stop the running containers run `docker-compose down`