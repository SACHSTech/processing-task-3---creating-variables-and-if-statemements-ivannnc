



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




  }
  Random myCircle = new Random ();
  int circleRandomX = myCircle.nextInt((399 - 10) + 1 ) + 10;
  int circleRandomY = myCircle.nextInt((199 - 25) + 1 ) + 10;
  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

  // declare booleans
    boolean isMorning = circleRandomX <= 200;
    boolean isNight = circleRandomX >= 200;
    boolean isMorningY = circleRandomY <= 200;
    boolean isNightY = circleRandomY >= 200;

  
  // house
    strokeWeight(3);
    fill(92, 64, 51);
    square(width/2, (float)(height/1.7), (float)(width/3.4));
    triangle(width/2, (float)(height/1.69014085), (float)(width/1.53846154), height/3, (float)(width/1.2605042), (float)(height/1.69014085));
    fill(204, 204, 204);
    rect((float)(width/1.7), (float)(height/1.56), (float)(width/7.2), (float)(height/4.2));
    ellipse(425, 480, 25, 25);
    ellipse((float)(width/1.41), (float)(height/1.25), width/24, height/24);

  // moving sun 
    ellipse(circleRandomX, circleRandomY, 75, 75);
    if (isMorning == true) {
      background(51,153, 255);
      textSize(15);
      text("It is morning time", 100, 150);
    }
    else if (isMorningY == true){
      background(51,153, 255);
      textSize(15);
      text("It is morning time", 100, 150);
    }
    else if (isNight == true){
      background(0, 0, 204);
      textSize(15);
      text("It is night time", 100, 150);
    }
    else if (isNightY == true){
      background(0, 0, 204);
      textSize(15);
      text("It is night time", 100, 150);
    }

  

      
     

      }
    
    
    
  


    

  }


  
  // define other methods down here.
