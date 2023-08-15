/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package besiBaja;

/**
 *
 * @author dq
 */
public abstract class besiBaja implements interfaceBajaBesi {
    protected double ketebalan;
    protected double panjang;
    protected double lebar;
    protected String grade;
    protected String kode;
    protected String tanggalProduksi;
    
    
    @Override
    public void setKetebalan(double ketebalan){
         this.ketebalan = ketebalan;
    }
    
    @Override
    public void setPanjang(double panjang){
        this.panjang = panjang;
    } 
    
    @Override
    public void setLebar(double lebar){
        this.lebar = lebar;
    }
     
    @Override
    public void setGrade(String grade){
         this.grade = grade;
    }
      
    @Override
    public void setKode(String kode){
        this.kode = kode;
    }
      @Override
    public void setTanggalProduksi(String tanggalProduksi){
        this.tanggalProduksi = tanggalProduksi;
    }
   
      
    
    @Override
    public double hitungBerat(){
        return ketebalan*panjang*lebar;
    }
    
    
    @Override
    public void displayInfo(){
        System.out.println("informasi besi baja");
        System.out.println("kode:"+ kode);
        System.out.println("grade:"+ grade);
        System.out.println("TanggalProduksi:" + tanggalProduksi);
        System.out.println("berat:"+ hitungBerat()+"Kg");

    }
}
