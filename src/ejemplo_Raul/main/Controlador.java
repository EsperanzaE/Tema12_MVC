package ejemplo_Raul.main;

import ejemplo_Raul.clases.Alumno;
import ejemplo_Raul.clases.Aula;
import ejemplo_Raul.menu.Menu;

/**
 * Clase principal que representa el controlador del programa.
 * Responsabilidad: Es quien se encarga de orquestar qué clase actúa en cada caso.
 * Obtiene información desde el Menu(vista) para ejecutar métodos de las clases (modelo)
 * Obtiene información de las clases(modelo) para pasárselas al Menú (vista) para mostrarla.
 *
 *
 * El Menu (vista) nunca crea objetos del modelo (clases).
 * Las clases (modelo) nunca llama a métodos del Menu (vista)
 * Nunca el controlador, ni las clases (modelo) deben mostrar o solicitar información (No sysout, ni scanner)
 *
 * @author Raul
 *
 */
public class Controlador {
    //Metodo principal del controlador.
    public static void main(String[] args) {
        Aula aula = new Aula();//Crea un objeto inicial del aula
        String eleccion;
        do {//En funcion de la eleccion del usuario, controla que se debe hacer
            eleccion= Menu.menuPrincipal();
            switch (eleccion) {
                case "1":  {addAlumno(aula);break;}//Se quiere añadir un alumno
                case "2": { showEstadisticas(aula);break;}//Se quiere saber las estadísticas del aula
            }
        }while(!eleccion.equals("3"));//3 es la opcion para salir del programa
    }





    //Metodo para mostrar las estadisticas del aula por pantalla, en este caso en concreto el
    //numero de alumnos aprobados
    private static void showEstadisticas(Aula aula) {
        int numeroAprobados=aula.getNumeroAprobados();
        Menu.mostrarEstadisticas(numeroAprobados);
    }

    //Metodo utilizado para añadir un alumno nuevo al aula
    private static void addAlumno(Aula aula) {
        String nombre=Menu.obtenerNombre();
        boolean aprobado=Menu.obtenerAprobado();
        aula.añadeAlumno(new Alumno(nombre,aprobado));
        Menu.muestraAula(aula);
    }
}

