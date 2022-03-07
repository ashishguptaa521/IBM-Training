package new_features;

public class Car {
	private String model;
	private String[] features;

//It can only be the last parameter 
	public Car(String model, String... features) { // var- args
		this.model = model;
		this.features = features;
	}

	public void specs() {
		System.out.println("Features of " + model + "-");
		for (String f : features)
			System.out.println("-" + f);
	}

	public static void main(String[] args) {
		Car alto = new Car("Maruti Alto", "140 HP", "AC-Airbags", "RWD");
		alto.specs();

		Car astor = new Car("MG Astor", "250 HP", "AC-Airbags", "AWD");
		astor.specs();
	}
}
