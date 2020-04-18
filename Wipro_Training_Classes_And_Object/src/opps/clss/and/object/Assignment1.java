package opps.clss.and.object;


class Box {
	private double width;
	private double height;
	private double depth;
	
	public Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public double getVolume() {
		return width * height * depth;
	}
}
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box(4, 7, 3);
		System.out.println(box.getVolume());

	}

}
