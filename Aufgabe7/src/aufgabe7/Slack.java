package aufgabe7;
import java.util.*;

public class Slack implements Publisher
{
	private Set <Listener> listeners;
	private int nrOfMessages;
	
	public Slack()
	{
		this.nrOfMessages = 0;
		this.listeners = new HashSet<>();
	}
	
	public void publishNews()
	{
		this.nrOfMessages++;
		this.notifyListeners();
	}
	
	@Override
	public boolean register(Listener listener) {
		
		return this.listeners.add(listener);
	}
	
	@Override
	public boolean unregister(Listener listener) {
		return this.listeners.remove(listener);
	}
	
	@Override
	public void notifyListeners() {
		Iterator it = this.listeners.iterator();
		while (it.hasNext())
		{
			Listener temp = (Listener) it.next();
			temp.update();
		}
	}
	@Override
	public String getUpdate(Listener listener) {
		return "Breaking News " + this.nrOfMessages;
	}
}
