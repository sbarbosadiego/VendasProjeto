/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.regex.Pattern;

/**
 * @author Diego Barbosa
 */
public class CampoDePesquisa {
    
        /**
         * Método para verificar se uma String contém valores numéricos.
         * @param texto
         * @return boolean
         */
        public static boolean testaString(String texto) {
        Pattern p = Pattern.compile("[0-9]+");
        String pesquisa;
        pesquisa = texto;
        boolean numerico = (pesquisa != null && p.matcher(pesquisa).find());
        return numerico;
    }
    
}
