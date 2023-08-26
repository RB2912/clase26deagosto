package PkgAlumnos;

import java.util.ArrayList;

public class Alumno {
    private String carnet;
    public String nombre;
    public String telefono;
    public String direccion;
    private ArrayList<CursoAsignado> CursoAsignado;


    public double TotalCurso(){
        double t=0;
        for (CursoAsignado c: CursoAsignado){
            t=t+c.getCostoCurso();
        }
        return t;
    }


    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<PkgAlumnos.CursoAsignado> getCursoAsignado() {
        return CursoAsignado;
    }

    public void setCursoAsignado(ArrayList<PkgAlumnos.CursoAsignado> cursoAsignado) {
        CursoAsignado = cursoAsignado;
    }
//contructor

    public Alumno(String carnet, String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.telefono = telefono;
        this.direccion = direccion;
        this.CursoAsignado = new ArrayList<>();
    }

    public void agregarCursoAsignado(CursoAsignado curso) {
        CursoAsignado.add(curso);
    }

    public String toString() {
        return "carnet:" + this.carnet + "Nombre:" + this.nombre + "Direccion:" + this.direccion;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cursos Asignados:");
        double totalapagar = 0.0;
        for (CursoAsignado curso : CursoAsignado) {
            System.out.println("Curso: " + curso.getNombreCurso());
            System.out.println("Precio: " + curso.getCostoCurso());
            totalapagar += curso.getCostoCurso();

        }
        System.out.println("Total mensual a pagar: " + totalapagar);
        System.out.println("-----------------");
    }


}
