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

## Fragestellungen:

  ## Nennen Sie mindestens 4 Eigenschaften der Message Oriented Middleware?
        asynchrone Kommunikation, Flexibilität, Sicherheit, Skalierbarkeit
  ## Was versteht man unter einer transienten und synchronen Kommunikation?
        MOM erlaubt es eine Nachricht zu senden, ohne dass eine sofortige Antwort kommt. Synchron bedeutet, dass eine Antwort gesendet wird, sobald eine Nachricht empfangen ist.
  ## Beschreiben Sie die Funktionsweise einer JMS Queue?
      Sobald eine Nachricht von einem Sender geschickt wird, bleibt sie in einer Queue, bis sie von einem Empfänger abgeholt werden.
  ## JMS Overview - Beschreiben Sie die wichtigsten JMS Klassen und deren Zusammenhang?
        ConnectionFactory: Erstellt ein Connection-Objekt.
        Connection: Stellt die Verbindung zur JMS-Provider her.
        Session: Erstellt Nachrichten, Sender und Empfänger.
        MessageProducer: Sendet Nachrichten an eine Destination (Queue oder Topic).
        MessageConsumer: Empfängt Nachrichten von einer Destination.
        Message: Repräsentiert die Nachricht, die gesendet oder empfangen wird.
  ## Beschreiben Sie die Funktionsweise eines JMS Topic?
        Eine JMS Topic implementiert Publisher & Subscriber Logik. Wenn ein Publisher eine Nachricht veröffentlicht, geht sie an alle Subscriber.
  ## Was versteht man unter einem lose gekoppelten verteilten System? Nennen Sie ein Beispiel dazu. Warum spricht man hier von lose? `
        In einem Los gekoppelten System sind die einzelnten Komponenten unabhängig voneinander, um das Risiko zu verhindern
        dass ein Fehler in einer Komponente das ganze System beeinflusst. Beispielweise bei der Trennung von Client & Server. Einige Funktionen sind nicht verfügbar,
        aber der Client kann unabhängig von Server arbeiten.

https://wasistderunterschied.com/15-unterschied-zwischen-lose-gekoppelten-und-fest-gekoppelten-systemen-mit-beispielen/
https://www.geeksforgeeks.org/computer-networks/what-is-message-oriented-middleware-mom/
