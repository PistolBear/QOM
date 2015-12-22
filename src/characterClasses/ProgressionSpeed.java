package characterClasses;

/**
 * Used for having a uniform progression of something 
 *
 */
public enum ProgressionSpeed 
{
	SLOW(10), MEDIUM(30), FAST(50), 
	NONE(0), MSLOW(20), MFAST(40), 
	NEW(-1), 
	FULL(100), THREEQUARTERS(75), HALF(50), 
	POOR(3), GOOD(2), AVERAGE(1);
	
	int m_speedValue;
	
	ProgressionSpeed(int speed)
	{
		m_speedValue = speed;
		
	}

	public int getMultiplier()
	{
		return m_speedValue;
	}
	
	public void setMultiplier(int a)
	{
		// Can only set if it's a 0 or special number
		if (m_speedValue == -1 || m_speedValue == 0)
		{
			m_speedValue = a;
		}
	}
}
