/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodadostest;
import java.util.Scanner;

/**
 *
 * @author tatan
 */
public class JuegoDadosTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int repetir=0;
        Scanner leer = new Scanner(System.in);
        JuegoDados mijuego = new JuegoDados();
        System.out.println("hola");
        mijuego.juego();
        
        do{
        System.out.println("quiere repetir el juego?");
        System.out.println("1.-si");
        System.out.println("2.-no");
        repetir=leer.nextInt();
        if (repetir == 1){
            mijuego.juego();
        }
        }while (repetir ==1);
            
       
        
        
    }
    
}
