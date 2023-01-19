/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursojavaudemy;

/**
 *
 * @author Lenovo
 */
public class DesafioTemperatura {
    public static void main(String[] args) {
        // TODO code application logic here
        final double ajuste = 32;
        final double fator = 5/9.0;
        double F = 86;
        double C = (F - ajuste)* fator;
        System.out.print("O resultado é = " + C + "C°");
    }
}
