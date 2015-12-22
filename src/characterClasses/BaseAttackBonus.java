package characterClasses;

public class BaseAttackBonus implements Progresses 
{

	@Override
	public void setProgression(ProgressionSpeed a) 
	{
		progressSpeed.setMultiplier(a.getMultiplier());
	}

}
