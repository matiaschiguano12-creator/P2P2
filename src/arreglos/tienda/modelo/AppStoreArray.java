package arreglos.tienda.modelo;

import java.util.ArrayList;
import java.util.List;

public class AppStoreArray {
    List<Juego> juegos;

    public AppStoreArray(){
        juegos = new ArrayList<Juego>();
    }

    public void cargarDatos(){
        agregarJuego(new Juego("Minecraft😂", "Sandobox", 14, 35, 50));
        agregarJuego(new Juego("Roblox", "PLatformer", 2, 90, 20));
    }

    public List<Juego> getJuegos() {
        return juegos;
    }

    public boolean agregarJuego(Juego j){
        if(j != null){
            //lo anade al array
            juegos.add(j);
            return true;
        }
        return false;
    }
    public Juego buscarJuego(String nombre){
        if(nombre != null && !nombre.trim().isEmpty()){
            for (int i = 0; i <juegos.size(); i++) {
                if(juegos.get(i).getNombre().equals(nombre)){
                    return juegos.get(i);
                }
            }
        }
        return null;
    }

    public boolean comprarJuego(String nombre, int cantidad){
        if(nombre != null && !nombre.trim().isEmpty() && cantidad > 0){
            Juego j = buscarJuego(nombre);
            if(j != null){
                return j.comprar(cantidad);
            }
        }
        return false;
    }

    public double vender(String nombre, int cantidad){
        Juego j = buscarJuego(nombre);// Juego j solo me sirve para tener una variable la cual retornar una vez se encuentre el juego, sino se encuentre simplemente retorna otra cosa
        if(j != null){
            if(j.vender(cantidad)) {
                return j.getPrecio() * cantidad;
            }else{
                return 0;
            }
        }
        return 0;
    }

    public String masVendido (){
        String nombreDelMasVendido = "";//por ahora igual q arriba solo esta vacio
        int mayor; //por cuanto es el mas vendido y nos sirve depues para comparar con los demas juegos
        if (juegos.isEmpty()){ //Juegos.size() > 0
            nombreDelMasVendido = juegos.get(0).getNombre();
            mayor = juegos.get(0).getLicenciasVendidas();
            for (Juego j : juegos) {
                if(j.getLicenciasVendidas() > 0){
                    nombreDelMasVendido = j.getNombre();
                    mayor = j.getLicenciasVendidas();
                }
            }
        }
        return nombreDelMasVendido;
    }
}
