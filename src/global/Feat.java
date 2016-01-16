package global;

import java.util.HashSet;
import java.util.Set;

public class Feat implements HasPrerequisites 
{
	protected Set<Prerequisites> m_prereqs;
	protected String m_name;
	protected String m_description;
	protected Set<Object> m_affectedActions;
	
	
	Feat()
	{
		m_name = "Unknown Feat";
		m_description = "Unknown Feat does something";
		m_prereqs = new HashSet<Prerequisites>();
		m_prereqs.add(Prerequisites.NONE);
		m_affectedActions = new HashSet<Object>();
		
	}
	
	@Override
	public Set<Prerequisites> getPrerequisites() 
	{
		return m_prereqs;
	}

	public Set getAffectedActions()
	{
		return m_affectedActions;
	}
}
