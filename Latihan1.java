/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author ina sofiana
 */
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instance
        Perpustakaan pk=new Perpustakaan ();
        
        
        System.out.println(pk.anggota());
        System.out.println(pk.daftarbuku());
        System.out.println("banyakbuku ="+ pk.banyakbuku(13));
       
        
      
       
    }
    
}
class Perpustakaan{
    public String anggota(){
       return"ina sofiana";
    }
    public String daftarbuku(){
        return"novel";
    }
    public int banyakbuku (int banyakbuku){
        return banyakbuku;
    }
   
       
    }
