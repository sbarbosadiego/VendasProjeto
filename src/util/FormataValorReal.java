/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * @author Diego Barbosa da Silva
 */
public class FormataValorReal {
    
    static Locale localeBR = new Locale("pt","BR");
    static NumberFormat valorReal = NumberFormat.getCurrencyInstance(localeBR);
    
    /**
     * Método para formatar um objeto do tipo string para double, e retornar o valor formatado em real.
     * @param valorTexto
     * @return valorReal
     */
    public static String formatarReal(String valorTexto) {
        String valorString = valorTexto;
        double valor = 0;
        try {
            Number number = valorReal.parse(valorString);
            valor = number.doubleValue();
        } catch (ParseException e) {
            
        }
        return valorReal.format(valor);
    }
    
    /**
     * Método que formata um valor double para real.
     * @param valorDouble
     * @return valorReal
     */
    public static String formatarDoubleReal(double valorDouble) {
        double valor = valorDouble;
        return valorReal.format(valor);
    }
    
    /**
     * Método para converter um objeto string em double e retornar o mesmo.
     * @param valorTexto
     * @return valor
     */
    public static Double retornarRealDouble(String valorTexto) {
        String valorString = valorTexto;
        double valor = 0;
        try {
            Number number = valorReal.parse(valorString);
            valor = number.doubleValue();
        } catch (ParseException e) {
            
        }
        return valor;
    }
               
}
