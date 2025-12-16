package rest.warehouse;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import rest.model.WarehouseData;

import java.util.Collection;
import java.util.List;

@RestController
public class WarehouseController {

    @Autowired
    private WarehouseService service;

    @Autowired
    private WarehouseProducer producer;

    @RequestMapping("/")
    public String warehouseMain() {
        String mainPage = "This is the warehouse application! (DEZSYS_WAREHOUSE_REST) <br/><br/>" +
                "<a href='http://localhost:8080/warehouse/001/json'>Link to warehouse/001/json</a><br/>" +
                "<a href='http://localhost:8080/warehouse/001/xml'>Link to warehouse/001/xml</a><br/>";
        return mainPage;
    }

    @RequestMapping(value = "/warehouse/{inID}/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public WarehouseData warehouseData(@PathVariable String inID) {
        return service.getWarehouseData(inID);
    }

    @RequestMapping(value = "/warehouse/{inID}/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public WarehouseData warehouseDataxml(@PathVariable String inID) {
        return service.getWarehouseData(inID);
    }

    @RequestMapping(value = "/warehouse/send")
    public String sendWarehouseData(@RequestParam(name = "id") String inID) {
        WarehouseData data = service.getWarehouseData(inID);
        producer.sendWarehouseData(data);
        return "Warehouse data sent to Kafka topic.";
    }

    @RequestMapping(value = "/warehouse/all/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<WarehouseData> warehouseData() {
        return service.getAllWarehouses();
    }

    @RequestMapping(value = "/warehouse/all/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public List<WarehouseData> warehouseDataxml() {
        return service.getAllWarehouses();
    }

    @RequestMapping("/warehouse/sendAll")
    public String sendAllWarehouses() {
        List<WarehouseData> allData = service.getAllWarehouses();
        producer.sendAll(allData);
        return "All warehouse data sent to Kafka.";
    }

}
