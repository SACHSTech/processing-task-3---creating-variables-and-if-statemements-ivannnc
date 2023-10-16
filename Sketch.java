



import java.util.Random;

import processing.core.PApplet;

public class Sketch extends PApplet {
	

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
    
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {

  // moving sun 
    if (circleRandomX > 0 && circleRandomX < 133) {
        background(51, 153, 255);
        text("GOOD MORNING!", 100, 300);
      }
      else if (circleRandomX > 133 && circleRandomX < 266){
        background(0, 0, 255);
        text("GOOD AFTERNOON!", 100, 300);
      }
      else {
        background(0, 0, 204);
        textSize(15);
        text("GOOD NIGHT GO TO SLEEP!", 25, 300);
      }
    fill(255, 255, 0);
    ellipse(circleRandomX, circleRandomY, 75, 75);

  }

  Random myCircle = new Random ();
  int circleRandomX = myCircle.nextInt((399 - 10) + 1 ) + 10;
  int circleRandomY = myCircle.nextInt((100 - 25) + 1 ) + 10;

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

  // declare time variables  
    int intTimeHours = hour();
    int intTimeMinutes = minute();

  // print out time
  if (intTimeMinutes > 9){
    textSize(20);
    fill(intTimeMinutes*2, intTimeMinutes*4, intTimeMinutes*2);
    text("The time is: " + intTimeHours + ":" + intTimeMinutes, 100, 50); 
  }
  else 
    textSize(20);
    fill(0, 0, 0);
    text("The time is: " + intTimeHours + ":" + intTimeMinutes, 100, 50);
  
  
  // house
    strokeWeight(3);
    fill(92, 64, 51);
    square(width/2, (float)(height/1.7), (float)(width/3.4));
    triangle(width/2, (float)(height/1.69014085), (float)(width/1.53846154), height/3, (float)(width/1.2605042), (float)(height/1.69014085));
    fill(204, 204, 204);
    rect((float)(width/1.7), (float)(height/1.56), (float)(width/7.2), (float)(height/4.2));
    ellipse(425, 480, 25, 25);
    ellipse((float)(width/1.41), (float)(height/1.25), width/24, height/24);
    
    }
    }

  

      
     

      
    
    
    
  


    

  


  
  // define other methods down here.
