package opps.clss.and.object;

class Patient {
	private String name;
	private double height;
	private double weight;
	
	public Patient(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public double BMI () {
		
		System.out.println(name);
		return ( weight / ( height * height ) ) * 703;
	}
}
public class Assignment3 {

	public static void main(String[] args) {
		Patient patient = new Patient("Nusarat", 157/2.54, 50*2.2);
		
		System.out.println(patient.BMI());

	}
}
