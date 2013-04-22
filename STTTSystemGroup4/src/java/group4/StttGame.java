/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package group4;

/**
 *
 * @author Tresspasser
 */
public class StttGame 
{
  public StttGame(){}
  
  
  public String getName()
  {
    return "my Name";
  }
  
  @Override
  public String toString()
  {
    return "StttGame";
  }
  
  private StttBoard board = new StttBoard();
}
