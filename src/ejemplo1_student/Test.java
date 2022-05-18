package ejemplo1_student;

import ejemplo1_student.Controladora.StudentController;
import ejemplo1_student.Modelo.Student;
import ejemplo1_student.Vista.StudentView;

public class Test {
    //en este ejemplo para probar el MVC se instancia la clase del modelo Student, la calse de la vista
    //StudentView y la controladora llama a los métodos de la vista para mostrar los datos
    //posteriormente la controladora llama a los getter y setter del modelo para actualizarlo y
    //vuelve a llamar a los métodos de la vista para mostrar los datos recién actualizado

    public static void main(String[] args) {
        Student modelo = retriveStudentFromDatabase();//simula que se accede a una fuente de datos para
        //instanciar los datos del modelo
        StudentView vista = new StudentView();//instanciamos una vista

        //instancimos el controlador con el modelo y la vista
        StudentController controladora = new StudentController(modelo, vista);

        //llamamos a la controladora para que modifique la vista con su método updateView()
        controladora.updateView();
        //modificamos los datos del modelo desde la controladora
        controladora.setMatricula("B001");
        controladora.setNombre("Juan Pepe");
//modificamos la vista  desde la controladora
        controladora.updateView();
    }

    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setMatricula("A001");
        student.setNombre("Pepe Juan");
        return student;
    }
}
