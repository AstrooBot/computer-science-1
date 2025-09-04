

public class Persona {

    private String nombre;
    private int edad;
    private String telefono;
    private String paisOrigen;

    public Persona(String nombre, int edad, String telefono, String paisOrigen) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", telefono='" + telefono + '\'' +
                ", paisOrigen='" + paisOrigen + '\'' +
                '}';
    }

    private String getNombre() {
        return nombre;
    }
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private int getEdad() {
        return edad;
    }
    private void setEdad(int edad) {
        this.edad = edad;
    }
    private String getTelefono() {
        return telefono;
    }
    private void setTelefono(int edad) {
        this.edad = edad;
    }
    private String getPaisOrigen() {
        return paisOrigen;
    }
    private void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }


}