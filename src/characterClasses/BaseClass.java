package characterClasses;

import global.ProgressionSpeed;
import global.Save;
import global.Skill;
import global.SkillName;

import java.util.ArrayList;

public abstract class BaseClass implements IBaseClass
{
   protected String m_name;

   protected BaseAttackBonus BAB;

   protected Save FORT, REF, WILL;

   protected String m_classFeatures;

   protected int m_hitDieSize;

   private int m_level;

   ArrayList<Skill> AllSkills = new ArrayList<Skill>();

   ArrayList<Skill> ClassSkills = new ArrayList<Skill>();

   public BaseClass()
   {
      m_name = "Commoner";
      m_level = 1;
      BAB = new BaseAttackBonus();
      FORT = new Save("FORT");
      FORT.setProgression(ProgressionSpeed.POOR);
      REF = new Save("REF");
      REF.setProgression(ProgressionSpeed.POOR);
      WILL = new Save("WILL");
      WILL.setProgression(ProgressionSpeed.POOR);
      m_classFeatures = null;
      m_hitDieSize = 4;
   }

   /* (non-Javadoc)
    * @see characterClasses.IBaseClass#rollSkill(characterClasses.SkillName)
    */
   @Override
   public int rollSkill(SkillName name)
   {
      int total = 0;

      if (ClassSkills.contains(name))
      {
         total += 3;
      }

      return total;
   }

   /* (non-Javadoc)
    * @see characterClasses.IBaseClass#getLevel()
    */
   @Override
   public int getLevel()
   {
      return m_level;
   }

   /* (non-Javadoc)
    * @see characterClasses.IBaseClass#levelUp()
    */
   @Override
   public void levelUp()
   {
      int newLevel = m_level + 1;

      // / Do other stuff: check for inconsistencies, racial modifiers, ask for
      // input, whatever.

      // Update feats, abilities, etc. based on selections from input.

      m_level = newLevel;
   }

   abstract public void setClassFeatures();

   /* (non-Javadoc)
    * @see characterClasses.IBaseClass#getClassFeatures()
    */
   @Override
   public String getClassFeatures()
   {
      return m_classFeatures;
   }

   /* (non-Javadoc)
    * @see characterClasses.IBaseClass#getBAB()
    */
   @Override
   public int getBAB()
   {
      return BAB.getBonusBasedOnLevel(getLevel());
   }
   
   /* (non-Javadoc)
    * @see characterClasses.IBaseClass#getFort()
    */
   @Override
   public int getFort()
   {
      return FORT.getBonusBasedOnLevel(getLevel());
   }

   /* (non-Javadoc)
    * @see characterClasses.IBaseClass#getRef()
    */
   @Override
   public int getRef()
   {
      return REF.getBonusBasedOnLevel(getLevel());
   }
   
   /* (non-Javadoc)
    * @see characterClasses.IBaseClass#getWill()
    */
   @Override
   public int getWill()
   {
      return WILL.getBonusBasedOnLevel(getLevel());
   }

   /*
    * (non-Javadoc)
    * @see java.lang.Object#hashCode()
    */
   @Override
   public int hashCode()
   {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((BAB == null) ? 0 : BAB.hashCode());
      result = prime * result + ((ClassSkills == null) ? 0 : ClassSkills.hashCode());
      result = prime * result + ((FORT == null) ? 0 : FORT.hashCode());
      result = prime * result + ((REF == null) ? 0 : REF.hashCode());
      result = prime * result + ((WILL == null) ? 0 : WILL.hashCode());
      result = prime * result + ((m_classFeatures == null) ? 0 : m_classFeatures.hashCode());
      result = prime * result + m_hitDieSize;
      result = prime * result + ((m_name == null) ? 0 : m_name.hashCode());
      return result;
   }

   /*
    * (non-Javadoc)
    * @see java.lang.Object#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object obj)
   {
      if (this == obj)
         return true;
      
      if (obj == null)
         return false;
      
      if (getClass() != obj.getClass())
         return false;
      
      BaseClass other = (BaseClass) obj;
      if (BAB == null)
      {
         if (other.BAB != null)
            return false;
      }
      else if (!BAB.equals(other.BAB))
         return false;
      if (ClassSkills == null)
      {
         if (other.ClassSkills != null)
            return false;
      }
      else if (!ClassSkills.equals(other.ClassSkills))
         return false;
      if (FORT == null)
      {
         if (other.FORT != null)
            return false;
      }
      else if (!FORT.equals(other.FORT))
         return false;
      if (REF == null)
      {
         if (other.REF != null)
            return false;
      }
      else if (!REF.equals(other.REF))
         return false;
      if (WILL == null)
      {
         if (other.WILL != null)
            return false;
      }
      else if (!WILL.equals(other.WILL))
         return false;
      if (m_classFeatures == null)
      {
         if (other.m_classFeatures != null)
            return false;
      }
      else if (!m_classFeatures.equals(other.m_classFeatures))
         return false;
      if (m_hitDieSize != other.m_hitDieSize)
         return false;
      if (m_name == null)
      {
         if (other.m_name != null)
            return false;
      }
      else if (!m_name.equals(other.m_name))
         return false;
      return true;
   }

   @Override
   public String toString()
   {
      return m_name;
   }

}
