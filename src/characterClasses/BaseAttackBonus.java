package characterClasses;

import global.Progresses;
import global.ProgressionSpeed;

public class BaseAttackBonus implements Progresses
{
   String m_name = null;
   ProgressionSpeed m_progressSpeed = ProgressionSpeed.NEW;
   
   BaseAttackBonus()
   {
      m_name = "BAB";
   }

   public void setProgression(ProgressionSpeed a)
   {
      m_progressSpeed = a;
   }

   public int getBonusBasedOnLevel(int level)
   {
      int retval = 0;
      
      retval += (m_progressSpeed.getMultiplier() * (float) level);
      
      return retval;
   }

   /* (non-Javadoc)
    * @see java.lang.Object#hashCode()
    */
   @Override
   public int hashCode()
   {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((m_name == null) ? 0 : m_name.hashCode());
      result = prime * result + ((m_progressSpeed == null) ? 0 : m_progressSpeed.hashCode());
      return result;
   }

   /* (non-Javadoc)
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
      BaseAttackBonus other = (BaseAttackBonus) obj;
      if (m_name == null)
      {
         if (other.m_name != null)
            return false;
      }
      else if (!m_name.equals(other.m_name))
         return false;
      if (m_progressSpeed != other.m_progressSpeed)
         return false;
      return true;
   }

   
}
