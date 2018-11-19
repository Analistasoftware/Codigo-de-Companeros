package sueldos;
import javax.swing.JOptionPane;

public class maxsueldo {
	
	static final long INF = 999999999;
	static public String teclado;
	
	public static void main(String[] args) {
		int numSueldos = inicializar();
		maxSueldo(numSueldos);
		
	}
	
	public static int inicializar() {
		boolean flag = true;
		int numSueldos = 0;
		while(flag==true) {
		try {
		teclado = JOptionPane.showInputDialog(null, "Ingrese el número de sueldos a ingresar: ","Número de sueldos", 1);
		String textolimpio = teclado.replaceAll("[^\\d]+", "");
		numSueldos = Integer.parseInt(textolimpio);
		flag = false;
		} catch(NumberFormatException a) {
			JOptionPane.showMessageDialog(null, "Ingrese un número valido", "Número de sueldos", JOptionPane.PLAIN_MESSAGE);
		}
		}
		return numSueldos;
	}
	
	
	public static void maxSueldo(int N) {
		long max = -INF;
		boolean flag = true;
		for(int i = 0; i<N; ++i) {
			flag = true;
			while(flag==true) {
				try {
				teclado = JOptionPane.showInputDialog(null, "Ingrese el "+(i+1)+ " sueldo:  ","Número de sueldos", 1);
				String textolimpio2 = teclado.replaceAll("[^\\d]+", "");
				long sueldo = Long.parseLong(textolimpio2);
				if(sueldo > max) {
					max = sueldo;
				}
				flag = false;
				} catch(NumberFormatException a) {
					JOptionPane.showMessageDialog(null, "Ingrese un número valido", "Número de sueldos", JOptionPane.PLAIN_MESSAGE);
				}
				}
			
		}
		if(max!=-INF) {
			JOptionPane.showMessageDialog(null, "El sueldo máximo es: "+max, "Sueldo máximo", JOptionPane.PLAIN_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "No ingreso ningún sueldo", "Sueldo máximo", JOptionPane.PLAIN_MESSAGE);
		}
	}

}
