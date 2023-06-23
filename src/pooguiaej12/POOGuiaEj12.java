
package pooguiaej12;

import Entidad.Persona;
import Service.PersonaService;

public class POOGuiaEj12 {

    public static void main(String[] args) {
        
        PersonaService pS = new PersonaService();
        
        Persona p1 = pS.crearPersona();
        
        System.out.println("Su edad es : " + pS.calcularEdad(p1) + " años");
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("");
        
        System.out.println("Es usted menor? " + pS.menorQue(0, p1));
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("");
        
        System.out.println(pS.mostrarPersona(p1));
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("");
        
    }
    
}
