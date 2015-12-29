/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherentance;

/**
 *
 * @author user
 */
public class utama {
   public static void main (String [] args){
     OrangTua ot = new OrangTua();//<-membuat class
     anak a= new anak();//<-membuat class
     ot.nama = "Novia Yasmin Nurbaiti";//<-method dari class
     a.nama="vivi";//<-method dari class
     System.out.println(ot.nama);
     System.out.println(a.nama); 
     
}//blok main
}//blok class
