/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursojavaudemy;

/**
 *
 * @author Lenovo
 */
public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2));
        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s.startsWith("B"));
        System.out.println(s.length());
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));
  
        var nome = "André";
        var sobrenome = "Campos";
        var idade = "27";
        var salario = 10.554;
        
        System.out.println("Nome: "+ nome + " Sobrenome: "+sobrenome
        + " idade: "+ idade + " e ganha: "+ salario + "\n\n");
        System.out.printf("O senhor %s %s tem %s anos e ganha R$%s \n", nome, sobrenome, idade, salario);
        String frase = String.format("O senhor %s %s tem %s anos e "
                + "ganha R$%s \n", nome, sobrenome, idade, salario);
        System.out.println(frase);
        
        System.out.println("frase".substring(1,5));
    }
}
