/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadproduto;

import java.util.Scanner;

/**
 *
 * @author 00388770236
 */
public class CadProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        
        String cod;
        int quant;
        float precouni, precototal, desconto, vtotal_des;
        
        System.out.println("Digite o código do produto");
        cod = teclado.nextLine();
        
        System.out.println("Digite a quantidade");
        quant = teclado.nextInt();
        
        System.out.println("Digite o valor unitário");
        precouni = teclado.nextFloat();
        
        precototal = quant * precouni;
        System.out.println("Digite o valor do desconto");
        desconto = teclado.nextFloat();
        
        desconto = desconto/100;
        vtotal_des = precototal - (precototal * desconto);
        System.out.println("O valor total do descon.:"+ vtotal_des);
        
       
    }
    
}
