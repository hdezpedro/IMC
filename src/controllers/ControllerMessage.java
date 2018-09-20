/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.ModelMessage;
import views.ViewMessage;



/**
 *
 * @author HP
 */
public class ControllerMessage implements ActionListener{
    ModelMessage modelMessage;
    ViewMessage viewMessage;
    private String resultado;
    
   public ControllerMessage(ModelMessage modelMessage, ViewMessage viewMessage) {
   this.modelMessage=modelMessage;
   this.viewMessage=viewMessage;
  this.viewMessage.jb_calcular.addActionListener(this);
  initComponents();
          }

   @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==viewMessage.jb_calcular){
          jb_say_hello_action_performed();
    }
    
}

public void jb_say_hello_action_performed(){
    try{
        float altura=0.0f;
        float peso=0.0f;
        
        
        altura=Float.parseFloat(this.jtf_altura.getText());
        
        peso=Float.parseFloat(this.jtf_peso.getText());
        resultado = peso / (altura*altura) *10000 ;
              
               JOptionPane.showMessageDialog(this, "Masa Corporal es: "+resultado);
        if(resultado<=16.49)
        JOptionPane.showMessageDialog(this,"Peso moderado");
        else if(resultado<=18.49)
        JOptionPane.showMessageDialog(this,"Peso aceptable");
        else if(resultado<=24.99)
        JOptionPane.showMessageDialog(this,"peso normal");
        else if(resultado<=29.99)
        JOptionPane.showMessageDialog(this,"sobrepeso");
        else if(resultado<=34.99)
        JOptionPane.showMessageDialog(this,"obesidad");

       }catch( NumberFormatException interger ) {
         JOptionPane.showMessageDialog(this,"¡DATO  INVALIDO!");
       }
}

public void initComponents(){
    viewMessage.setVisible(true);
    viewMessage.jtf_peso.setText(modelMessage.getName());
     viewMessage.jtf_altura.setText(modelMessage.getName());
}

    private class jtf_peso {

        public jtf_peso() {
        }
    }
}

   
    

