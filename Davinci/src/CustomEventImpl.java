import java.util.*;

@SuppressWarnings("unchecked")
public class CustomEventImpl
{
	private Hashtable<Class, Vector<CustomEvent.Listener>> d_listenerList = new Hashtable<Class, Vector<CustomEvent.Listener>>();

	// This methods allows classes to register for MyEvents
	public <T> void addListener(Class<T> cl, CustomEvent.Listener<T> listener) {
		Vector<CustomEvent.Listener> items;
		
		if (!d_listenerList.containsKey(cl))
		{
			items = new Vector<CustomEvent.Listener>();
			d_listenerList.put(cl, items);
		}
		else
		{
			items = d_listenerList.get(cl);
		}
		
		items.add(listener);
	}

	// This methods allows classes to unregister for MyEvents
	public <T> void removeListener(Class<T> cl, CustomEvent.Listener<T> listener) {
		if (d_listenerList.containsKey(cl))
		{
			Vector<CustomEvent.Listener> items = d_listenerList.get(cl);
			
			items.remove(listener);
		}
	}

	// This private class is used to fire MyEvents
	public <T> void fire(Class<T> cl, CustomEvent.Event<T> e) {
		if (!d_listenerList.containsKey(cl))
			return;
		
		Vector<CustomEvent.Listener> items = d_listenerList.get(cl);
		
		for (CustomEvent.Listener item : items)
			item.customEventOccurred(e);
	}
}
