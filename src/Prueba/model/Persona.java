package Prueba.model;

public class Persona {

    private String nombre;
    private int edad;
    private String identificacion;
    private double numeroTelefonico;

    public Persona(String nombre, int edad, String identificacion, double numeroTelefonico) {
        super();
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
        this.numeroTelefonico= numeroTelefonico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public double getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(double numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", identificacion='" + identificacion + '\'' +
                ", numeroTelefonico=" + numeroTelefonico +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona persona)) return false;

        return getIdentificacion() != null ? getIdentificacion().equals(persona.getIdentificacion()) : persona.getIdentificacion() == null;
    }

    @Override
    public int hashCode() {
        return getIdentificacion() != null ? getIdentificacion().hashCode() : 0;
    }
}
