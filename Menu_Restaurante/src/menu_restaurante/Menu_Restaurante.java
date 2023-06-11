/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menu_restaurante;

import java.util.Scanner;

public class Menu_Restaurante {
    
    public enum Comidas {
        PRATO_PRINCIPAL(1),
        SOBREMESA(2);
        
        private int value;
        
        private Comidas(int value){
            this.value = value;
        }
        
        public int getValue(){
            return value;
        }
    }
    
    public enum Bebidas {
        REFRIGERANTE(1),
        SUCO(2),
        AGUA(3);
        
        private int value;
        
        private Bebidas(int value){
            this.value = value;
        }
        
        public int getValue(){
            return value;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[] id = new int[20];
        double total = 0;
        
        for(int i : id){
            if(id[i] == 2){
                total += Comidas.PRATO_PRINCIPAL.getValue();
            }
        }
    }
    
}
