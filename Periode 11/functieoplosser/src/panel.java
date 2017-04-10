import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
public class panel extends JPanel {
    
    private JTextField txtA , txtB , txtC, txtX, txtXas, txtYas,txtDisc, txtParab, txtVerg  ;
    private JLabel lblA, lblB, lblC, lblX, lblXas, lblYas, lblDisc, lblParab, lblVerg;
    private JButton btnBereken, btnReset;
    
    public panel () {
  // setLayout (null);
   this.setBackground(Color.YELLOW);
   
   txtA = new JTextField(5);
   txtA.setHorizontalAlignment(JTextField.CENTER);
   txtB = new JTextField(5);
   txtB.setHorizontalAlignment(JTextField.CENTER);
   txtC = new JTextField(5);
   txtC.setHorizontalAlignment(JTextField.CENTER);
   txtX = new JTextField (10);
   txtX.setHorizontalAlignment(JTextField.CENTER);
   txtX.setEditable(false);
   txtXas = new JTextField (10);
   txtXas.setEditable(false);
   txtXas.setHorizontalAlignment(JTextField.CENTER);
   txtYas = new JTextField (10);
   txtYas.setEditable(false);
   txtYas.setHorizontalAlignment(JTextField.CENTER);
   txtDisc = new JTextField (10);
   txtDisc.setEditable(false);
   txtDisc.setHorizontalAlignment(JTextField.CENTER);
   txtParab = new JTextField (10);
   txtParab.setHorizontalAlignment(JTextField.CENTER);
   txtParab.setEditable(false);
   txtVerg = new JTextField(20);
   txtVerg.setEditable(false);
   txtVerg.setHorizontalAlignment(JTextField.CENTER);
   txtVerg.setFont(new java.awt.Font("Arial", Font.ITALIC | Font.BOLD, 16));
   
   lblA = new JLabel("Vul A in");
   lblB = new JLabel("vul B in");
   lblC = new JLabel ("vul C in");
   lblX = new JLabel ("Xwaarde(n)");
   lblXas = new JLabel ("snijpunt X-as");
   lblYas = new JLabel ("snijpunt y-as");
   lblDisc = new JLabel ("De discriminant is");
   lblParab = new JLabel ("De parabool van deze vergelijking is");
   lblVerg = new JLabel();
   
   btnBereken = new JButton ("Bereken");
   btnBereken.setFont(new java.awt.Font("Arial", Font.ITALIC | Font.BOLD, 12));
btnBereken.setForeground(Color.YELLOW);
btnBereken.setBackground(Color.BLUE);
   btnBereken.addActionListener(new berekenhandler());
   btnReset = new JButton ("Reset");
    btnReset.setFont(new java.awt.Font("Arial", Font.ITALIC | Font.BOLD, 12));
btnReset.setForeground(Color.YELLOW);
btnReset.setBackground(Color.BLUE);
  btnReset.addActionListener(new resethandler());
   
   //hier komt setbounds shit 
   lblA.setBounds(10,10,100,10);
   txtA.setBounds (60,10,100,20);
   lblB.setBounds(10, 40 , 100, 10);
   txtB.setBounds(60,40,100,20);
   lblC.setBounds (10,70,100, 10);
   txtC.setBounds(60,70,100,20);
   
   lblX.setBounds(230,10,100,10);
   txtX.setBounds (330,10,140,20);
   lblXas.setBounds(230,40,100,10);
   txtXas.setBounds(330,40,140,20);
   lblYas.setBounds(230,70, 100,10);
   txtYas.setBounds(330,70,140,20);
   lblDisc.setBounds(10,100,100,20);
   txtDisc.setBounds(60,100,140,20);
   
   add (lblA);
   add (txtA);
   add (lblB);
   add (txtB);
   add (lblC);
   add (txtC);
   add (lblX);
   add (txtX);
   add (lblXas);
   add (txtXas);
   add (lblYas);
   add (txtYas);
   add (lblDisc);
   add (txtDisc);
   add (lblParab);
   add (txtParab);
   add (btnBereken);
   add (btnReset);
   add (lblVerg);
   add (txtVerg);
    }
  
class berekenhandler implements ActionListener {
    public void actionPerformed (ActionEvent e) {
        
        String getA = txtA.getText();
        double A = Double.parseDouble(getA);
        String getB = txtB.getText();
        double B = Double.parseDouble(getB);
        String getC = txtC.getText();
        double C = Double.parseDouble(getC);
        double Disc ;
        double Yas;
        
        // formaterign 
         DecimalFormat form = new DecimalFormat("###.#");
         
        //discriminant
        Disc = Math.pow(B,2)-4*A*C;
        txtDisc.setText(String.format("%8.0f",Disc));
       
        if (Disc >= 0 ) {
           double x1 = (-B+Math.sqrt(B*B-4*A*C))/(2*A);
        double x2 = (-B-Math.sqrt(B*B-4*A*C))/(2*A);
        
        String uit1 = String.valueOf(x1);
        String uit2 = String.valueOf(x2);
        txtX.setText( uit1 + " en" + uit2  );  
         
       String uit3 =("("    +  (x1) + (",0)"));
       String uit4 =("("    +   (x2) + (",0)"));
        txtXas.setText(uit3 + "en" + uit4);
//txtXas.setText("("    +  form.format (x2) + (",0)"));
        // die outputting hiervan nog checken moet string zijn want int gaat t optellen
        }
        else if (Disc == 0){
           double x1 = (-B+Math.sqrt(B*B-4*A*C))/(2*A); 
           txtX.setText(String.format("%8.1f", x1));  
            txtXas.setText("("    +  form.format (x1) + (",0)"));
        }
       
        else {
           txtX.setText("geen geldige wortel"); 
        }    
        
        
       // snijpunt y as
         Yas = A*Math.pow(0,2)+B*0+C;
           txtYas.setText("(0,"    +  form.format (Yas) + (")"));
    
           // parabool
       if ( A == 0){
               
               txtParab.setText ("geen parabool");
               
               
           }else if ( A < 0){
               txtParab.setText ("Berg Parabool");
               
               
           }else if (A > 0)     {
               
               txtParab.setText ("Dal Parabool");
               
           }
      DecimalFormat df = new DecimalFormat("###.#");
           
           txtVerg.setText(""+df.format(A)+"x\u00B2 + " + df.format (B)+"x + " + df.format(C));   
        
    }
}

class resethandler implements ActionListener {
    public void actionPerformed (ActionEvent e) {
      txtA.setText("");
      txtB.setText("");
      txtC.setText("");
      txtX.setText("");
      txtXas.setText("");
      txtYas.setText("");
      txtDisc.setText("");
      txtParab.setText("");
      lblVerg.setText("");
      txtVerg.setText("");
              
        
}
    
}
}

    

