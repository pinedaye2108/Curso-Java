package com.example.EjercicioComprension2.Model;

public class Persona {
    //definir constante
    private final int bajoPeso = -1;
    private final int peso_ideal = 0;
    private final int sobre_peso = 1;

    //defino los Atributos
    private String nombre = "";
    private int edad = 0;
    private String dni = "";
    private final static String sexo_def = "H";
    private String sexo = sexo_def; //(H hombre, M mujer),
    private double peso = 0.00;
    private double altura = 0.00;

    //defino el Constructor por defecto.
    public Persona(){;
    }
    // Constructor con nombre, edad y sexo
    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    // Constructor con todos los atributos
    public Persona(String nombre, int edad, String dni, String sexo,  double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    //getter Retorna la informacion almacenada en un atributo
    // o variable de la clase
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    //Setter Modifica la informacion en un atributo o variable de la clase
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
