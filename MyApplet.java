/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package helloworld;

import java.applet.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author A605
 */
public class MyApplet extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
   
    public void paint(Graphics g){
           g.drawString("Hello World Applet Java", 100, 100);
    }
    

    // TODO overwrite start(), stop() and destroy() methods
}
