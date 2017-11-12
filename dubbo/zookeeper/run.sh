DOCKER_NETWORK=zulv_dev_network
DOCKER_NAME=myzoo
create_docker_network(){
        var=$(docker network create --driver bridge ${DOCKER_NETWORK})
        if [[ ${var} =~ .*Error.* ]]; then
                printf "${CYAN}Network ${DOCKER_NETWORK} already created\n"
                return 0
        else
                printf "${GREEN}Network ${DOCKER_NETWORK} created\n"
                return 1
        fi
}

docker stop ${DOCKER_NAME} || true && docker rm ${DOCKER_NAME} || true
create_docker_network
docker run --net=${DOCKER_NETWORK} -p 127.0.0.1:2181:2181 --name ${DOCKER_NAME} --restart always -d zookeeper
