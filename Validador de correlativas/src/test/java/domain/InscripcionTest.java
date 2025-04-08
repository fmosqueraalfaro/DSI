package domain;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InscripcionTest {

  @Test
  @DisplayName("Test obtener nombre completo de persona")
  public void testObtenerNombreCompleto() {
    Alumno alumno = new Alumno("Francisco",1);

    Assertions.assertEquals("Francisco", alumno.getNombre());
  }

  @Test
  @DisplayName("Alumno puede cursar materia")
  public void testCursarMateria() {
    Alumno alumno = new Alumno("Francisco",1);
    Materia materia = new Materia("AM 1");
    Assertions.assertEquals(true, alumno.cumpleConCorrelativas(materia));
  }
  @Test
  @DisplayName("Alumno puede cursar materia")
  public void testNoCursarMateria() {
    Alumno alumno = new Alumno("Francisco",1);
    Materia materia = new Materia("AM 2");
    Materia materia2 = new Materia("AM 1");
    materia.agregarCorrelativa(materia2);
    Assertions.assertEquals(false, alumno.cumpleConCorrelativas(materia));
  }

  @Test
  @DisplayName("Inscripción puede inscribir materia")
  public void testInscripcionMateriaAprobado() {
    Alumno alumno = new Alumno("Francisco",1);
    Materia materia = new Materia("AM 1");
    Materia materia2 = new Materia("AM 2");
    materia2.agregarCorrelativa(materia);
    alumno.addMateriaAprobada(materia);
    Inscripcion inscripcion = new Inscripcion(alumno);
    inscripcion.agregarMateriaAAnotarse(materia2);

    Assertions.assertEquals(true, inscripcion.aprobada());

  }

  @Test
  @DisplayName("Inscripción puede inscribir materia")
  public void testInscripcionMateriaDesaprobado() {
    Alumno alumno = new Alumno("Francisco",1);
    Materia materia = new Materia("AM 1");
    Materia materia2 = new Materia("AM 2");
    materia2.agregarCorrelativa(materia);
    Inscripcion inscripcion = new Inscripcion(alumno);
    inscripcion.agregarMateriaAAnotarse(materia2);

    Assertions.assertEquals(false, inscripcion.aprobada());

  }


}
