package dice;

import java.util.Random;

public class ModDie extends Die 
{
	protected int m_modifier;
	protected boolean m_modIsLocked = false;
    protected int m_id;
	
	public ModDie(int sides) 
	{
		super(sides);
		m_modifier = 0;
		m_id = Math.abs(new Random(System.nanoTime()).nextInt(1000));
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
