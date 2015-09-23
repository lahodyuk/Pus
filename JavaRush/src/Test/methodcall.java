package Test;

import java.util.ArrayList;

	public class methodcall 
	{
	    public static void main(String[] args)
	    {
	      ArrayList<String> car = new ArrayList<>();
	      
	      car.add("Шистірка");
	      car.add("Запорожець");
	      car.add("Москвич");
	      car.add("Трабант");
	      car.add("Вісімка");
	      car.add("Девятка");
	      car.add("Шістка");
	      car.add("Лада");
	      car.add("Камаз");
	      car.add("Краз");
	      
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
