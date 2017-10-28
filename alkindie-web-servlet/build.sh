TOMCAT_BASE_DIR=../../apache-tomcat-8.5.23
mvn clean package
cp target/alkindie-web-servlet.war ${TOMCAT_BASE_DIR}/webapps
sh ${TOMCAT_BASE_DIR}/bin/shutdown.sh
sh ${TOMCAT_BASE_DIR}/bin/startup.sh
