package Service;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {

    Scanner sc = new Scanner(System.in);

    public Persona crearPersona() {

        Persona p1 = new Persona();

        // Lleno los atributos
        System.out.println("Ingrese su nombre, por favor");
        p1.setName(sc.nextLine());

        System.out.println("Ingrese su fecha de nacimiento, por favor");
        System.out.println("Ingrese 2 dígitos para el día");
        int day = sc.nextInt();
        System.out.println("Ingrese 2 dígitos para el mes");
        int month = sc.nextInt();
        System.out.println("Ingrese 4 dígitos para el año");
        int year = sc.nextInt();

        Date birthDate = new Date(year - 1900, month - 1, day);

        p1.setBirth(birthDate);

        return p1;
    }

    public int calcularEdad(Persona p1) {

        Date today = new Date();

        // aca pongo un if porque si toma solo año no da exactamente bien
        //Le digo que si el mes de cumpleaños en mayor al mes actual, me reste 1
        //Porque significa q aún no cumplí años
        if (p1.getBirth().getMonth() > today.getMonth()) {
            int age = today.getYear() - p1.getBirth().getYear() - 1;
            return age;
        } else {
            int age = today.getYear() - p1.getBirth().getYear();
            return age;
        }
    }

    public boolean menorQue(int anotherAge, Persona p1) {

        System.out.println("Ingresar otra edad, por favor");
        anotherAge = sc.nextInt();
        System.out.println("");

        return calcularEdad(p1) < anotherAge;
        // si se da esta condicion me muestra true, sino false

    }

    public String mostrarPersona(Persona p1) {
        String persona = p1.getName() + p1.getBirth();

        System.out.println("Su nombre es " + p1.getName());
        System.out.println("Su fecha de nacimiento es " + p1.getBirth());
        System.out.println("");
        return persona;
    }

}

//métodos:
// Agregar un método de creación del objeto que respete la siguiente firma:
//crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
//usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
//fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
// Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
//en cuenta que para conocer la edad de la persona también se debe conocer la fecha
//actual.
// Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
//edad y retorna true en caso de que el receptor tenga menor edad que la persona que
//se recibe como parámetro, o false en caso contrario.
// Metodo mostrarPersona(): este método muestra la persona creada en el método
//anterior.
