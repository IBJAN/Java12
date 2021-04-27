/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mvc.Pos;

/**
 *
 * @author CATUR WARGA COMPUTER
 */
public class PosMain {
    
    public static void main(String[] args) {
        PosModel model = new PosModel();
        PosViewbarang view = new PosViewbarang();
        
        PosController controller = new PosController(model, view);
        
        controller.createView();
        
    }
}
