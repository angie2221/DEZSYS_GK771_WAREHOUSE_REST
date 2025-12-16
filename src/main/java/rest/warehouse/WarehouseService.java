package rest.warehouse;

import org.springframework.stereotype.Service;
import rest.model.WarehouseData;

import java.util.ArrayList;
import java.util.List;

@Service
public class WarehouseService {

	public String getGreetings( String inModule ) {
        return "Greetings from " + inModule;
    }

    public WarehouseData getWarehouseData( String inID ) {

    	WarehouseSimulation simulation = new WarehouseSimulation();
        return simulation.getData( inID );


    }
    public List<WarehouseData> getAllWarehouses() {
    List<WarehouseData> allWarehouses = new ArrayList<>();
    String[] warehouseIds = {"001", "002", "003"}; // Beispiel: mehrere Lagerstandorte
    WarehouseSimulation simulation = new WarehouseSimulation();

        for (String id : warehouseIds) {
        allWarehouses.add(simulation.getData(id));
    }

        return allWarehouses;
}
}