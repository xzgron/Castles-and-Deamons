/*
Castles and Demons 1: The Swamp

 version 0.2

 
Niclas Fšlster 
Te21
Nacka Gymnasium
12/10 - 2012

*/

import javax.swing.*;

import java.awt.*;
import java.util.*;




public class Main_class {

	public static void main(String[] args) {
		
				Random generator = new Random();
//INTRO START////////////////////////			

				Object[] start = { "Start Game", "Exit"};
				int begin = JOptionPane.showOptionDialog(null, "CASTLES AND DEMONS I: The Swamp", "Castles & Demons",
				2, JOptionPane.QUESTION_MESSAGE,
				null, start, start[0]);
				String name = null;
		
		
				if(begin==JOptionPane.YES_OPTION){
			
		
		
					JOptionPane.showMessageDialog(null," Game started!", "C&D", JOptionPane.INFORMATION_MESSAGE);
		
		
					name = JOptionPane.showInputDialog(null," Hello adventurer, what is thy name?.", "C&D", JOptionPane.QUESTION_MESSAGE);
		
					JOptionPane.showMessageDialog(null,"Your destiny awaits " + name + "... "+"\n"+"You have been chosen to rid this world of evil!" +"\n"+" Now before you go, what was your personality again?","C&D", JOptionPane.INFORMATION_MESSAGE);
				}else{
					JOptionPane.showMessageDialog(null," Don't wanna play huh?!", "C&D", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
		}
		
			
//INTRO END////////////////////////	

				
				
//CLASSES START/////////////////////////
			
						Personality PersonalityObject = new Personality();
							
						int stats[]=new int[5];
						stats = PersonalityObject.personality(name);
					
						int attack = stats[0];
						int health = stats[1];
						int maxHealth = stats[2];
						int speed = stats[3];
						
						int skills=0;
						stats[4] = skills;
						
				
//CLASSES END/////////////////////////

						
						


						
						
//SKILLS START///////////////////////

						skills SkillObject = new skills();	
						
						skills = SkillObject.skill(skills);
						
						
//SKILLS END////////////////////////

				
/////!!!!!////////////////////PART ONE START/////////////////!!!!!!///////////
						int quest=0;
						while(quest<5){
							Object[] world = { "Fight enemies!","Buy Armor and heal", "Check stats, equipment and skills." };
							int way = JOptionPane.showOptionDialog(null, "What is thy path?", "Choice",
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
							null, world, world[0]);	
							
						
						
						
						
						
						
						
						
						}

/////!!!!!////////////////////PART ONE END/////////////////!!!!!!///////////						

		
System.exit(0);
	}

}
