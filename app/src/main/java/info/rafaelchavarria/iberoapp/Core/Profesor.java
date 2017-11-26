package info.rafaelchavarria.iberoapp.Core;

/**
 * Creado por Rafael Chavarría el 26/11/2017.
 */

public class Profesor extends Persona {

    private String email;

    public Profesor(String nombre, String aPaterno, String aMaterno, String clave, String email){
        super.nombre = nombre;
        super.aPaterno = aPaterno;
        super.aMaterno = aMaterno;
        super.clave = clave;
        this.email = email;
    }


}
