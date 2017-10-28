mvn clean package
cp target/alkindie-servlet-example.war ../apache-tomcat-8.5.23/webapps
sh ../apache-tomcat-8.5.23/bin/shutdown.sh
sh ../apache-tomcat-8.5.23/bin/startup.sh
