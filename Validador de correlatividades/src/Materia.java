import java.util.ArrayList;
import java.util.List;

public class Materia {
    List<Materia> correlativas;
    String nombre;

    public Materia(String _nombre, List<Materia> _correlativas){
        nombre = _nombre;
        correlativas = _correlativas;
    }

}