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
  
  
  public abstract String getName();
  
  @Override
  public String toString()
  {
    return "StttGame";
  }
  
  private StttBoard board = new StttBoard();
}
