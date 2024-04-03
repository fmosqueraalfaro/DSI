import java.util.*;

public class Inscripcion {

    List<Materia> materias;
    Alumno alumno;

    Inscripcion(List<Materia> _materias, Alumno _alumno){
        this.materias = _materias;
        this.alumno = _alumno;
    }

    public boolean aceptada() {

        // Siento que no es declarativo, alguna idea?
        // quizás "materias.forEach()" pero no puedo retornar desde el foreach...
        for (Materia materia : materias)
            if ( !alumno.cumpleCorrelativas(materia) ) return false;

        return true;

    }




}