package co.edu.unipiloto;

public class SignalExpert {
    public static String getBrands(String signalType) {
        switch (signalType) {
            case "Señales de advertencia":
                return "Señal de curva pronunciada a la izquierda \n" +
                        "Señal de peligro por hielo o nieve en la carretera \n" +
                        "Señal de cruce de animales";
            case "Señales de regulación":
                return "Señal de límite de velocidad máximo \n" +
                        "Señal de prohibido estacionar \n" +
                        "Señal de ceda el paso";
            case "Señales informativas":
                return "Señal de servicio de gasolina próxima \n" +
                        "Señal de área de descanso próxima \n" +
                        "Señal de salida próxima";
            case "Señales de obras en la vía":
                return "Señal de reducción de carriles por obras \n" +
                        "Señal de maquinaria en la carretera \n" +
                        "Señal de trabajos en la vía";
            default:
                return "Yo shouldn't see this";
        }
    }
}
