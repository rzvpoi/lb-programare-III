/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8.modificatoriAcces.src.main.java.package_02;

import lab8.modificatoriAcces.src.main.java.package_01.ClasaI;        //ca sa utem folosi clasa A din package_01 trebuie sa o importam
import lab8.modificatoriAcces.src.main.java.package_01.ClasaIa;

/**
 *
 * @author Daniel
 */
public class ClasaIII {
        public static void main(String[] args) {
        ClasaI a1 = new ClasaI();
        a1.x = 10;
        a1.y = 10;
        a1.z = 10;
        a1.t = 10;
        
                
        ClasaIa a2 = new ClasaIa();
        a2.xA = 10;
        a2.yA = 10;
        a2.zA = 10;
        a2.tA = 10;
      
    }
}
