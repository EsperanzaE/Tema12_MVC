package ejemplo1_student.Vista;
//en este ejemplo la vista es simplemente mostrar pos consola los datos del alumno
//este método lo llamará la controladora instanciando esta clase
public class StudentView {
    public void printStudentDetails(String matricula,String nombre) {
        System.out.println("Estudiante:  Matrícula: "+matricula+" Nombre :" +nombre);
    }
}
