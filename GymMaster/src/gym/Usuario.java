package gym;

public class Usuario extends Persona {
    private String contraseña;
    private double peso;

    public Usuario(String nombre, String contraseña) {
        super(nombre);
        this.contraseña = contraseña;
    }

    public boolean verificarContraseña(String contrasenaIngresada) {
        return this.contraseña.equals(contrasenaIngresada);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public String getContraseña() {
        return contraseña;
    }
}