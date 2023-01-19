/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursojavaudemy;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ConsoleAula {
    public static void main(String[] args){ 
        // TODO code application logic here
        System.out.printf("Megasena: %d %d %d %d %d %d \n",
                1, 2, 3, 4, 5, 6);
        System.out.print("Digite o seu nome: ");
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();
        
        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();
        
        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
        System.out.printf("O %s %s tem %d anos\n", nome, sobrenome
                , idade);
    }
}
