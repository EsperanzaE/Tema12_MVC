package ejemplo1_student.Controladora;
//El controlador actúa sobre el modelo y la vista. Controla el flujo de datos para modelar objetos y actualiza la
// vista a medida que cambian los datos. Separa la vista del modelo.
//Es la responsable  de almacenar los datos en el objeto Student y actualizar la vista StudentView
// en consecuencia.
import ejemplo1_student.Modelo.Student;
import ejemplo1_student.Vista.StudentView;

public class StudentController { //Clase de la controladora
    private Student modelo;//Studen es la clase del modelo
    private StudentView vista;//StudentView es la clase de la vista

    public StudentController(Student modelo, StudentView vista) {//constructor
        super();
        this.modelo=modelo;
        this.vista=vista;
    }
    public String getMatricula() {//atributo matricula del modelo. Usa el get del modelo
        return modelo.getMatricula();
    }
    public void setMatricula(String matricula) { //atributo matricula del modelo. Usa el set del modelo
        modelo.setMatricula(matricula);;
    }
    public String getNombre(){ //atributo nombre del modelo. Usa el get del modelo
        return modelo.getNombre();
    }
    public void setNombre(String nombre) {//atributo nombre del modelo. Usa el get del modelo
        modelo.setNombre(nombre);
    }
    public void updateView() {//la controladora actualiza la vista usando los getter del modelo
        // y el metodo de la vista printStudentDetails
        vista.printStudentDetails(modelo.getMatricula(), modelo.getNombre());
    }
}
