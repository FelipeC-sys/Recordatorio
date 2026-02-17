class Usuario extends Persona {

    public Usuario(String nombre) {
        super(nombre);
    }

    public void saludar() {
        System.out.println("\n Bienvenido " + nombre);
    }
}