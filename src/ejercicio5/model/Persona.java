package ejercicio5.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    
    private String dni;
    private String nombre;
    private LocalDate fechaNac;
    private String provincia;

    public int calcularEdad(){
        return Period.between(fechaNac, LocalDate.now()). getYears();
    }

    public boolean mayorEdad(){
        return calcularEdad() >= 18;
    }

    public void mostrarDatos(){
        System.out.println("DNI"+ dni);
        System.out.println("nombre:" + nombre);
        System.out.println("fecha de nacimiento" + fechaNac);
        System.out.println("provincia:" + provincia);
        System.out.println("edad:" + calcularEdad()+ "años");

        if(mayorEdad()) {
            System.out.println("la persona es mayor de edad");
        }else {
            System.out.println("la persona no es mayor de edad");
        }
    }


    public Persona(){

    }

    public Persona( String dni, String nombre, LocalDate fechaNac, String provincia){
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.provincia = provincia;

    }

    public Persona(String dni, String nombre, LocalDate fechaNac) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.provincia = "Jujuy";
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
