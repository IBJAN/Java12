/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mvc.Pos;
import Mvc.Pos.PosViewbarang;
/**
 *
 * @author CATUR WARGA COMPUTER
 */
public class PosController {

    private PosModel model;
    private PosViewbarang view;

    public PosController(PosModel model, PosViewbarang view) {
        this.model = model;
        this.view = view;
    }

    public void createView() {
        view.Createdata(model.getKd_barang(), model.getNb(), model.getJb());
    }

}
