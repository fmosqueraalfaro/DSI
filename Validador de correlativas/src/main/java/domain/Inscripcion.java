package domain;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

public class Inscripcion {

  @Setter@Getter
  private Alumno alumno;
  @Setter@Getter
  private List<Materia>materiasAAnotarse;

  public Inscripcion(Alumno alumno) {
    this.alumno = alumno;
    this.materiasAAnotarse = new ArrayList<Materia>();
  }

  public Boolean aprobada() {
    return materiasAAnotarse.stream()
        .allMatch(materia -> alumno.cumpleConCorrelativas(materia));
  }

  public void agregarMateriaAAnotarse(Materia materia) {
    materiasAAnotarse.add(materia);
  }
}
