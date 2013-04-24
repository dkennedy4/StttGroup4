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
 * @author David Kennedy 
 * @version 1.0 
 * This class is responsible for handling the input and output
 * to and from the web page.
 */
@Named(value = "game")
@SessionScoped
public class StttServer implements Serializable{

  /**
   * Creates a new instance of StttServer
   */
  public StttServer() 
  {
    
  }

  public GameType getGameMode() 
  {
    return gameMode;
  }

  public void setGameMode(GameType gameMode) 
  {
    this.gameMode = gameMode;
  }


  
  public String selectGame()
  {
    String myGame = "index";
    switch (gameMode)
    {
      case PlayerVsPlayer:
        game = new PlayerVsPlayer();
        break;
      case PlayerVsAI:
        game = new PlayerVsAI();
        break;
      case AIVsAI:
        game = new AIVsAI();
        break;
      default:
        break;
    }

    return game.getName();
  }

  public int getMove() 
  {
    return move;
  }

  public void setMove(int move) 
  {
    this.move = move;
    System.out.println(move);
  }
   
  public void selectMove()
  {
   game.playMove(move);
   gameBoard = game.board;
  }

  public boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }
   
 
  public enum GameType {PlayerVsPlayer, PlayerVsAI, AIVsAI}
  
  private GameType gameMode;
  
  private int matches = 1;
  
  private StttGame game;
 
  private boolean enabled = false;
  
  private StttBoard gameBoard;
  private int move;
  
}
 