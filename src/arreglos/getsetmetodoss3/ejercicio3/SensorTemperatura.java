package arreglos.getsetmetodoss3.ejercicio3;

public class SensorTemperatura {

    private String idSensor;
    private double temperatura;
    private String unidad;

    public SensorTemperatura(String idSensor, double temperatura, String unidad) {
        this.idSensor = idSensor;
        this.temperatura = temperatura;
        this.unidad = unidad;
    }

    public String getIdSensor() {
        return idSensor;
    }

    public void setIdSensor(String idSensor) {
        this.idSensor = idSensor;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public void mostrarLectura() {
        System.out.println("Sensor: " + idSensor);
        System.out.println("Temperatura: " + temperatura + " " + unidad);
        System.out.println();
    }
}
