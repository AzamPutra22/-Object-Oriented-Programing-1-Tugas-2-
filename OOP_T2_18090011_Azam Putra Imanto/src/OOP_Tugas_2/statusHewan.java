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
public class statusHewan {
    
    public static void main(String args[]){
        Anjing anjing = new Anjing();
        Ikan ikan = new Ikan();
        
        anjing.statusSuntikRabies = false;
        ikan.statusGantiAir = true;
        
        if (anjing.status() == false) {
            System.out.println("Anjing belum suntik rabies");
        }else{
            System.out.println("Anjing sudah suntik rabies");
        }
        
        if (ikan.status() == false) {
            System.out.println("Ikan belum ganti air");
        }else{
            System.out.println("Ikan sudah ganti air");
        }
    }
    
}
