/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructura_control;

public class Estructura_control {

    public static void main(String[] args) {
        
        boolean valor_log = true;
        boolean valor_log2 = false;
        boolean valor_log3 = true;
        
        System.out.println("inicio del programa");
                
        if (valor_log == false){
            System.out.println("this is truth");
        } else if(valor_log2 == true){
            System.out.println("maybe this is good");
        } else if( (valor_log3 == false) && (valor_log2 ==false) ) {
            System.out.println("no hubo de otra");
        } else {
            System.out.println("we are dumber");
        }
        
        System.out.println("this is the end");
    }
    /* estoy es haciendo pruebas en git bash */
}
