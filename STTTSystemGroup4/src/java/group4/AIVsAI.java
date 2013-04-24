/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package group4;

/**
 *
 * @author Tresspasser
 */
public class AIVsAI extends StttGame
{
  public AIVsAI(){}
  
  /**
   * Adds a move for player to board
   * 
   * @param move
   */
  @Override
  public void playMove(int move)
  {
    System.out.println("AIVsAI" + move);
  }  
  
  /**
   * 
   * @return a string with the value name of the game mode  
   */
  @Override
  public String getName()
  {
    return "aivsai";
  }  
  
  @Override
  public String toString()
  {
    return "AIVsAI";
  }

  @Override
  public boolean enableBoard() {
    throw new UnsupportedOperationException("Not supported yet.");
  }
}
