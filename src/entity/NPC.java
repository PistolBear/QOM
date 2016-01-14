package entity;

import java.util.LinkedList;

import pathmaker.out.ConsoleConstants;
import characterClasses.BaseClass;
import characterClasses.FighterClass;
import characterClasses.IBaseClass;
import characterRaces.Race;

public class NPC
{

   private String m_name;
   LinkedList <IBaseClass> m_classes = null;
   Race m_race = null;
   
   private NPC() {};

   public NPC(String name, String firstClass)
   {
      m_name = name;
      addLevelInClass(firstClass);
      
   }

   private void addLevelInClass(String classToAdd)
   {
      if (m_classes == null)
      {
         m_classes = new LinkedList<IBaseClass>();
      }
      
      IBaseClass incoming = levelFromClass(classToAdd);
      
      if (m_classes.contains(incoming))
      {
         m_classes.get(m_classes.indexOf(incoming)).levelUp();
      }
      
      else
      {
         m_classes.add(incoming);
      }
      
      if (ConsoleConstants.DEBUG)
      {
         System.out.print("Leveling a " + m_classes.get(0).toString() + " at Level " + getLevel() 
               + " with the following base Stats:\nBAB: " + getBAB() + "  FORT: " + getFort() 
               + "  REF: " + getRef() + "  WILL: " + getWill() + " named \"" + m_name + "\"\n\n");
      }
   }
   
   private IBaseClass levelFromClass(String classToAdd)
   {
      switch(classToAdd)
      {
         case IBaseClass.FIGHTER:
            return new FighterClass();
         case IBaseClass.WIZARD:
            default:
               return new BaseClass()
               {
                  @Override
                  public void setClassFeatures()
                  {
                     m_classFeatures = "None";
                  }
               };
      }
   }

   private int getLevel()
   {
      int val = 0;
      for (int i = 0; i < m_classes.size(); i++)
      {
         val += m_classes.get(i).getLevel();
      }
      return val;
   }

   private int getFort()
   {
      int val = 0;
      for (int i = 0; i < m_classes.size(); i++)
      {
         val += m_classes.get(i).getFort();
      }
      return val;
   }

   private int getRef()
   {
      int val = 0;
      for (int i = 0; i < m_classes.size(); i++)
      {
         val += m_classes.get(i).getRef();
      }
      return val;
   }

   private int getWill()
   {
      int val = 0;
      for (int i = 0; i < m_classes.size(); i++)
      {
         val += m_classes.get(i).getWill();
      }
      return val;
   }

   private int getBAB()
   {
      int val = 0;
      for (int i = 0; i < m_classes.size(); i++)
      {
         val += m_classes.get(i).getBAB();
      }
      return val;
   }

   public void addLevelsInClass(String classToAdd, int numberOfLevels)
   {
      for (int i = 0; i < numberOfLevels; i++)
      {
         addLevelInClass(classToAdd);
      }
   }

}
