
import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;

@Component
public class WarehouseConsumer {
    @KafkaListener(topics = "warehouse-queue")
    public void processMessage(String content) {
        System.out.println( "Read from Message Queue: " + content);
    }

}