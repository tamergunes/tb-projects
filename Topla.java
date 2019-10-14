/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import java.util.ArrayList;

/** 
 *  
 * @author Tamer Güneş           Mail=tamer.gunes@ogr.sakarya.edu.tr
 *         Mahmut İbrahim Turan  Mail=mahmut.turan@ogr.sakarya.edu.tr
 * 
 *
 * @since 03.05.19  
 * <p>  
 *    numbers.txt ıstedıgınız gıbı duzenlıye bılırsınız
 * </p>  
 */ 
public class Topla extends Thread{
      
        public ArrayList<Integer> sayilarıTop;

        public Topla(ArrayList<Integer> name) {
            this.sayilarıTop = name;
        }
        
        @Override
        public void run() {
            int toplams = 0;
            for (int i = 0; i < sayilarıTop.size(); i++) {
                toplams = toplams + sayilarıTop.get(i);
            }

        }
    
}
