

public class Directorio {

    private Persona[] personas;
    private int tamano;
    private int ocupado;

    public Directorio(int tamano) {
        this.tamano = tamano;
        this.personas = new Persona[tamano];
        this.ocupado = 0;
    }

    //TODO: verificar con codigo original
    public boolean agregarContacto(Persona persona) {
        if (this.ocupado < this.tamano) {
            this.personas[this.ocupado] = persona;
            this.ocupado++;
            return true;
        }
        return false;
    }
    //TODO: verificar con codigo original
    public void mostrarContactos() {
        for (int i = 0; i < this.ocupado; i++) {
            System.out.println(this.personas[i]);
        }
    }

    public String buscarContacto(String nombre) {

        for (int i = 0; i < this.ocupado; i++) {
            if (this.personas[i].getNombre().equals(nombre)) {
                return this.personas[i].toString();
            }
        }
        return "Contacto no encontrado";
    }

    public String buscarContacto(int edad) {

        for (int i = 0; i < this.ocupado; i++) {
            if (this.personas[i].getEdad() == edad) {
                return this.personas[i].toString();
            }
        }
        return "Contacto no encontrado";
    }

}
