package global;

import java.util.Set;

public class BonusFeat extends Feat
{

	BonusFeat()
	{
		super();
		m_name = "Bonus Feat: ";
	}
	
	public BonusFeat(Prerequisites prereq) 
	{
		this();
		if (prereq == null)
			return;
		m_prereqs.add(prereq);
	}
	
	public BonusFeat(Set<Prerequisites> prereqs) 
	{
		this();
		if (prereqs == null)
			return;
		m_prereqs.addAll(prereqs);
	}

}
