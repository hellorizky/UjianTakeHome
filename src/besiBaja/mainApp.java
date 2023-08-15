/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package besiBaja;

/**
 *
 * @author dq
 */
public class mainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        besiBajaKonstruksi besi = new besiBajaKonstruksi();
        besi.setKetebalan(8.0);
        besi.setPanjang(10.0);
        besi.setLebar(5.0);
        besi.setGrade("Grade B");
        besi.setKode("KCD2346");
        besi.setTanggalProduksi("2023-08-13");
        
        besi.displayInfo();
    }
    

    
}
