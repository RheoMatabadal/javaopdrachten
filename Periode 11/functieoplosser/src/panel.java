import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.border.LineBorder;
public class panel extends JPanel {
    
    private JTextField txtA , txtB , txtC, txtX, txtXas, txtYas,txtDisc, txtParab, txtVerg  ;
    private JLabel lblA, lblB, lblC, lblX, lblXas, lblYas, lblDisc, lblParab, lblVerg;
    private JButton btnBereken, btnReset;
    
    public panel () {
   setLayout (null);
   this.setBackground(Color.YELLOW);
   
   txtA = new JTextField(5);
   txtA.setHorizontalAlignment(JTextField.CENTER);
   txtA.setFont(new java.awt.Font("Arial", Font.ITALIC | Font.BOLD, 15));
   txtB = new JTextField(5);
   txtB.setHorizontalAlignment(JTextField.CENTER);
   txtB.setFont(new java.awt.Font("Arial", Font.ITALIC | Font.BOLD, 15));
   txtC = new JTextField(5);
   txtC.setHorizontalAlignment(JTextField.CENTER);
   txtC.setFont(new java.awt.Font("Arial", Font.ITALIC | Font.BOLD, 15));
   txtX = new JTextField (10);
   txtX.setHorizontalAlignment(JTextField.CENTER);
   txtX.setEditable(false);
   txtX.setFont(new java.awt.Font("Arial", Font.ITALIC | Font.BOLD, 15));
   txtXas = new JTextField (10);
   txtXas.setEditable(false);
   txtXas.setHorizontalAlignment(JTextField.CENTER);
   txtXas.setFont(new java.awt.Font("Arial", Font.ITALIC | Font.BOLD, 15));
   txtYas = new JTextField (10);
   txtYas.setEditable(false);
   txtYas.setHorizontalAlignment(JTextField.CENTER);
   txtYas.setFont(new java.awt.Font("Arial", Font.ITALIC | Font.BOLD, 15));
   txtDisc = new JTextField (10);
   txtDisc.setEditable(false);
   txtDisc.setHorizontalAlignment(JTextField.CENTER);
   txtDisc.setFont(new java.awt.Font("Arial", Font.ITALIC | Font.BOLD, 15));
   txtParab = new JTextField (10);
   txtParab.setHorizontalAlignment(JTextField.CENTER);
   txtParab.setEditable(false);
   txtParab.setFont(new java.awt.Font("Arial", Font.ITALIC | Font.BOLD, 15));
   txtVerg = new JTextField(20);
   txtVerg.setEditable(false);
   txtVerg.setHorizontalAlignment(JTextField.CENTER);
   txtVerg.setFont(new java.awt.Font("Arial", Font.ITALIC | Font.BOLD, 15));
   
   lblA = new JLabel("Vul A in");
   lblA.setFont(new java.awt.Font("Arial", Font.ITALIC | Font.BOLD, 15));
   // lblA.setBorder(new LineBorder(Color.BLACK));
        
   lblA.setPreferredSize(new Dimension(300, 300));
   lblB = new JLabel("vul B in");
   lblB.setFont(new java.awt.Font("Arial", Font.ITALIC | Font.BOLD, 15));
   lblC = new JLabel ("vul C in");
   lblC.setFont(new java.awt.Font("Arial", Font.ITALIC | Font.BOLD, 15));
   lblX = new JLabel ("Xwaarde(n)");
   lblX.setFont(new java.awt.Font("Arial", Font.ITALIC | Font.BOLD, 15));
   lblXas = new JLabel ("snijpunt X-as");
   lblXas.setFont(new java.awt.Font("Arial", Font.ITALIC | Font.BOLD, 15));
   lblYas = new JLabel ("snijpunt y-as");
   lblYas.setFont(new java.awt.Font("Arial", Font.ITALIC | Font.BOLD, 15));
   lblYas.setPreferredSize(new Dimension(500, 500));
   lblDisc = new JLabel ("De discriminant is");
   lblDisc.setFont(new java.awt.Font("Arial", Font.ITALIC | Font.BOLD, 15));
   lblParab = new JLabel ("Deze vergelijking heeft een");
   lblParab.setFont(new java.awt.Font("Arial", Font.ITALIC | Font.BOLD, 15));
   lblVerg = new JLabel();
   lblVerg.setFont(new java.awt.Font("Arial", Font.ITALIC | Font.BOLD, 15));
   
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
   lblA.setBounds(10,10,100,20);
   txtA.setBounds (80,10,100,20);
   lblB.setBounds(10, 40 , 100, 20);
   txtB.setBounds(80,40,100,20);
   lblC.setBounds (10,70,100, 20);
   txtC.setBounds(80,70,100,20);
   
   lblX.setBounds(230,10,100,20);
   txtX.setBounds (330,10,140,20);
   lblXas.setBounds(230,40,140,20);
   txtXas.setBounds(330,40,140,20);
   lblYas.setBounds(230,70, 140,20);
   txtYas.setBounds(330,70,140,20);
   lblDisc.setBounds(10,100,170,25);
   txtDisc.setBounds(230,100,240,20);
   lblParab.setBounds(10,130,240,20);
   txtParab.setBounds(230,130,240,20);
   txtVerg.setBounds(125,160,245,20);
    btnBereken.setBounds(135,185,100,20);
    btnReset.setBounds(235,185,100,20);
           
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
        int B = Integer.parseInt(getB);
        String getC = txtC.getText();
        int C = Integer.parseInt(getC);
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
           txtX.setText(""); 
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

    

