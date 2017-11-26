package info.rafaelchavarria.iberoapp.Core;

/**
 * Creado por Rafael Chavarría el 26/11/2017.
 */

public class Alumno extends Persona {

    private String email;

    public Alumno(String nombre, String aPaterno, String aMaterno, String clave){
        super.nombre = nombre;
        super.aPaterno = aPaterno;
        super.aMaterno = aMaterno;
        super.clave = clave;
        this.setEmail(clave + "@iberoleon.edu.mx");
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
