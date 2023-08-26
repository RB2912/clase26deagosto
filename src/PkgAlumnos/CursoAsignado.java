package PkgAlumnos;

public class CursoAsignado {
    private int codigoCurso;
    private String nombreCurso;
    private double CostoCurso;


    public CursoAsignado(int codigo, String nombre, double costo) {
        this.codigoCurso = codigo;
        this.nombreCurso = nombre;
        this.CostoCurso= costo;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public double getCostoCurso() {
        return CostoCurso;
    }

    public void setCostoCurso(double costoCurso) {
        CostoCurso = costoCurso;
    }

    private double costoCurso;
}
