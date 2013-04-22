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

@Named(value = "PVsP")
@SessionScoped
public class PlayerVsPlayer extends StttGame implements Serializable
{
  
  public PlayerVsPlayer(){}
  
  @Override
  public String toString()
  {
    return "PlayerVsPlayer";
  }
  
}
