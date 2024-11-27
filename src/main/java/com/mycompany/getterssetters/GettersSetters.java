package com.mycompany.getterssetters;

/**
 *
 * @author jhair
 */
public class GettersSetters {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Pedro Sanchez", 20, "01/02/2004", "Hombre", "Ingeniero electronico");

        Hijo hijo1 = new Hijo("Andres Sanchez", 1, "09/05/2023", "Hombre", persona1);

        System.out.println("Datos de la persona:");
        persona1.mostrarDatos();
        
        System.out.println(); 

        hijo1.mostrarDatos();
    }

    public static class Persona {
        private final String nombreCompleto;
        private final int edad;
        private final String fechaNacimiento;
        private final String sexo;
        private final String profesion;


        public Persona(String nombreCompleto, int edad, String fechaNacimiento, String sexo, String profesion) {
            this.nombreCompleto = nombreCompleto;
            this.edad = edad;
            this.fechaNacimiento = fechaNacimiento;
            this.sexo = sexo;
            this.profesion = profesion;
        }

        public String getNombreCompleto() {
            return nombreCompleto;
        }

        public int getEdad() {
            return edad;
        }

        public String getFechaNacimiento() {
            return fechaNacimiento;
        }

        public String getSexo() {
            return sexo;
        }

        public String getProfesion() {
            return profesion;
        }

        public void mostrarDatos() {
            System.out.println("Nombre Completo: " + nombreCompleto);
            System.out.println("Edad: " + edad + " años");
            System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
            System.out.println("Sexo: " + sexo);
            System.out.println("Profesion: " + profesion);
        }
    }

    public static class Hijo extends Persona {
        private final Persona persona;

        public Hijo(String nombreCompleto, int edad, String fechaNacimiento, String sexo, Persona persona) {
            super(nombreCompleto, edad, fechaNacimiento, sexo, "Ninguna");
            this.persona = persona;
        }

        public void mostrarDatos() {
            System.out.println("Datos del hijo:");
            super.mostrarDatos(); 
            System.out.println("Hijo de: " + persona.getNombreCompleto());
        }
    }
}
