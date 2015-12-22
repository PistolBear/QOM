package characterClasses;

public class Save implements Progresses 
{
	private String m_name = "Save";

	public Save(String string) 
	{
		m_name = string;
	}

	@Override
	public void setProgression(ProgressionSpeed a) 
	{
		progressSpeed.setMultiplier(a.getMultiplier());
	}

}
