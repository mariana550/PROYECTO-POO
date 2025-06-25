package gym;

public class Rutina {
    public String obtenerRutina() {
        return "Rutina genérica.";
    }

    public static Rutina generarRutina(double peso) {
        if (peso < 60) {
            return new RutinaGanarMasa();
        } else if (peso < 80) {
            return new RutinaEquilibrada();
        } else {
            return new RutinaPerderPeso();
        }
    }
}