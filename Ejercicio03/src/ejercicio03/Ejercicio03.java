
package ejercicio03;

import ejercicio03.Servicio.ServicioAlumno;
import java.util.Scanner;


public class Ejercicio03 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ServicioAlumno sa = new ServicioAlumno();
        
        sa.fabricaAlumnos();
        
        sa.listarAlumnos();
        
        System.out.println("Ingrese el nombre del alumno que quiere saber el primedio");
        String nombreAlumno = sc.nextLine();
        System.out.println(sa.notaFinal(nombreAlumno));
        
    }
    
}
