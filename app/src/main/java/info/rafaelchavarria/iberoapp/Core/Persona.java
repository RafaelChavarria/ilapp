package info.rafaelchavarria.iberoapp.Core;

/**
 * Creado por Rafael Chavarría el 26/11/2017.
 */

public abstract class Persona {

        protected String nombre;
        protected String aPaterno;
        protected String aMaterno;
        protected String clave;

        @Override
        public String toString() {
            return aPaterno + " " + aMaterno + " " + nombre;
        }

}
