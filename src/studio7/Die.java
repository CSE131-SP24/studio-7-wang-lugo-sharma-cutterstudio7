package studio7;

public class Die {
	private int n;
	private int sideLand;
	
	
	
	public Die(int n) {
		this.n = n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die d1 = new Die(5);
		System.out.println(d1.toString());

	}
	 public void side() {
		 sideLand = (int) ((Math.random() * (n - 1)) + 1);
	 }
	 public String toString(){
		 side();
		 return("The side the die landed on is: "+ sideLand);
	 }
}
