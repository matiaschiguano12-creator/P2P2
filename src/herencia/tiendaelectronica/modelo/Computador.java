package herencia.tiendaelectronica.modelo;

public class Computador extends Dispositivo{
    private int ram;

    public Computador(int codigo, String marca, int ram) {
        super(codigo, marca);
        this.ram = ram;
    }

    public boolean ejecutarPrograma(String nombre){
        if(nombre != null && !nombre.trim().isEmpty()){
            if(isEstado()){}
            return  true;
        }
        return false;
    }
}
