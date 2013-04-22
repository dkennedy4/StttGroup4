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
        myGame = "playerVsPlayer";
        game = new PlayerVsPlayer();
        break;
      case PlayerVsAI:
        myGame = "playerVsAI";
        game = new PlayerVsAI();
        break;
      case AIVsAI:
        myGame = "aiVsAI";
        game = new AIVsAI();
        break;
      default:
        break;
    }

    System.out.println(game);
    System.out.println(game.getName());
    return myGame;
  }
   
   
  
  public enum GameType {PlayerVsPlayer, PlayerVsAI, AIVsAI}
  
  private GameType gameMode;
  
  private int matches = 1;
  
  private StttGame game;
 
}
 