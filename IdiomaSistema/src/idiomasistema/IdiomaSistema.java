/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomasistema;

import java.util.Locale;

/**
 *
 * @author POSITIVO
 */
public class IdiomaSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Locale loc = Locale.getDefault();
        System.out.println("O idioma do sistema é");
        System.out.println(loc.getDisplayLanguage());//imprime"português"// TODO code application logic here
    }
    
}
