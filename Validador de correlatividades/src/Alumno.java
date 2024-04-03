import java.util.Collection;
import java.util.List;

public class Alumno {
    String nombre;
    String legajo;
    List<Materia> materiasAprobadas;

    Alumno(String _nombre, String _legajo, List<Materia> _materiasAprobadas) {
        this.nombre = _nombre;
        this.legajo = _legajo;
        this.materiasAprobadas = _materiasAprobadas;
    }

    // TODO: implementar get, no acceder a la variable directo !!
    boolean cumpleCorrelativas(Materia materia) {
        if (materia.correlativas != null)
            return materiasAprobadas.containsAll(materia.correlativas);
        else return true;
    }

}