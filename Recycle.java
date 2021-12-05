/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package password_generator;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Amine
 */
public class Recycle {
    
    public StringBuilder passWord (String chr, int length){
    int stringLength = chr.length();
    StringBuilder pass = new StringBuilder();
    for (int i = 0 ; i < length ; i ++)  {
    int randnum = (int)(stringLength * Math.random());
    String chrtring = chr.substring(randnum, randnum +1 );
    pass.append(chrtring).append(" ");         
}    
    return pass;
       
}
  
}