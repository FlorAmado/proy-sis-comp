/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumno;

/**
 *
 * Proyecto evaluativo

Crear una aplidnicación que permita la administración de alumnos de una escuela
La aplicación debe cumplir con los siguientes requisitos:

- Interfaz grafica para la captura de datos:
	-matricula
	-dni
	-nombre
	-apellido
	-direccion
	-correo electronico
	-telefono
	-año
	-curso
	-especialidad

- Interfaz grafica para la salida de la información (se debe mostrar en formato tabla - usar JTable)


- Los métodos para la gestion deben ser los siguientes:
	-Alta de alumno
	-Baja de alumno
	-Buscar alumno. Debe permitir la busqueda por apellido, matricula o dni
	-Actualizar datos del alumno
Cada método debe estar asociado a un boton de la interfaz gráfica.

- Debe contar con un boton en la GUI donde muestre los datos del desarrollador (tu nombre, apellido y curso).


- Se debe entregar
link de github.
Archivo .jar (ejecutable de java)
Documento readme.md donde se detalle el funcionamiento del sistema.

 */
public class Alumno {

    private String matricula;
    private String dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private String email;
    private String telefono;
    private String ano;
    private String curso;
    private String especialidad;

    public Alumno() {
    }

    public Alumno(String matricula, String dni, String nombre , String apellido, String direccion, String email, String telefono, String ano, String curso, String especialidad) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.ano = ano;
        this.curso = curso;
        this.especialidad = especialidad;
    }



    @Override
    public String toString() {
     return "Alumno{" + "matricula=" + matricula + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", direccion=" + direccion + ", email=" + email + ", telefono=" + telefono + ", ano=" + ano + ", curso=" + curso + ", especialidad=" + especialidad + '}';

    }
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
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        interfazAlumno ventana = new interfazAlumno();
        
        ventana.setVisible(true);
    }
    
}
