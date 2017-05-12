#!/bin/sh
CLASS_NAME="fr.univavignon.onzeer.webservice.MainController"
SERVICE_NAME="onzeer.webservice"

rm -rf WEB-INF/classes
mkdir WEB-INF/classes
cp -r target/classes/* WEB-INF/classes/
cd WEB-INF/classes
wsgen -cp $CLASSPATH -wsdl $CLASS_NAME
cd ../..
jar cvf $SERVICE_NAME.war WEB-INF/*
asadmin deploy --force $SERVICE_NAME.war