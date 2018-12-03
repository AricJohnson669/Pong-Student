import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class Score here.
 * 
 * The Score class pastes either of the players scores
 * on the world and updaes them when each player gets 
 * a point.
 * 
 * @author (Aric Johnson) 
 * @version (Dec, 2nd, 2018)
 */
public class Score extends Actor
{
    //TODO (18): Declare an integer instance variable called playerScore
    private int playerScore;
    
    //TODO (19): Declare a boolean instance variable called isLeft
    private boolean isLeft;
    
    //TODO (20): Declare a boolean instance variable called scoreChanged
    private boolean scoreChanged;

    /**
     * TODO (21): Declare a constructor for Score that has a boolean
     *            parameter called onLeft
     *          
     * TODO (22): Initialize playerScore to be 0
     * 
     * TODO (23): Initialize isLeft to be the value from the onLeft parameter
     * 
     * TODO (32): Make a method call to displayScore
     */
    
    /**
     * This constructor of the Score class initializes the player score to 0,
     * initializes the isLeft boolean to onLeft, and desplays the score.
     *  
     * @param The onLeft boolean determines if the player score is on the left side of the world
     * @return The Score class is bein returned
     */
    public Score (boolean onLeft)
    {
        playerScore = 0;
        isLeft = onLeft;
        displayScore();
    }

    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //TODO (33): If the score has changed...
        if (scoreChanged = true)
        {
            //TODO (34): Display the score
            displayScore();
        }
    }    

    /**
     * TODO (24): Declare a method called displayScore that does not
     *            return anything and has no parameters
     *          
     * TODO (25): Inside the method, declare a local GreenfootImage variable called display
     * 
     * TODO (26): If the Score is on the left...
     * 
     *      TODO (27): Initialize the display variable to a new GreenfootImage object
     *                 that uses playerScore changed to a String (use Integer.toString()),
     *                 a font size of 30, any color for the font color (this will be 
     *                 player one's color and you will need to remember what color you chose 
     *                 for other parts of this program), and BLACK for the background color
     *               
     * TODO (28): Otherwise...
     * 
     *      TODO (29): Initialize the display variable to a new GreenfootImage object
     *                 that uses playerScore changed to a String, a font size of 30, 
     *                 a new color for the font color (this will be player two's color and 
     *                 you will need to remember what color you chose for other parts of this program) 
     *                 and BLACK for the background color
     *               
     * TODO (30): Set the image of the Score class to the display image
     * 
     * TODO (31): The score is now updated and the display will not need to be changed. Change the value for the variable that stores this info
     */
    
    /**
     * displayScore pastes the player 1 score on the left side of the
     * screen in the colour of red and it pastes the player 2 score 
     * on the right side of the screen in the colour of blue.
     * 
     * @param None There are no parameters
     * @return Nothing is being returned
     */
    private void  displayScore()
    {
        GreenfootImage display;
        
        if (isLeft == true)
        {
            display = new GreenfootImage (Integer.toString(playerScore), 30, Color.RED, Color.BLACK);
        }
        else
        {
            display = new GreenfootImage (Integer.toString(playerScore), 30, Color.BLUE, Color.BLACK);
        }
        
        setImage (display);
        scoreChanged = false;
    }

    /**
     * TODO (35): Declare a public method called countScore that does not
     *            return anything and has no parameters
     *          
     * TODO (36): Inside the method, increase playerScore by 1 (increment the playerScore)
     * 
     * TODO (37): The score has now changed. Change the variable that stores this info
     */
    
    /**
     * countScore adds to the score and checks if the 
     * player's score has been change from 0 is true
     * 
     * @param None There are no parameters
     * @return Nothing is being returned
     */
    public void countScore()
    {
        playerScore ++;
        scoreChanged = true;
    }

    /**
     * TODO (38): Declare a public method called getScore that returns
     *            an integer value and has no parameters
     *          
     * TODO (39): Inside the method, return the score for the scoreboard
     */
    
    /**
     * getScore returns the playerScore integer
     * 
     * @param None There are no parameters
     * @return playerScore is an integer that represents the players score 
     */
    public int getScore()
    {
        return playerScore;
    }
}
