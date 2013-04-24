/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package group4;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
/**
 *
 * @author Tresspasser
 */
@Named(value = "PVsAI")
@SessionScoped
public class PlayerVsAI extends StttGame implements Serializable
{

  public PlayerVsAI(){}
  
  
  /**
   * Adds a move for player to board
   * 
   * @param move
   */
  @Override
  public void playMove(int move)
  {
    System.out.println("PlayerVsAI" + move);
  }
  
  /**
   * 
   * @return a string with the value name of the game mode 
   */
  @Override
  public String getName()
  {
    return "playervsai";
  }
  
  @Override
  public String toString()
  {
    return "PlayerVsAI";
  }

  @Override
  public boolean enableBoard() {
    throw new UnsupportedOperationException("Not supported yet.");
  }
  
  
}
