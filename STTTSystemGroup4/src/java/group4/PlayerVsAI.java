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
}
