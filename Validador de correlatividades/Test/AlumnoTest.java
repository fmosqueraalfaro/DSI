import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class AlumnoTest {

    Alumno alumno;
    Materia am2;
    Materia am1;
    Materia aga;
    Materia f1;
    Materia f2;


    @BeforeEach
    public void init(){

        // Materias
        am1 = new Materia("Análisis Matemático 1", null);
        aga = new Materia("Álgebra y Geometría Analítica", null);
        am2 = new Materia("Análisis Matemático 2", Arrays.asList(am1, aga));
        f1 = new Materia("Física 1", null);
        f2 = new Materia("Física 2", Arrays.asList(f1));

        // Alumno
        alumno = new Alumno("Francisco Mosquera Alfaro", "2038870", Arrays.asList(am1, aga));

    }

    @Test
    public void cumpleCorrelativas(){
        Assertions.assertTrue(alumno.cumpleCorrelativas(am2));
    }

    @Test
    public void noCumpleCorrelativas(){
        Assertions.assertFalse(alumno.cumpleCorrelativas(f2));
    }



}