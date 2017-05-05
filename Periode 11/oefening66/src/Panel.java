import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



/**
 *
 * @author rheo
 */
public class Panel extends JPanel {
     private Teller teller;
  private JButton btnPlus, btnMin;
      
  public Panel(){
    setBackground( Color.WHITE );
    
    // Maak een instantie van Teller
    teller = new Teller();
    
    // De knoppen
    btnPlus = new JButton( "+" );
    btnMin = new JButton( "-" );
    
    btnPlus.addActionListener( new PlusHandler() );
    btnMin.addActionListener( new MinHandler() );
    
    add( btnPlus );
    add( btnMin );
    
  }
  
  public void paintComponent( Graphics g ) {
    super.paintComponent( g );
    g.drawString( "TellerValue " + teller.getWaarde(), 130, 100 );
  }
  
  class PlusHandler implements ActionListener {
    public void actionPerformed( ActionEvent e ) {
      teller.increase();
      repaint();
    }
  }
  
  class MinHandler implements ActionListener {
    public void actionPerformed( ActionEvent e ) {
      teller.decrease();
      repaint();
    }
  }
}
