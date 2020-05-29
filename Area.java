
public class Area {
	
	public static double getArea(double radius) {
		
		return radius * radius * Math.PI;}

	public static double getArea(int length, int width) {
		return length * width;
	}
	
	public static double getArea(double radius, double height) {
		return Math.PI * radius * radius * height;
	}
	
	
}
