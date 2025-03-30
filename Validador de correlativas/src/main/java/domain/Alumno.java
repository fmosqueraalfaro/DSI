package domain;

import com.sun.org.apache.xpath.internal.operations.Bool;
import java.util.List;

public class Alumno {

  private String nombre;
  private Integer legajo;
  private List<Materia> materiasAprobadas;

  public Alumno(String nombre, Integer legajo, List<Materia> materiasAprobadas) {
    this.nombre = nombre;
    this.legajo = legajo;
    this.materiasAprobadas = materiasAprobadas;
  }

  public Boolean cumpleConCorrelativas(Materia materia) {
    return materiasAprobadas.containsAll(materia.getCorrelativas());
  }
}
