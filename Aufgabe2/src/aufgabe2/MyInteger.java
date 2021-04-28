package aufgabe2;

public class MyInteger {
	static int MAX_VALUE = 2147483647;
	static int MIN_VALUE = -2147483648;
	
	private int value;
	
	public MyInteger (int value)
	{
		this.value= value;
	}
	public MyInteger (String s)
	{
		try 
		{
			this.value= parseInt(s);
		}
		catch(IllegalArgumentException e)
		{
			throw new IllegalArgumentException(e.getMessage());
		}
	}
	
	public int intValue()
	{
		return this.value;
	}
	
	public double doubleValue()
	{
		return (double)this.value;
	}
	
	static MyInteger valueOf(String s)
	{
		MyInteger v = new MyInteger(s);
		return v;
	}
	
	static int parseInt (String s) throws IllegalArgumentException
	{
		int value = 0;
		boolean positiv = true;
		if (s.length() == 0)
		{
			throw new IllegalArgumentException("Der String darf nicht leer sein!");
		}
		
		for (int i = 0; i < s.length(); i++)
		{
			if (i == 0)
			{
				if (s.charAt(0) == 43)
				{
					continue;
				}
				if (s.charAt(0) == 45)
				{
					positiv = false;
					continue;
				}
				
			}
			if ((int)s.charAt(i) > 57 || (int)s.charAt(i) < 48)
			{
				throw new IllegalArgumentException("Der String ist keine Zahl");
			}
			value = value*10;
			value += (int)s.charAt(i) - 48;
		}
		if (positiv == true) return value;
		else return value * -1;
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof MyInteger))
		{
			return false;
		}
		MyInteger o = (MyInteger) obj;
		if (this.value == o.intValue())
			return true;
		else return false;
	}
	@Override
	public String toString() {
		String ergebnis = "";
		int value = this.value;
		int aktuelleZahl;
		
		if (value < 0)
		{
			while (value > 0)
			{
				aktuelleZahl = value % 10;
				value = value/10;
				ergebnis = ((char)aktuelleZahl+48) +ergebnis;
			}
		//	ergebnis = ergebnis;  
		}
		
		if (value != 0)
		{
			value = value *(-1);
			while (value > 0)
			{
				aktuelleZahl = value % 10;
				value = value/10;
				ergebnis = ((char)aktuelleZahl+48) +ergebnis;
			}
		ergebnis = "-" + ergebnis;
		}
		return ergebnis;
}}
