package Test;

import java.util.ArrayList;

	public class methodcall 
	{
	    public static void main(String[] args)
	    {
	      ArrayList<String> car = new ArrayList<>();
	      
	      car.add("Dzhiguli");
	      car.add("Kamaz");
	      car.add("Zaporozhets");
	      car.add("Lada");
	      car.add("Kraz");
	      car.add("Bambula");
	      car.add("Sraka");
	      car.add("Brevno");
	      car.add("Zaraza");
	      car.add("Volga");
	      
	      System.out.println(car.size());
	      
//	      for (int i = 0; i <= car.size(); i++);
	      
	      System.out.println(car);
	      
	      car.set(0, "Reno");
	      car.set(1, "Lambogini");
	      car.set(2, "BMW");
	      car.set(3, "Porshe");
	      car.set(4, "Lancia");
	      
	      
	      System.out.println(car.size());
	      System.out.println(car.get(0));
	      System.out.println(car.get(1));
	      System.out.println(car.get(2));
	      System.out.println(car.get(3));
	      System.out.println(car.get(4));
	      
	      
	 }
	    
	}
