package group4;


import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
/**
 *
 * @author David Kennedy
 */

@Named(value = "PVsP")
@SessionScoped
public class PlayerVsPlayer extends StttGame implements Serializable
{
  
  public PlayerVsPlayer(){}
  
  
  
  /**
   * Adds a move for player to board
   * 
   * @param move
   */
  @Override
  public void playMove(int move)
  {
    System.out.println("PlayerVsPlayer" + move);
  }
  
  /**
   * 
   * @return a string with the value name of the game mode 
   */
  @Override
  public String getName()
  {
    return "playervsplayer";
  }
  
  @Override
  public String toString()
  {
    return "PlayerVsPlayer";
  }

  @Override
  public boolean enableBoard() 
  {
    throw new UnsupportedOperationException("Not supported yet.");
  }
  
}
