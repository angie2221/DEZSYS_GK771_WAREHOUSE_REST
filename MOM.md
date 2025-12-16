1. Middleware Engineering "MOM"
  Als erstens habe ich den Docker Image für Kafka gepulled und einen Container gestartet. Da der Container kein Name
    hatte, hab ich ihn manuell mittels **docker run -p 9092:9092 -d --name kafka apache/kafka:4.1.1**
    bennant. Als nächstes hab ich ein zweites Terminal geöffnet und eine Shell innerhalb des Containers gestartet.
![img_5.png](img_5.png)
Danach hab ich ins cd /opt/kafka gewechselt und meine topic "warehouse-queue" erstellt die ich für meine Übung brauchen werde. Damit Kafka in Java funktioniert. Fügen wir die entsprechende Spring Kafka dependency in Gradle hinzu.
Danach habe ich Producer u. Consumer programmiert und entsprechend den Code geändert, inklusive EK.
<img width="773" height="366" alt="image" src="https://github.com/user-attachments/assets/b55b1d17-d6e1-407d-9fa1-6d3c805eb72a" />

   

<img width="810" height="371" alt="image" src="https://github.com/user-attachments/assets/caf99e4b-a092-4ae2-aa35-8b6f47fd0d16" />

GK:
<img width="1175" height="484" alt="image" src="https://github.com/user-attachments/assets/e7f5c00b-2759-486c-ba07-c9fa062bccf0" />

EK:
<img width="1136" height="420" alt="image" src="https://github.com/user-attachments/assets/e353f486-2a74-45f9-a164-5561aaac7725" />

![img_4.png](img_4.png)
Meine Nachricht wurd am Zentralrechner empfangen. 
