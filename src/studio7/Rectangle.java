package studio7;

public class Rectangle {

	
	private int length;
	private int width;
	private int area;
	private int perimeter;
	
	//constructor 
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(5,7);
		System.out.println(r1.toString());
		
	}
	
	public void rec() {
		 this.area = length * width;
		 this.perimeter = (2*length)+(2*width);
		
		
	}
	
	public String toString(){
		rec();
		return("This is the area of the rectangle: " + area + ". This is the perimeter of the rectangle: " + perimeter + ".");

		
	}
	

} 