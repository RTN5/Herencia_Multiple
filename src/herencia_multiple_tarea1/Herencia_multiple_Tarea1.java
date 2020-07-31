/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_multiple_tarea1;

/**
 *
 * @author User
 */

interface SistemaTransmision{
    default String Danio(String Diagnostico){
        return" El selector de marchas no encaja bien por lo que decimos "
                + " que "+Diagnostico+" de la caja de cambios.";
    }
}

interface SistemaFrenos{
    default String Danio(String Diagnostico){
        return " Las asafatas del freno suenan al accionar el freno"+Diagnostico+""
                + " del disco freno. ";
    }
}
        
        
        
public class Herencia_multiple_Tarea1 implements SistemaTransmision, SistemaFrenos{
    /*
    public String Danio(String Diagnostico){
    return SistemaTransmision.super.Danio(Diagnostico);
    }*/
    
    @Override
    public String Danio(String Diagnostico){
    return SistemaFrenos.super.Danio(Diagnostico);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("                     Universidad de las Fuerzas Armadas ESPE\n");
        System.out.println("NRC:7450");
        System.out.println("Tema:Herencia Multiple\n\n");
        
        
        Herencia_multiple_Tarea1 SD = new Herencia_multiple_Tarea1();
        System.out.println(SD.Danio("\n se nesesita revisar el fluido"));
    } 
    
}
