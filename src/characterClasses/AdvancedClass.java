package characterClasses;


public class AdvancedClass extends BaseClass implements IBaseClass 
{
	AdvancedClass(BaseClass base)
	{
		BAB = base.BAB;
		FORT = base.FORT;
		REF = base.REF;
		WILL = base.WILL;
	}

   @Override
   public void setClassFeatures()
   {
      m_classFeatures = "None";
   }

}
