package domain;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

public class Materia {

  @Getter@Setter
  private String nombre;
  @Getter@Setter
  private List<Materia> correlativas;

  public Materia(String nombre) {
    this.nombre = nombre;
    this.correlativas = new ArrayList<>();
  }


}
