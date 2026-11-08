package arreglos.getsetmetodoss3.ejercicio2;

public class UsuarioMain {
    public static void main(String[] args) {

        Usuario[] usuarios = new Usuario[3];

        usuarios[0] = new Usuario();
        usuarios[0].setNombreUsuario("Juan");
        usuarios[0].setCorreo("juan@gmail.com");
        usuarios[0].setContrasena("1234");

        usuarios[1] = new Usuario();
        usuarios[1].setNombreUsuario("Maria");
        usuarios[1].setCorreo("maria@gmail.com");
        usuarios[1].setContrasena("5678");

        usuarios[2] = new Usuario();
        usuarios[2].setNombreUsuario("Pedro");
        usuarios[2].setCorreo("pedro@gmail.com");
        usuarios[2].setContrasena("9999");

        for(int i = 0; i < usuarios.length; i++){
            usuarios[i].mostrarDatos();
        }
    }
}
