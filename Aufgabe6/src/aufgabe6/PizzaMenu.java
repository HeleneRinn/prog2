package aufgabe6;
import java.util.*;

public class PizzaMenu {
	
	public static void main(String[] args)
	{
		Map <String, Double> mapPizza = new HashMap<>();
		mapPizza.put("Margerita", 7.00);	//Auto-Boxing: primitiver Wert double wird in Double umgewaldelt
		mapPizza.put("Veggie", 7.50);
		mapPizza.put("Salami", 8.50);
		mapPizza.put("Schinken", 8.50);
		//existingPizza(mapPizza, "Salami");
		//printPrice(mapPizza, "Tomate");
		//printPrice(mapPizza, "Schinken");
		//printMenu(mapPizza);
		//mapPizza.replace("Schinken",8.20);
		affordablePizza(mapPizza, 8.00);
		mapPizza.clear();
		mapPizza.put("Verde", 7.00);
		mapPizza.put("Hawaii", 8.20);
		mapPizza.put("Tradizionale", 8.50);
		
		Map <String, Double> mapPizza2 = new HashMap<>();
		mapPizza2.putAll(mapPizza);
		mapPizza2.remove("Hawaii");
		printMenu(mapPizza2);
	}
	
	public static boolean existingPizza(Map<String,Double> menu, String pizza)
	{
		if (menu.containsKey(pizza))
		return true;
		else return false;
	}
	
	public static void printPrice(Map<String,Double> menu, String pizza)
	{
		if (existingPizza(menu,pizza))
		{
			System.out.println("Preis: "+menu.get(pizza) + " Euro");
		}
		else System.out.println( pizza + " existiert nicht!");
	}
	
	public static void printMenu(Map<String,Double> menu)
	{
		if (menu.isEmpty())
			{
			System.out.println("Das Menu enthält 0 Pizzen");
			}
		else if (menu.size() == 1)
			{
			System.out.println("Das Menu enthält "+ menu.size() + " Pizza");
			for(Map.Entry<String, Double > entry : menu.entrySet())
	        {
	            System.out.println("Pizza " + entry.getKey() + ": " + entry.getValue()+ " Euro.");
	        }
			}
		else
		{
			System.out.println("Das Menu enthält "+ menu.size() + " Pizzen" );
			for(Map.Entry<String, Double > entry : menu.entrySet())
	        {
	            System.out.println("Pizza " + entry.getKey() + ": " + entry.getValue()+ " Euro.");
	        }
		}
	}
	
	public static void affordablePizza(Map<String,Double> menu, double maxPrice)
	{
		System.out.println("Eingegebener Betrag: "+ maxPrice + " Euro.");
		Set <String> pizzaNamen = new TreeSet<>();
		for(Map.Entry<String, Double > entry : menu.entrySet())
		{
			if (entry.getValue() <= maxPrice)
					{
						pizzaNamen.add(entry.getKey());
					}
		}
		if (pizzaNamen.isEmpty())
			{
				System.out.println("Leider gibt es zu diesem Preis keine Pizza.");
			}
		else {
			System.out.print("Moegliche Pizzen : [");
			Iterator it = pizzaNamen.iterator();
			while (it.hasNext())
			{
				System.out.print(it.next()+", ");
			}
			System.out.println("]");
	
		}
	}
	
}
