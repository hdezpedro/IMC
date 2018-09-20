/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import models.ModelMessage;
import views.ViewMessage;
import controllers.ControllerMessage;
/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        ModelMessage modelMessage = new ModelMessage();
        ViewMessage viewMessage = new ViewMessage();
        ControllerMessage controllerMesssage = new ControllerMessage(modelMessage, viewMessage);
    }
}
