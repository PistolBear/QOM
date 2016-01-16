package global;

public enum Size 
{
	FINE(8), DIMINUTIVE(4), TINY(2), SMALL(1), MEDIUM(0), LARGE(-1), HUGE(-2), GARGANTUAN(-4), COLOSSAL(-8);

	private int m_sizeModifier;

	Size(int mod)
	{
		m_sizeModifier = mod;
	}
	
	public int getSizeModifier()
	{
		return m_sizeModifier;
	}
}
