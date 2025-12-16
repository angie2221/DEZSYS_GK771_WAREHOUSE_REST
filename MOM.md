1.## Middleware Engineering "MOM"
  Als erstens habe ich den Docker Image für Kafka gepulled und einen Container gestartet. Da der Container kein Name
    hatte, hab ich ihn manuell mittels **docker run -p 9092:9092 -d --name kafka apache/kafka:4.1.1**
    bennant. Als nächstes hab ich ein zweites Terminal geöffnet und eine Shell innerhalb des Containers gestartet.
![img_5.png](img_5.png)
Danach hab ich ins cd /opt/kafka gewechselt und meine topic "warehouse-queue" erstellt die ich für meine Übung brauchen werde.


![img_4.png](img_4.png)
Meine Nachricht wurd am Zentralrechner empfangen. 