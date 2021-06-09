package aufgabe7;

public class Student implements Listener
{
	private String name;
	private Publisher publisher; 
	
	public Student (String name)
	{
		this.name = name;
	}
	
	public void setPublisher(Publisher publisher)
	{
		if (publisher.register(this))
		{
			System.out.println(this.name + " registred!");
			this.publisher = publisher;
		}
	}

	@Override
	public void update() 
	{
		String msg = this.publisher.getUpdate(this);
		System.out.println(this.name + " received " + msg);
	}

	@Override
	public void removePublisher(Publisher publisher) {
		if (publisher.unregister(this))
		{
			System.out.println(this.name + " deregistered!");
			this.publisher = null;
		}
		
	}
	
	public boolean equals(Student s)
	{
		if (s.name.equals(this.name))
		{
			return true;
		}
		else return false;
	}
	
	public int hashCode()
	{
		int hash = 0;
		for (int i =0; i<this.name.length(); i++)
		{
			hash = hash+ this.name.charAt(i) * 11;
		}
		return hash;
	}
}
