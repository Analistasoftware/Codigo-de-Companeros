import javax.swing.*;

public class SueldoDemo {

    public static void main(String[] args){
     int numSueldos = inicializa();
     long resultado = maxSueldo(numSueldos);

     JOptionPane.showMessageDialog(null,"El sueldo máximo es $" + resultado, "Resultado", JOptionPane.PLAIN_MESSAGE );
    }

    public static int inicializa(){
        boolean flag = true;
        int numSueldos = 0;

        while(flag==true) {
            try {
                String texto = JOptionPane.showInputDialog("Ingresa numero de sueldos: ");
                //texto.matches("[0-9]+");
                numSueldos = Integer.parseInt(texto);
                flag = false;
            } catch (NumberFormatException a) {
                JOptionPane.showMessageDialog(null, "Ingresa solo números", "Resultado", JOptionPane.PLAIN_MESSAGE);
            }
        }
        return numSueldos;
    }

    public static int maxSueldo(int numSueldos){
        int i = 1 ;
        int sueldo = 0;
        int sueldoMax = 0;


        while(i <= numSueldos){
            String texto = JOptionPane.showInputDialog("Ingresa el "
                    + i + "er sueldo: ");
            String textoLimpio = texto.replaceAll("[^\\d]+", "");
            sueldo = Integer.parseInt(textoLimpio);
            if (sueldo >= sueldoMax){
               sueldoMax = sueldo;
            }
            i++;
        }
        return sueldoMax;
    }

   /* public static void validate(String typedNumber) {
        boolean isCorrect = isNumber(typedNumber);
        if (!isCorrect) {
            System.out.println("Validation fail");
            JOptionPane.showMessageDialog(null,"Ingresa solo números", "Resultado", JOptionPane.PLAIN_MESSAGE );
            inicializa();
        }
        else {
            System.out.println("Validation success");
        }
    }

    public static boolean isNumber(String typedNumber) {
        return typedNumber.matches("[0-9]+");
    }
    */
}
