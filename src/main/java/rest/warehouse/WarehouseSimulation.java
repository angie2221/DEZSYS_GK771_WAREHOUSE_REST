package rest.warehouse;

import rest.model.Product;
import rest.model.WarehouseData;

import java.util.ArrayList;
import java.util.List;

public class WarehouseSimulation {
	
	private double getRandomDouble( int inMinimum, int inMaximum ) {

		double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum; 
		double rounded = Math.round(number * 100.0) / 100.0; 
		return rounded;
		
	}

	private int getRandomInt( int inMinimum, int inMaximum ) {

		double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum; 
		Long rounded = Math.round(number); 
		return rounded.intValue();

	}
	
	public WarehouseData getData( String inID ) {
		
		WarehouseData data = new WarehouseData();
		data.setWarehouseID( inID );
		data.setWarehouseName( "Linz Bahnhof" );
		data.setWarehouseAddress("Bahnhofsstrasse 27/9");
		data.setWarehousePostalCode("Linz");
		data.setWarehouseCity("Linz");
		data.setWarehouseCountry("Austria");
		data.setTimestamp("2021-09-12 08:52:39.077");
		data.setProductData(generateProducts());
		return data;
		
	}
	private List<Product> generateProducts() {
		List<Product> products = new ArrayList<>();
		products.add(new Product("00-443175", "Bio Orangensaft Sonne", "Getraenk", getRandomInt(1000,5000), "Packung 1L"));
		products.add(new Product("00-871895", "Bio Apfelsaft Gold", "Getraenk", getRandomInt(1000, 5000), "Packung 1L"));
		products.add(new Product("01-926885", "Ariel Waschmittel Color", "Waschmittel", getRandomInt(1000,2000), "Packung 3KG"));
		products.add(new Product("00-316253", "Persil Discs Color", "Waschmittel", getRandomInt(100,1000), "Packung 700G"));
		return products;
	}
}
