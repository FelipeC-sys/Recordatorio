public class Persona {

    protected String nombre;

    public Persona(String nombre) {
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        if (nombre == null || nombre.trim().isEmpty()) {
            this.nombre = "Invitado";
        } else {
            this.nombre = nombre.trim();
        }
    }
}
