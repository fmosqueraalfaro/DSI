package domain;

import java.util.List;

public class Inscripcion {

  private Alumno alumno;
  private List<Materia>materiasAAnotarse;

  public Inscripcion(Alumno alumno, List<Materia> materiasAAnotarse) {
    this.alumno = alumno;
    this.materiasAAnotarse = materiasAAnotarse;
  }

  public Boolean aprobada() {
    return materiasAAnotarse.stream()
        .allMatch(materia -> alumno.cumpleConCorrelativas(materia));
  }
}
