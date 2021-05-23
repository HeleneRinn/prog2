package aufgabe5;

import java.util.*;

public class SetOperations {
	Set <Integer> numbers1 = new TreeSet<>();
	Set <Integer> numbers2 = new TreeSet<>();
	Set <Integer> both = new TreeSet<>();
	
	
	public void fill()
	{
		Random zufallszahl = new Random();
		
		for (int i=0; i<100; i++)
		{
			int wert1 = zufallszahl.nextInt(100);
			//int wert in objektwert
			Integer w1 = Integer.valueOf(wert1);
			numbers1.add(wert1);
			int wert2 = zufallszahl.nextInt(100);
			Integer w2 = Integer.valueOf(wert2);
			numbers2.add(wert2);
		}
	}
	
	public void fillBothUnion()
	{
		both.addAll(numbers1);
		both.addAll(numbers2);
	}
	
	public void fillBothIntersection()
	{
		both.addAll(numbers1);
		both.retainAll(numbers2);
	}
	
	public void fillBothDifference()
	{
		this.fillBothUnion();
		Set <Integer> delete = new TreeSet<>();
		delete.addAll(numbers1);
		delete.retainAll(numbers2);
		both.removeAll(delete);
	}
	
	public void print()
	{
		for (int j=0; j<10; j++)
		{
			for (int i=0; i<10; i++)
			{
				if (numbers1.contains(Integer.valueOf(i+10*j)))
				{
					System.out.print(" .");
				}
				else System.out.print("  ");	
				
			}
			System.out.print("       ");

			for (int i=0; i<10; i++)
			{
				if (numbers2.contains(Integer.valueOf(i+10*j)))
				{
					System.out.print(" .");
				}
				else System.out.print("  ");	
			}
			System.out.print("       ");

			for (int i=0; i<10; i++)
			{
				if (both.contains(Integer.valueOf(i+10*j)))
				{
					System.out.print(" .");
				}
				else System.out.print("  ");	
			}
			System.out.println();
		}
		System.out.println();
	}
	
	//zum abrufen der werte:
	//Iterator it = number1.iterator();
	// while(it.hasNext()) {
	//System.out.println(it.next());

}
