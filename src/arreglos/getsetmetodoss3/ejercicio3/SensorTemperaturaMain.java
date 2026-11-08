package arreglos.getsetmetodoss3.ejercicio3;

public class SensorTemperaturaMain {
    public static void main(String[] args) {

        SensorTemperatura[] sensores = new SensorTemperatura[3];

        sensores[0] = new SensorTemperatura("S001", 25.5, "C");
        sensores[1] = new SensorTemperatura("S002", 28.3, "C");
        sensores[2] = new SensorTemperatura("S003", 30.1, "C");

        for(int i = 0; i < sensores.length; i++){
            sensores[i].mostrarLectura();
        }
    }
}
