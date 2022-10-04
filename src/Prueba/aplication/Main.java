package Prueba.aplication;

import Prueba.model.Persona;

public class Main {

    public  static void main(String[] args){
        Persona persona1 = new Persona("Huendy", 18, "123", 310);
        mostrarPersona(persona1);
    }

    public static void  mostrarPersona(Persona persona){
        System.out.print("Nombre " + persona.getNombre());
        System.out.print("edad " + persona.getEdad());
        System.out.print("Identificacion " + persona.getIdentificacion());
        System.out.print("Numero telefonico " + persona.getNumeroTelefonico());
    }
}
