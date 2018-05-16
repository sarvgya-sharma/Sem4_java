//CO 24557 : Assignment 3 - problem 2
//super class : Car ; sub-classes : Truck,Sedan

class Car
{
	int speed;
	double regularPrice;
	String color;

	public Car() {}

	public Car(int speed,double regularPrice,String color)
	{
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}

	double getSalePrice()
	{ return regularPrice;	}
}

class Truck extends Car
{
	int weight;

	public Truck() {}
	
	public Truck(int weight,int speed,double regularPrice,String color)
	{
		super(speed,regularPrice,color);
		this.weight = weight;
	}

	double getSalePrice()
	{
		if(weight>2000)		//10% discount
			return super.getSalePrice()-(0.1*super.getSalePrice());

		else			//20% discount
			return super.getSalePrice()-(0.2*super.getSalePrice());
 	}
}

class Ford extends Car
{
	int year;
	int manufacturerDiscount;

	public Ford() {}
	
	public Ford(int year,int discount,int speed,double regularPrice,String color)
	{
		super(speed,regularPrice,color);
		this.year = year;
		manufacturerDiscount = discount;
	}

	double getSalePrice()
	{
		return super.getSalePrice()-manufacturerDiscount;
 	}
}

class Sedan extends Car
{
	int length;

	public Sedan() {}
	
	public Sedan(int length,int speed,double regularPrice,String color)
	{
		super(speed,regularPrice,color);
		this.length = length;
	}

	double getSalePrice()
	{
		if(length>20)		//5% discount
			return super.getSalePrice()-(0.05*super.getSalePrice());

		else			//10% discount
			return super.getSalePrice()-(0.1*super.getSalePrice());
 	}
}

public class MyOwnAutoShop
{
	public static void main(String[] args)
	{
		Sedan car1 = new Sedan(25,230,1250000.0,"Natural silver");
				     //feet,kmph,Rs.,color

		Ford car2 = new Ford(2016,50000,180,510000.0,"Pearl White");
				   //year,Rs.(discount),kmph,Rs.,color
		
		Ford car3 = new Ford(2018,20000,200,630000.0,"Ocean Blue");
				   //year,Rs.(discount),kmph,Rs.,color

		System.out.print("\n\nCars available in the Auto shop are:");
		
		System.out.print("\n\nCar 1:");
		System.out.print("\nType: Sedan");
		System.out.print("\nLength: "+car1.length+" feet");
		System.out.print("\nSpeed: "+car1.speed+" Kmph");
		System.out.print("\nColor: "+car1.color);
		System.out.print("\nRegular Price: Rs."+car1.regularPrice);
		System.out.print("\nSale Price: Rs."+car1.getSalePrice());

		System.out.print("\n\nCar 2:");
		System.out.print("\nType: Ford");
		System.out.print("\nYear: "+car2.year);
		System.out.print("\nSpeed: "+car2.speed+" Kmph");
		System.out.print("\nColor: "+car2.color);
		System.out.print("\nRegular Price: Rs."+car2.regularPrice);
		System.out.print("\nManufacturer discount: Rs."+car2.manufacturerDiscount);
		System.out.print("\nSale Price: Rs."+car2.getSalePrice());

		
		System.out.print("\n\nCar 3:");
		System.out.print("\nType: Ford");
		System.out.print("\nYear: "+car3.year);
		System.out.print("\nSpeed: "+car3.speed+" Kmph");
		System.out.print("\nColor: "+car3.color);
		System.out.print("\nRegular Price: Rs."+car3.regularPrice);
		System.out.print("\nManufacturer discount: Rs."+car3.manufacturerDiscount);
		System.out.print("\nSale Price: Rs."+car3.getSalePrice());

	}
}	
		


















 