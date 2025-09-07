package ejercicio5.main;

import java.time.LocalDate;
import ejercicio5.model.Persona;

public class Main {
    
    public static void main(String[] args){



        Persona persona1 = new Persona();
        persona1.setDni("46471391");
        persona1.setNombre("Camila");
        persona1.setFechaNac(LocalDate.of(2005, 4, 7));
        persona1.setProvincia("Jujuy");


        Persona persona2 = new Persona(
            "45368790",
            "Juan",
            LocalDate.of(2003, 6, 9),
            "Salta"
    
        );

        Persona persona3 = new Persona(
            "46598229",
            "Romina",
            LocalDate.of(2005, 6, 22)
        );


        persona1.mostrarDatos();
        System.out.println("-------------");

        persona2.mostrarDatos();
        System.out.println("-------------");
         
        persona3.mostrarDatos();
        

        
    }
}
