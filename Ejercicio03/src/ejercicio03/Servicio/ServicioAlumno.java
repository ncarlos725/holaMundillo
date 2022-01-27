package ejercicio03.Servicio;

import ejercicio03.Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioAlumno {

    Scanner sc;
    Alumno alumno;
    ArrayList<Alumno> alumnos;

    public ServicioAlumno() {
        sc = new Scanner(System.in).useDelimiter("\n");
        alumnos = new ArrayList();
    }

    public Alumno crearAlumno(){
        
        String nombre;
        int nota;
        ArrayList<Integer> notas = new ArrayList();
        
        System.out.println("Por favor ingrese el nombre del alumno");
        nombre = sc.nextLine();
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Por favor ingrese la nota numero " + (i+1));
            nota = sc.nextInt();
            
            notas.add(nota);
        }
        return new Alumno(nombre, notas);
    }

    
    public void fabricaAlumnos(){
        String opcion = "";
        do {
            Alumno alumnoCreado = crearAlumno();
            agregarAlumno(alumnoCreado);
            
            System.out.println("Desea seguir agregando alumnos? 'si' 'no'");
            opcion = sc.next();
            
        } while (opcion.equals("si"));
        
    }
    
    public void agregarAlumno(Alumno a){
        alumnos.add(a);
    }
    
    public double notaFinal(String nombre){
        int suma = 0;
        double promedio;
        int cantidadNotas = 0;
        for (Alumno alumno1 : alumnos) {
            if (alumno1.getNombre().equals(nombre)) {
                ArrayList<Integer> notas = alumno1.getNotas();
                cantidadNotas = notas.size();
                for (Integer nota : notas) {
                    suma += nota;
                }
            }  
        }
        
        return suma / cantidadNotas;
        
    }
    
    public void listarAlumnos(){
        for (Alumno alumno1 : alumnos) {
            System.out.println(alumno1.toString());
        }
    }
}
