package dice;

public class ModDie extends Die 
{
	private int m_modifier;
	private boolean m_modIsLocked = false;
	
	public ModDie(int sides) 
	{
		super(sides);
		m_modifier = 0;
	}
	
	public ModDie(int sides, int mod) 
	{
		this(sides);
		m_modifier = mod;
	}
	
	public int getModifier()
	{
		return m_modifier;
	}
	
	public void setModifier(int newModifier) 
	{
		if (newModifier == m_modifier)
		{
			return;
		}
		
		if (m_modIsLocked)
		{
			return;
		}
		
		this.m_modifier = newModifier;
	}
	
	public void lockModifier()
	{
		m_modIsLocked = m_modIsLocked?false:true;
	}
	
	@Override
	public int roll() {
		return (int)(randomLong() % m_sides)+1 + m_modifier;
	}
}
