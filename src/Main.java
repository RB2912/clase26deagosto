import PkgAlumnos.Alumno;
import PkgAlumnos.CursoAsignado;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<CursoAsignado> cat_cursos=new ArrayList<>();

        CursoAsignado curso1 = new CursoAsignado(101, "Programación", 500);
        CursoAsignado curso2 = new CursoAsignado(105, "Derecho", 1);
        CursoAsignado curso3 = new CursoAsignado(110, "Estadística", 450);
        CursoAsignado curso4 = new CursoAsignado(120, "Electrónica", 400);

        Alumno al1 = new Alumno("2023015", "Andrea", "55555", "5 Calle 8-36 Zona 1");
        al1.agregarCursoAsignado(curso2);
        al1.agregarCursoAsignado(curso3);
        al1.mostrarInformacion();

        Alumno al2 = new Alumno("2020055", "Monica", "1111", "8-36 Zona10");
        al2.agregarCursoAsignado(curso1);
        al2.agregarCursoAsignado(curso4);
        al2.agregarCursoAsignado(curso2);
        al2.mostrarInformacion();

        Alumno al3 = new Alumno("2021001", "Juan", "12345", "10 Avenida 5-25 Zona 2");
        al3.agregarCursoAsignado(curso1);
        al3.agregarCursoAsignado(curso3);
        al3.agregarCursoAsignado(curso4);
        al3.mostrarInformacion();

        Alumno al4 = new Alumno("2022050", "Maria", "67890", "15 Calle 12-10 Zona 4");
        al4.agregarCursoAsignado(curso2);
        al4.agregarCursoAsignado(curso3);
        al4.mostrarInformacion();




    }
}