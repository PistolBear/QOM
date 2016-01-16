package dice;


public class NamedDie extends ModDie 
{
	private String m_name;
	private boolean m_nameIsLocked = false;
	
	public NamedDie(int sides) 
    {
        super(sides);
        m_name = GreekRomanName.genName() + ' ' + m_id;
    }
	
	public NamedDie(String name, int sides) 
    {
        super(sides);
        m_name = name;
    }
	
	public NamedDie(String name, int sides, int modifier) 
    {
        this(name, sides);
        m_modifier = modifier;
        m_modIsLocked = m_nameIsLocked = true;
    }
	
	public String getName()
	{
		return m_name;
	}
	
	public void setName(String name)
	{
	   if (m_nameIsLocked)
	      return;
	   
	   m_name = name;
	}

}
