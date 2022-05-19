package ejemplo_Raul.clases;

import java.util.LinkedList;
import java.util.List;

/**
 * Clase que forma parte del modelo. Sirve para representar un Aula
 * @author Raul
 *
 */
public class Aula {
    private List<Alumno> aula;

    public Aula() {
        aula=new LinkedList<Alumno>();
    }

    /**
     * Metodo utilizado para añadir un alumnos en el aula
     * Precondicion: Ninguna
     * Postcondicion: El alumno se añade al atributo lista de alumnos
     * Entrada: alumno
     * Salidas: Ninguna
     *
     * @param alumno que se va a añadir a la lista alumnos
     */
    public void añadeAlumno(Alumno alumno) {
        aula.add(alumno);
    }

    /**
     * Metodo utilizado para saber el numero de alumnos aprobados en el aula
     * Precondicion: Ninguna
     * Postcondicion: Devuelve el numero de objetos Alumno que tienen su atributo aprobado a true
     * en la lista alumnos.
     * Entradas: Ninguna
     * Salida: int, el numero de alumnos
     * @return el numero de alumnos aprobados que hay en el aula
     */
    public int getNumeroAprobados() {
        int aprobados=0;
        for(Alumno alumno:aula) {
            if(alumno.isAprobado())
                aprobados++;
        }
        return aprobados;
    }

    @Override
    public String toString() {
        return "los alumnos que ahora hay en el Aula{" +
                "son:" +"\n"+ aula +
                '}';
    }
}
