import java.util.*;
import java.awt.event.*;
import javax.swing.event.*;

public class CustomEvent
{
	// Declare the event. It must extend EventObject.
	static public class Event<T> extends EventObject
	{
		private T d_value;

		public Event(Object source, T value) {
			super(source);

			d_value = value;
		}

		public T getValue()
		{
			return d_value;
		}
		
		public Class getValueClass()
		{
			return d_value.getClass();
		}
	}

	// Declare the listener class. It must extend EventListener.
	// A class must implement this interface to get MyEvents.
	static public interface Listener<T> extends EventListener
	{
		public void customEventOccurred(Event<T> e);
	}
}
