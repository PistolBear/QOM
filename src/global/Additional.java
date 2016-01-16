package global;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Something that adds to a character and goes above normal guidelines for limits on those things.
 * 
 * Additional Skill Ranks from Human Race is an example of this.
 * 
 * @author woody
 *
 */
public class Additional implements HasPrerequisites
{
	int m_quantity;
	private Set<Prerequisites> m_prereqs;
	
	public Additional(int howMany) 
	{
		m_quantity = howMany;
		m_prereqs = new HashSet<Prerequisites>();
		m_prereqs.add(Prerequisites.NONE);
	}
	
	public Additional(int howMany, Prerequisites prereq) 
	{
		this(howMany);
		m_prereqs.add(prereq);
	}

	/** 
	 * Bonus skill ranks based on Race or other factors.  Typically only used with Humans.
	 * @param howMany
	 * @param prereq
	 * @return
	 */
	public static Additional skillRank(int howMany, Prerequisites prereq) 
	{
		return new Additional(howMany, prereq);
	}

	@Override
	public Set<Prerequisites> getPrerequisites() {
		return null;
	}
	

}
