
import java.time.LocalTime;
import java.util.*;

/**
 * 
 */
public class Alumno {

    /**
     * Default constructor
     */
    public Alumno() {
    }

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private Date fechaNacimiento;

    /**
     * 
     */
    private LocalTime horaEntrada;

    /**
     * 
     */
    private LocalTime horaSalida;

    /**
     * 
     */
    private Padre padre;

    /**
     * 
     */
    private Padre madre;


    /**
     * 
     */
    private Grupo grupo;

    /**
     * @return
     */
    public Grupo obtenerGrupo() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<Profesor> obtenerProfesores() {
        // TODO implement here
        return null;
    }

    /**
     * @param nuevoGrupo 
     * @return
     */
    public void cambiarGrupo(Grupo nuevoGrupo) {
        // TODO implement here
    
    }

}