package gym;

import java.util.ArrayList;
import java.util.List;
import gym.ConexionUsuario;
public class UsuarioService {
    private static List<Usuario> usuarios = new ArrayList<>();

    static {
        usuarios.add(new Usuario("admin", "1234"));
    }

    public static void registrar(Usuario usuario) {
        usuarios.add(usuario);
        ConexionUsuario.guardarUsuario(
                usuario.getNombre(),
                usuario.getContraseña(),
                usuario.getPeso()
        );
    }

    public static Usuario autenticar(String nombre, String contraseña) {
        for (Usuario u : usuarios) {
            if (u.getNombre().equals(nombre) && u.verificarContraseña(contraseña)) {
                return u;
            }
        }
        return null;
    }
}