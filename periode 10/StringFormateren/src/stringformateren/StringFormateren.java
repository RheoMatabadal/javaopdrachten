/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringformateren;

import java.awt.Color;
import javax.swing.*;

public class StringFormateren extends JFrame{

    public static void main(String[] args) {
       
       JFrame frame = new StringFormateren();
       frame.setSize( 400,500 );
       frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
     
       JPanel paneel = new Paneel();
       frame.setContentPane(paneel);
       paneel.setBackground(new Color (0, 153, 153));
       frame.setVisible(true);
    }
}
