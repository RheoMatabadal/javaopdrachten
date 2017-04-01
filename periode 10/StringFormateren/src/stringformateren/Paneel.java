/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringformateren;

import java.awt.event.*;
 import javax.swing.*;


public class Paneel extends JPanel{
    
    private JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6,lbl7,lbl8,lbl9, lbl10, lbl11, lbl12, lbl13, lbl14, lbl15;
    private JTextField txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, txt10, txt11,txt12, txt13, txt14, txt15;
    private JButton berekenMed,berekenStaf, wissen;
    private JRadioButton usd, eu;
    private ButtonGroup g1;
    
    public Paneel(){
    
    setLayout(null);
    lbl1 = new JLabel("January");
    lbl2 = new JLabel("February");
    lbl3 = new JLabel("Maart");
    lbl4 = new JLabel("April");
    lbl5 = new JLabel("Mei");
    lbl6 = new JLabel("Juni");
    lbl7 =new JLabel ("July");
    lbl8 =new JLabel ("Augustus");
    lbl9 =new JLabel ("September");
    lbl10 =new JLabel ("Oktober");
    lbl11 =new JLabel ("November");
    lbl12 =new JLabel ("December");
    lbl13 =new JLabel ("Jaarsalaris");
    lbl14 = new JLabel("Vakantiegeld");
    lbl15 = new JLabel("Koers");
    
    
    berekenMed = new JButton("Bereken als Medewerker");
    berekenStaf= new JButton("Bereken als Staf-Medewerker ");
    wissen = new JButton("Reset");
    
    txt1 = new JTextField("");
    txt2 = new JTextField("");
    txt3 = new JTextField("");
    txt4 = new JTextField("");
    txt5 = new JTextField("");
    txt6 = new JTextField("");
    txt7 = new JTextField("");
    txt8 = new JTextField("");
    txt9 = new JTextField("");
    txt10 = new JTextField("");
    txt11 = new JTextField("");
    txt12 = new JTextField("");
    txt13 = new JTextField("");
    txt14 = new JTextField("");
    txt15 = new JTextField("");
    
    
    usd = new JRadioButton("USD");
    eu = new JRadioButton("EU");
    g1 = new ButtonGroup();
    g1.add(usd);
    g1.add(eu);
    
    //Destination
    lbl1.setBounds(80,60,75,25);
    lbl2.setBounds(80,80,75,25);
    lbl3.setBounds(80,100,75,25);
    lbl4.setBounds(80,120,75,25);
    lbl5.setBounds(80,140,75,25);
    lbl6.setBounds(80,160,75,25);
    lbl7.setBounds(80,180,75,25);
    lbl8.setBounds(80,200,75,25);
    lbl9.setBounds(80,220,75,25);
    lbl10.setBounds(80,240,75,25);
    lbl11.setBounds(80,260,75,25);
    lbl12.setBounds(80,280,75,25);
    lbl13.setBounds(80,300,75,25);
    lbl14.setBounds(80,320,75,25);
    lbl15.setBounds(250,320,50,25);

    txt1.setBounds(160,60,80,25);
    txt2.setBounds(160,80,80,25);
    txt3.setBounds(160,100,80,25);
    txt4.setBounds(160,120,80,25);
    txt5.setBounds(160,140,80,25);
    txt6.setBounds(160,160,80,25);
    txt7.setBounds(160,180,80,25);
    txt8.setBounds(160,200,80,25);
    txt9.setBounds(160,220,80,25);
    txt10.setBounds(160,240,80,25);
    txt11.setBounds(160,260,80,25);
    txt12.setBounds(160,280,80,25);
    txt13.setBounds(160,300,80,25);
    txt14.setBounds(160,320,80,25);
    txt15.setBounds(250,320,40,25);
    
    
    eu.setBounds(100,350,50,20);
    usd.setBounds(150,350,50,20);
    
    berekenMed.setBounds(90,370,180,25);
    berekenStaf.setBounds(75,400,210,25);
    wissen.setBounds(20,20,75,25);
   
    add (berekenMed);
    add (berekenStaf);
    add (wissen);
    add (lbl1);
    add (lbl2);
    add (lbl3);
    add (lbl4);
    add (lbl5);
    add (lbl6);
    add (lbl7);
    add (lbl8);
    add (lbl9);
    add (lbl10);
    add (lbl11);
    add (lbl12);
    add (lbl13);
    add (lbl14);
    add (lbl15);
    add (txt1);
    add (txt2);
    add (txt3);
    add (txt4);
    add (txt5);
    add (txt6);
    add (txt7);
    add (txt8);
    add (txt9);
    add (txt10);
    add (txt11);
    add (txt12);
    add (txt13);
    add (txt14);
    add(txt15);
    add (usd);
    add(eu);
   
    
    
     berekenMed.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            double a,b,c,d,e2,f,g,h,i,j,k,l,m,vgeld,mnd;
            
            ;

//if field is empty insert 0             
              if (txt1.getText().isEmpty()){
                 txt1.setText("0");
                 a = Double.parseDouble(txt1.getText());
             }else{
                 a = Double.parseDouble(txt1.getText());
             }
              
             if (txt2.getText().isEmpty()){
                 txt2.setText("0");
                 b = Double.parseDouble(txt2.getText());
             }else{
                 b = Double.parseDouble(txt2.getText());
             }
             
             if (txt3.getText().isEmpty()){
                 txt3.setText("0");
                 c = Double.parseDouble(txt3.getText());
             }else{
                 c = Double.parseDouble(txt3.getText());
             }
             
             if (txt4.getText().isEmpty()){
                 txt4.setText("0");
                 d = Double.parseDouble(txt4.getText());
             }else{
                 d = Double.parseDouble(txt4.getText());
             }
             
             if (txt5.getText().isEmpty()){
                 txt5.setText("0");
                 e2 = Double.parseDouble(txt5.getText());
             }else{
                 e2 = Double.parseDouble(txt5.getText());
             }
             
             if (txt6.getText().isEmpty()){
                 txt6.setText("0");
                 f = Double.parseDouble(txt6.getText());
             }else{
                 f = Double.parseDouble(txt6.getText());
             }
             
             if (txt7.getText().isEmpty()){
                 txt7.setText("0");
                 g = Double.parseDouble(txt7.getText());
             }else{
                 g = Double.parseDouble(txt7.getText());
             }
             
             if (txt8.getText().isEmpty()){
                 txt8.setText("0");
                 h = Double.parseDouble(txt8.getText());
             }else{
                 h = Double.parseDouble(txt8.getText());
             }
             
             if (txt9.getText().isEmpty()){
                 txt9.setText("0");
                 i = Double.parseDouble(txt9.getText());
             }else{
                 i = Double.parseDouble(txt9.getText());
             }
             
             if (txt10.getText().isEmpty()){
                 txt10.setText("0");
                 j = Double.parseDouble(txt10.getText());
             }else{
                 j = Double.parseDouble(txt10.getText());
             }
             
             if (txt11.getText().isEmpty()){
                 txt11.setText("0");
                 k = Double.parseDouble(txt11.getText());
             }else{
                 k = Double.parseDouble(txt11.getText());
             }
             
             if (txt12.getText().isEmpty()){
                 txt12.setText("0");
                 l = Double.parseDouble(txt12.getText());
             }else{
                 l = Double.parseDouble(txt12.getText());
             }

//Eindberekening 
           g1.clearSelection();
           
            mnd = a+b+c+d+e2+f+g+h+i+j+k+l;
            txt13.setText("SRD"+String.format("%10.2f",mnd));
           
            m = mnd/100;
            vgeld = m * 8;
            txt14.setText("SRD"+String.format("%8.2f",vgeld));
        }
     });
     
     
 //STAFF    
     berekenStaf.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            double a,b,c,d,e2,f,g,h,i,j,k,l,m,vgeld,mnd, val1, val2;
            
            ;

//if field is empty insert 0             
              if (txt1.getText().isEmpty()){
                 txt1.setText("0");
                 a = Double.parseDouble(txt1.getText());
             }else{
                 a = Double.parseDouble(txt1.getText());
             }
              
             if (txt2.getText().isEmpty()){
                 txt2.setText("0");
                 b = Double.parseDouble(txt2.getText());
             }else{
                 b = Double.parseDouble(txt2.getText());
             }
             
             if (txt3.getText().isEmpty()){
                 txt3.setText("0");
                 c = Double.parseDouble(txt3.getText());
             }else{
                 c = Double.parseDouble(txt3.getText());
             }
             
             if (txt4.getText().isEmpty()){
                 txt4.setText("0");
                 d = Double.parseDouble(txt4.getText());
             }else{
                 d = Double.parseDouble(txt4.getText());
             }
             
             if (txt5.getText().isEmpty()){
                 txt5.setText("0");
                 e2 = Double.parseDouble(txt5.getText());
             }else{
                 e2 = Double.parseDouble(txt5.getText());
             }
             
             if (txt6.getText().isEmpty()){
                 txt6.setText("0");
                 f = Double.parseDouble(txt6.getText());
             }else{
                 f = Double.parseDouble(txt6.getText());
             }
             
             if (txt7.getText().isEmpty()){
                 txt7.setText("0");
                 g = Double.parseDouble(txt7.getText());
             }else{
                 g = Double.parseDouble(txt7.getText());
             }
             
             if (txt8.getText().isEmpty()){
                 txt8.setText("0");
                 h = Double.parseDouble(txt8.getText());
             }else{
                 h = Double.parseDouble(txt8.getText());
             }
             
             if (txt9.getText().isEmpty()){
                 txt9.setText("0");
                 i = Double.parseDouble(txt9.getText());
             }else{
                 i = Double.parseDouble(txt9.getText());
             }
             
             if (txt10.getText().isEmpty()){
                 txt10.setText("0");
                 j = Double.parseDouble(txt10.getText());
             }else{
                 j = Double.parseDouble(txt10.getText());
             }
             
             if (txt11.getText().isEmpty()){
                 txt11.setText("0");
                 k = Double.parseDouble(txt11.getText());
             }else{
                 k = Double.parseDouble(txt11.getText());
             }
             
             if (txt12.getText().isEmpty()){
                 txt12.setText("0");
                 l = Double.parseDouble(txt12.getText());
             }else{
                 l = Double.parseDouble(txt12.getText());
             }
             
            
             
//Eindberekening            
           
             if (eu.isSelected()) {
                mnd = a+b+c+d+e2+f+g+h+i+j+k+l;
                txt13.setText("");
                txt13.setText("SRD"+String.format("%10.2f",mnd)); 
                 
                m = mnd/100;
                vgeld = m * 15;
                val1= vgeld / 8.12;
                txt14.setText("");
                txt14.setText("€" +String.format("%10.2f",val1));
            }
             else if(usd.isSelected()){
                mnd = a+b+c+d+e2+f+g+h+i+j+k+l;
                txt13.setText("");
                txt13.setText("SRD"+String.format("%10.2f",mnd)); 
              
                m = mnd/100;
                vgeld = m * 15;
                val2= vgeld / 7.59;
                txt14.setText("");
                txt14.setText("$"+String.format("%10.2f",val2));
             }
             else{
                 
                mnd = a+b+c+d+e2+f+g+h+i+j+k+l;
                txt13.setText("");
                txt13.setText("SRD"+String.format("%10.2f",mnd)); 
              
                m = mnd/100;
                vgeld = m * 15;
                txt14.setText("");
                txt14.setText("SRD"+String.format("%10.2f",vgeld));
                     
                 };
            
           
        }
     });
     
     wissen.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
           txt1.setText("");
           txt2.setText("");
           txt3.setText("");
           txt4.setText("");
           txt5.setText("");
           txt6.setText("");
           txt7.setText("");
           txt8.setText("");
           txt9.setText("");
           txt10.setText("");
           txt11.setText("");
           txt12.setText("");
           txt13.setText("");   
           txt14.setText("");
           g1.clearSelection();
        }
     });
    }
}
