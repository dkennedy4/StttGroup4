
package group4;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author David Kennedy
 */
@Named(value = "stttBoard")
@SessionScoped
public class StttBoard implements Serializable{

  /**
   * Creates a new instance of StttBoard
   */
  public StttBoard() {
  }
  

  public void newBoard()
  {
    board = new Character[ROWS][COLS]; 
  }        

  public int getxCord() {
    return xCord;
  }

  public void setxCord(int xCord) {
    this.xCord = xCord;
  }

  public int getyCord() {
    return yCord;
  }

  public void setyCord(int yCord) {
    this.yCord = yCord;
  }
  
  public void makeMove(Character token)
  {
    board[xCord][yCord] = token;
  }
  
  
  private final int ROWS = 3;
  private final int COLS = 3;
  private int xCord;
  private int yCord;
  
  private Character[][] board;  
}