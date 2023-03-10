import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Moneda conversionM = new Moneda();
        Temperatura conversionT = new Temperatura();

        while (true) {
            String opciones = JOptionPane.showInputDialog(null, "Escoja una opción",
                    "Menú", JOptionPane.PLAIN_MESSAGE, null,
                    new Object[]{"Conversor de Monedas", "Conversor de Temperatura"},
                    "Seleccionar").toString();

            switch (opciones) {
                case "Conversor de Monedas":
                    String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
                    double valorRecibido = Double.parseDouble(input);
                    conversionM.ConvertirMonedas(valorRecibido);

                    int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
                    if (JOptionPane.OK_OPTION == respuesta) {
                        System.out.println("Entrar");
                    } else {
                        JOptionPane.showMessageDialog(null, "Conversor finalizado");
                    }
                    break;

                case "Conversor de Temperatura":
                    String input1 = JOptionPane.showInputDialog(null, "Ingrese el valor a Convertir");
                    double valorRecibidoT = Double.parseDouble(input1);
                    conversionT.ConvertirTemperaturas(valorRecibidoT);


                    int respuestaT = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
                    if (JOptionPane.OK_OPTION == respuestaT) {
                             System.out.println("Entra");
                    } else {
                        JOptionPane.showMessageDialog(null, "Cerrando Conversor");
                    }
            }
            break;

        }
    }
}