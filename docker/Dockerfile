FROM java:8
ADD $PWD/apps/service-customer/build/libs/service-customer-1.0-SNAPSHOT.jar /opt/app/

WORKDIR /opt/app

CMD ["java", "-jar", "/opt/app/service-customer-1.0-SNAPSHOT.jar"]

