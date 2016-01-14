package characterClasses;

public interface IBaseClass
{

   int rollSkill(SkillName name);

   int getLevel();

   void levelUp();

   String getClassFeatures();

   int getBAB();

   int getFort();

   int getRef();

   int getWill();
   
   public static final String FIGHTER = "Fighter";
   public static final String WIZARD = "Wizard";

}