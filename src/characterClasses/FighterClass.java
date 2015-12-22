package characterClasses;


public class FighterClass extends BaseClass 
{
	FighterClass()
	{
		m_name = "Fighter";
		
		BAB.setProgression(ProgressionSpeed.FULL);
		FORT.setProgression(ProgressionSpeed.GOOD);
		REF.setProgression(ProgressionSpeed.AVERAGE);
		WILL.setProgression(ProgressionSpeed.POOR);
	}	
		

}
