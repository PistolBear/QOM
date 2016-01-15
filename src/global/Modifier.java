package global;


/**
 * Wraps an integer modifier for stats, rolls, etc.
 * 
 */
public class Modifier 
{
	private int m_value;
	
	public Modifier(int a)
	{
		m_value = Math.abs(a);
	}
	
	public int get()
	{
		return m_value;
	}
	
	public void set(int newValue)
	{
		if (m_value != newValue)
		{
			m_value = newValue;
		}
	}

	public void newAbScore(int value) {
		if (value > 10)
		{
			set((m_value - 10) /2);
		}
		
		if (value > 0)
		{
			set((10 - m_value) /2);
		}

		if (value <= 0)
		{
			set(-1);
		}
	}

}
