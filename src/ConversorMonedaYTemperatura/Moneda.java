import javax.swing.JOptionPane;
public class Moneda {

    public void ConvertirMonedas(double valor) {

        String opcion = (JOptionPane.showInputDialog(null,
                "Elije la moneda que deseas convertir tu dinero ", "Monedas",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Pesos a Dólar", "De Pesos a Euro",
                        "De Pesos a Libras Esterlinas", "De Pesos a Yen Japonés",
                        "De Pesos a Won sub-coreano", "De Dólar a Pesos", "De Euro a Pesos",
                        "De Libras Esterlinas a Pesos", "De Yen Japonés a Pesos", "De Won sub-coreano a Pesos"},
                "Seleccion")).toString();


        switch (opcion){
            case "De Pesos a Dólar":
                double monedaDolar = valor / 137.68;
                monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
                JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
                break;

            case "De Pesos a Euro":
                double monedaEuro = valor / 137.20;
                monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
                JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
                break;

            case "De Pesos a Libras Esterlinas":
                double monedaLibra = valor / 161.52;
                monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
                JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Libras Esterlinas");
                break;

            case "De Pesos a Yen Japonés":
                double monedaYen = valor / 1;
                monedaYen = (double) Math.round(monedaYen * 100d) / 100;
                JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yen Japonés");
                break;

            case "De Pesos a Won sub-coreano":
                double monedaWon = valor / 0.1;
                monedaWon = (double) Math.round(monedaWon * 100d) / 100;
                JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Won sub-coreano");
                break;

            case "De Dólar a Pesos":
                monedaDolar = 137.68 * valor;
                monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
                JOptionPane.showMessageDialog(null, "Tienes Dolares " + monedaDolar + " en pesos");
                break;

            case "De Euro a Pesos":
                monedaEuro = valor * 137.20;
                monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
                JOptionPane.showMessageDialog(null, "Tienes Euros " + monedaEuro + " en pesos");
                break;

            case "De Libras Esterlinas a Pesos":
                monedaLibra = valor * 161.52;
                monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
                JOptionPane.showMessageDialog(null, "Tienes Libras Esterlinas " + monedaLibra + " en pesos");
                break;

            case "De Yen Japonés a Pesos":
                monedaYen = valor * 1;
                monedaYen = (double) Math.round(monedaYen * 100d) / 100;
                JOptionPane.showMessageDialog(null, "Tienes Yen Japonés " + monedaYen + " en pesos");
                break;

            case "De Won sub-coreano a Pesos":
                monedaWon = valor * 0.1;
                monedaWon = (double) Math.round(monedaWon * 100d) / 100;
                JOptionPane.showMessageDialog(null, "Tienes Won sub-coreano " + monedaWon + " en pesos");
        }


    }


}

