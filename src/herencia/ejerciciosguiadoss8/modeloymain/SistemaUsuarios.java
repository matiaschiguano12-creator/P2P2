package herencia.ejerciciosguiadoss8.modeloymain;

import herencia.ejerciciosguiadoss8.clases.Usuario;

import java.util.ArrayList;

public class SistemaUsuarios {

    private ArrayList<Usuario> usuarios;

    public SistemaUsuarios() {
        usuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario buscarUsuario(String username) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equalsIgnoreCase(username)) {
                return usuario;
            }
        }
        return null;
    }

    public boolean eliminarUsuario(String username) {
        Usuario usuario = buscarUsuario(username);

        if (usuario != null) {
            usuarios.remove(usuario);
            return true;
        }

        return false;
    }

    public String mostrarUsuarios() {
        String resultado = "";

        for (Usuario usuario : usuarios) {
            resultado += usuario.mostrarInformacion() + "\n";
        }

        return resultado;
    }
}