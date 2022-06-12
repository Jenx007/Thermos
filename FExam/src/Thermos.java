
public class Thermos {
	
	double volume;
	String brand, liq_juice;
	
	Thermos(double vol, String Brand, String lj)
	{
		volume = vol;
		this.brand = Brand;
		liq_juice = lj;
	}
	
	double addLiquid(double Advol)
	{
		volume = volume + Advol;
		return volume;
		
	}
	
	double pourLiquid(double Rmvol)
	{
		volume = volume - Rmvol;
		return volume;
	}
	void display()
	{
		System.out.println("Volume in Litres: " +volume+ " Litres");
		System.out.println("Brand Name: " +brand);
		System.out.println("Liquid: " +liq_juice);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thermos jc = new Thermos(0, "Godrej", "Orange juice");
		jc.addLiquid(0.95);
		jc.pourLiquid(0.25);
		jc.display();
	}

}
