#!bash

java -jar selenium-server-standalone-3.141.59.jar -role hub
java -jar selenium-server-standalone-3.141.59.jar -role node -hub http://localhost:4444/grid/register
