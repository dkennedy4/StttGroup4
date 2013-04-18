/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package group4;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
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
public class StttGameServer implements Serializable{

  /**
   * Creates a new instance of StttGameServer
   */
  public StttGameServer() 
  {
  }

  
  public String getPlayer1() {
    return player1;
  }

  public void setPlayer1(String player1) {
    this.player1 = player1;
  }

  public String getPlayer2() {
    return player2;
  }

  public void setPlayer2(String player2) {
    this.player2 = player2;
  }

  public Integer getCordianate() {
    return cordianate;
  }

  public void setCordianate(Integer cordianate) {
    this.cordianate = cordianate;
  }

  public Integer getMoveCount() {
    return moveCount;
  }

  public void setMoveCount(Integer moveCount) {
    this.moveCount = moveCount;
  }

  private Integer cordianate;
  
  public String setMove()
  {
    
    return "";
  }
  
  private enum turn{blank, X, Y};
  
  private String player1;
  private String player2;  
  
  private Integer moveCount;
  @Inject
  private StttBoard gameBoard;
}
 