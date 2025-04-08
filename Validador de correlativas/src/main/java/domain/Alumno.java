package domain;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

public class Alumno {

  @Getter
  private String nombre;
  private Integer legajo;
  @Setter
  private List<Materia> materiasAprobadas;

  public Alumno(String nombre, Integer legajo) {
    this.nombre = nombre;
    this.legajo = legajo;
    this.materiasAprobadas = new ArrayList<Materia>();
  }

  public Boolean cumpleConCorrelativas(Materia materia) {
    return materiasAprobadas.containsAll(materia.getCorrelativas());
  }

  public void addMateriaAprobada(Materia materia) {
    materiasAprobadas.add(materia);
  }
}
