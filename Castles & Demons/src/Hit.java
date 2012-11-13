import java.util.Random;

import javax.swing.*;

public class Hit {
	public int YouHit(int Espeed, int speed){
//////YOUR TURN/////////////////DO YOU HIT??/////////////////
	int hit=0;
	Random generator = new Random();
					/////enemy has higher speed
					if(Espeed>5*speed){
						hit=generator.nextInt(100); 
						
						//(randomInt+40)/enemyspeed   +   speed
						
						if(hit>65){
							JOptionPane.showMessageDialog(null, "You missed!");
						}
					}else{
						if(Espeed>2*speed){
							if(hit>40){
								JOptionPane.showMessageDialog(null, "You missed!");
							}
						}else{
							if (Espeed>speed){
								if(hit>65){
							
								JOptionPane.showMessageDialog(null, "You missed!");
								}
							}
						}
					}
							
						
					
						////you have higher speed
						if(Espeed<speed){
						
							if(hit<=65){
								hit=1;
							}
						}
							if(Espeed>2*speed){
								if(hit<=80){
									hit=1;
								}
								if (Espeed>5*speed){
									hit=1;
								}
							}
				////////////END OF HIT////////////////
	return hit;
						}
}
