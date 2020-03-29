/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_Tugas_2;

/**
 *
 * @author AZAM
 */
public class Hewan {
    private String id;
    private String pemilik;
    private boolean statusPenitipan;
    
    String info() {
        return setId(pemilik);
    }

    public String getId() {
        return id;
    }

    public String setId(String id) {
        this.id = id;
        return id;
    }

    boolean status() {
        return statusPenitipan;
    }
    
}
