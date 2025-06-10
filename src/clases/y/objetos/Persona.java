package clases.y.objetos;

public class Persona {
    // Atributos
    String nombre;
    double estatura;
    int edad;

    public Persona(String nombre, double estatura, int edad) {
        this.nombre = nombre;
        this.estatura = estatura;
        this.edad = edad;
    }
    
    public void imprimirDatos() {
        System.out.println("El nombre es " + this.nombre);
        System.out.println("La estatura es " + this.estatura);
        System.out.println("La edad es " + this.edad);
    }
}
