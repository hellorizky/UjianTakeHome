/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package besiBaja;

/**
 *
 * @author dq
 */
public interface interfaceBajaBesi {
    void setKetebalan(double ketebalan);
    void setPanjang(double panjang);
    void setLebar(double lebar);
    void setGrade(String grade);
    void setKode(String kode);
    void setTanggalProduksi(String tanggalProduksi);
    
    double hitungBerat();
    void displayInfo();
    
}
