import javax.swing.*;


public class Personality {

	
	public int[] personality(String name){
	Object[] options = { "Hot-tempered", "Protective", "Deceitful" };
	int choice = JOptionPane.showOptionDialog(null, "Choose your personality!", "Personality Selection",
	JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
	null, options, options[0]);
	
//Stats array. attack, health, maxhealth, speed, skill
	int stats[]=new int[5];
	
	
///////////classes//////////
	switch (choice){
	
	case 0: //Hot-tempered
		
		stats[0]=20;
		stats[1]=20;
		stats[2]=20;
		stats[3]=60;
		
		stats[4]=1;
		
		
		
		
		JOptionPane.showMessageDialog(null,"  Woah! calm down, " + name + "! I just asked a question!" + "\n" + "\n" + "Stats:" + "\n" + "Health: 20" + "\n" + "Attack: 20" + "\n" + "Speed: 60", "C&D", JOptionPane.INFORMATION_MESSAGE);
	break;
	
	case 1: //Protective
		
		stats[0]=15;
		stats[1]=30;
		stats[2]=30;
		stats[3]=55;
		
		stats[4]=2;
		

		
		
		
		JOptionPane.showMessageDialog(null," Thats " + name + " alright! But remember, sometimes attack is best defence. "+ name +  "\n" + "\n" + "Stats:" + "\n" + "Health: 30" + "\n" + "Attack: 15" + "\n" + "Speed: 55", "C&D", JOptionPane.INFORMATION_MESSAGE);
	break;
	
	case 2: //Decitful
		
		stats[0]=20;
		stats[1]=10;
		stats[2]=10;
		stats[3]=70;
		
		stats[4]=3;
	
		
		JOptionPane.showMessageDialog(null," I remember now! You are deceitful, you sneaky bastard... " + name + "." + "\n" + "Stats:" + "\n" + "Health: 5" + "\n" + "Attack: 25" + "\n" + "Speed: 70", 
				"C&D", JOptionPane.INFORMATION_MESSAGE);
		break;
		
		default:
			System.exit(0);
	}
	//skills end
	
	
	return stats; 
	}
}
