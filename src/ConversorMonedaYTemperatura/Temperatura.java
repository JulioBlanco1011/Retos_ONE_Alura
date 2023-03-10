
import javax.swing.JOptionPane;

public class Temperatura {

    public void ConvertirTemperaturas(double valor) {

        String opcion = (JOptionPane.showInputDialog(null,
                "Elije la Temperaturas que quieras Convertir ", "Temperaturas", JOptionPane.PLAIN_MESSAGE,
                null, new Object[]{"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Celsius a Rankine",
                        "De Fahrenheit a Celsius", "De Fahrenheit a Kelvin", "De Fahrenheit a Rankine", "De Kelvin a Celsius",
                        "De Kelvin a Fahrenheit", "De Kelvin a Rankine", "De Rankine a Celsius", "De Rankine a Fahrenheit",
                        "De Rankine a Kelvin"}, "Seleccion")).toString();

        switch (opcion) {
            case "De Celsius a Fahrenheit" -> {
                double CFahrenheit = (valor * 1.8) + 32;
                CFahrenheit = (double) Math.round(CFahrenheit * 100d) / 100;
                JOptionPane.showMessageDialog(null, "Son " + CFahrenheit + " Fahrenheit");
            }
            case "De Celsius a Kelvin" -> {
                double CKelvin = valor + 273.15;
                CKelvin = (double) Math.round(CKelvin * 100d) / 100;
                JOptionPane.showMessageDialog(null, "Son " + CKelvin + " Kelvin");
            }
            case "De Celsius a Rankine" -> {
                double CRankine = (valor * 1.8) + 491.67;
                CRankine = (double) Math.round(CRankine * 100d) / 100;
                JOptionPane.showMessageDialog(null, "Son " + CRankine + " Rankine");
            }
            case "De Fahrenheit a Celsius" -> {
                double FCelsius = (valor - 32) * (0.556);
                FCelsius = (double) Math.round(FCelsius * 100d) / 100;
                JOptionPane.showMessageDialog(null, "Son " + FCelsius + " Celsius");
            }
            case "De Fahrenheit a Kelvin" -> {
                double FKelvin = (valor + 459.67) * (0.556);
                FKelvin = (double) Math.round(FKelvin * 100d) / 100;
                JOptionPane.showMessageDialog(null, "Son " + FKelvin + " Kelvin");
            }
            case "De Fahrenheit a Rankine" -> {
                double FRankine = valor + 459.67;
                FRankine = (double) Math.round(FRankine * 100d) / 100;
                JOptionPane.showMessageDialog(null, "Son " + FRankine + " Rankine");
            }
            case "De Kelvin a Celsius" -> {
                double KCelsius = valor - 273.15;
                KCelsius = (double) Math.round(KCelsius * 100d) / 100;
                JOptionPane.showMessageDialog(null, "Son " + KCelsius + " Celsius");
            }
            case "De Kelvin a Fahrenheit" -> {
                double KFahrenhit = ((valor - 273.15) * (1.8)) + 32;
                KFahrenhit = (double) Math.round(KFahrenhit * 100d) / 100;
                JOptionPane.showMessageDialog(null, "Son " + KFahrenhit + " Fahrenheit");
            }
            case "De Kelvin a Rankine" -> {
                double KRankine = valor * 1.8;
                KRankine = (double) Math.round(KRankine * 100d) / 100;
                JOptionPane.showMessageDialog(null, "Son " + KRankine + " Rankine");
            }
            case "De Rankine a Celsius" -> {
                double RCelsius = (valor - 491.67) * (0.556);
                RCelsius = (double) Math.round(RCelsius * 100d) / 100;
                JOptionPane.showMessageDialog(null, "Son " + RCelsius + " Celsius");
            }
            case "De Rankine a Fahrenheit" -> {
                double RFahrenhit = valor - 459.67;
                RFahrenhit = (double) Math.round(RFahrenhit * 100d) / 100;
                JOptionPane.showMessageDialog(null, "Son " + RFahrenhit + " Fahrenheit");
            }
            case "De Rankine a Kelvin" -> {
                double RKelvin = valor * (0.556);
                RKelvin = (double) Math.round(RKelvin * 100d) / 100;
                JOptionPane.showMessageDialog(null, "Son " + RKelvin + " Kelvin");
            }
        }

    }
}