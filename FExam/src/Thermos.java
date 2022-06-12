
public class Thermos {
	
	double volume;
	String brand, liq_juice;
	
	Thermos(double vol, String Brand, String lj)
	{
		volume = vol;
		this.brand = Brand;
		liq_juice = lj;
	}
	
	void addLiquid(double vol, String Brand, String lj)
	{
		volume = vol;
		this.brand = Brand;
		liq_juice = lj;
	}
	
	void display()
	{
		System.out.println("Volume in Litres: " +volume+ " Litres");
		System.out.println("Brand Name: " +brand);
		System.out.println("Liquid: " +liq_juice);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thermos jc = new Thermos(0, " ", " ");
		jc.addLiquid(0.95, "Godrej", "Orange juice");
		jc.display();
	}

}
