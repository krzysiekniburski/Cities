/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop2018;

import java.math.BigDecimal;

/**
 *
 * @author Student
 */
public class Shop2018 {

    
   
    public static void main(String[] args) {
        Produkt chleb = new Produkt("chleb",new BigDecimal("1.8"));
        Produkt cukier = new Produkt("cukier",new BigDecimal("3.2"));
        Produkt olej = new Produkt("olej",new BigDecimal("4.2"));
        Produkt maka = new Produkt("maka",new BigDecimal("2.2"));
        
        Koszyk koszyk = new Koszyk();
        koszyk.dodaj(chleb);
        koszyk.dodaj(cukier);
        koszyk.dodaj(olej);
        koszyk.dodaj(olej);
        koszyk.dodaj(maka);
        koszyk.dodaj(maka);
        
        System.out.println(koszyk.doZaplaty());
        

        
    }
    
}
