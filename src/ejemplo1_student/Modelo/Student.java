package ejemplo1_student.Modelo;
//Un modelo representa un objeto que accede a los datos.
// También puede tener lógica para actualizar el controlador cuando cambian los datos.
// En este caso nuestro modelo es la Clase Student tiene los datos de los objetos que se instancien

    public class Student {
        private String matricula;
        private String nombre;

        public String getMatricula() {
            return matricula;
        }
        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre=nombre;
        }

    }

