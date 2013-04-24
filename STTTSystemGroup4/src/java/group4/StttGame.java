/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package group4;

/**
 *
 * @author Tresspasser
 */
public abstract class StttGame 
{
  public StttGame(){}
  
  public abstract void playMove(int move);
  
  public abstract String getName();
  
  public abstract boolean enableBoard();
          

  public StttBoard getBoard() {
    return board;
  }

  public void setBoard(StttBoard board) {
    this.board = board;
  }
  
  
  @Override
  public String toString()
  {
    return "StttGame";
  }
  
  protected StttBoard board = new StttBoard();
  
  private Character playerX = 'X';
  private Character playerY = 'O';
  
  private int playerMove;
  
}
