
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class Paddle here.
 * 
 * The Paddle class creates the paddles and places them in the world
 * on their corresponding sides (i.e. player one's side or player two's side),
 * it also checks for the key presses of the upKey, downKey, 'w', and 's' in
 * order to move up or down.
 * 
 * @author (Aric Johnson) 
 * @version (Dec, 2nd, 2018)
 */
public class Paddle extends Actor
{
    //TODO (108): Declare an integer instance constant called WIDTH that is initialized to 10
    private final int WIDTH = 10;
    
    //TODO (109): Declare an integer instance constant called HEIGHT that is initialize to 60
    private final int HEIGHT = 60;
    
    //TODO (110): Declare a String instance variable called upKey
    private String upKey;
    
    //TODO (111): Declare a String instance variable called downKey
    private String downKey;
    
    
    /**
     * TODO (112): Declare a constructor for the Paddle class with
     *             a boolean parameter called isLeft
     *          
     * TODO (113): Inside the constructor, declare a local GreenfootImage variable called paddleImage
     *             that is initialized to a new GreenfootImage object with a width of WIDTH and a height of HEIGHT
     *          
     * TODO (114): If the Paddle is on the left...
     * 
     *      TODO (115): Set the upKey equal to "w"
     *      
     *      TODO (116): Set the downKey equal to "s"
     *      
     *      TODO (117): Set the color of the paddle image to be player one's color
     *               
     * TODO (118): Otherwise...
     * 
     *      TODO (119): Set the upKey equal to "up"
     *      
     *      TODO (120): Set the downKey equal to "down"
     *      
     *      TODO (121): Set the color of the paddle image to be player two's color
     *               
     * TODO (122): Fill a rectangle on the paddleImage that starts at (0,0) and has a width of WIDTH and a height of HEIGHT
     * 
     * TODO (123): Set the image of the Paddle class to paddleImage
     */
    
    /**
     * Paddle is a constructor that makes the paddles be able
     * to move up and down with their corresponding key presses.
     * If the paddle is on the left side of the world the keys
     * you need to press are 'w' and 's' and if the paddle is 
     * on the right side, the keys you need to press are 'upKey' and 'downKey'
     * 
     * @param The isLeft boolean is true if the paddle is on the left.
     *  In this case it is used to apply certain key presses to the
     *  paddle on the left and right.
     *  
     *  @return This constructor is returning the Paddle class
     */
    public Paddle (boolean isLeft)
    {
       GreenfootImage paddleImage = new GreenfootImage (WIDTH, HEIGHT);
       
       if (isLeft == true)
       {
           upKey = "w";
           downKey = "s";
           paddleImage.setColor (Color.RED);
       }
       else
       {
          upKey = "up";
          downKey = "down";
          paddleImage.setColor (Color.BLUE);
       }
       
       paddleImage.fillRect (0, 0, WIDTH, HEIGHT);
       setImage (paddleImage);
    }
    
    /**
     * Act - do whatever the Paddle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //TODO (131): Use a method to check if the player has pressed keyboard keys
        checkKeyPress();
    }    
    
    /**
     * TODO (126): Declare a method called checkKeyPress that does not
     *             return anything and has no parameters
     *          
     * TODO (127): Inside the method, if the user has pressed down the upKey...
     *      
     *      TODO (128): Set the location to be the current X location and 4 pixels less than the current Y location
     *      
     * TODO (129): If the user has pressed down the downKey...
     * 
     *      TODO (130): Set the location to be the current X location and 4 pixels more than the current Y location
     */
    
    /**
     * checkKeyPresss checks if the upKey or downKey is pressed
     * then moves the paddle in either direction by 4 (up or down)
     * 
     * @param None There are no parameters
     * @return Nothing is returned
     */
    private void checkKeyPress()
    {
        if (Greenfoot.isKeyDown(upKey))
        {
            setLocation(getX(), getY() - 4);
        }
        
        if (Greenfoot.isKeyDown(downKey))
        {
            setLocation(getX(), getY() + 4);
        }
    }
    
}
