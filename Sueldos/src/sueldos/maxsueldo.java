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
		teclado = JOptionPane.showInputDialog(null, "Ingrese el n�mero de sueldos a ingresar: ","N�mero de sueldos", 1);
		String textolimpio = teclado.replaceAll("[^\\d]+", "");
		numSueldos = Integer.parseInt(textolimpio);
		flag = false;
		} catch(NumberFormatException a) {
			JOptionPane.showMessageDialog(null, "Ingrese un n�mero valido", "N�mero de sueldos", JOptionPane.PLAIN_MESSAGE);
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
				teclado = JOptionPane.showInputDialog(null, "Ingrese el "+(i+1)+ " sueldo:  ","N�mero de sueldos", 1);
				String textolimpio2 = teclado.replaceAll("[^\\d]+", "");
				long sueldo = Long.parseLong(textolimpio2);
				if(sueldo > max) {
					max = sueldo;
				}
				flag = false;
				} catch(NumberFormatException a) {
					JOptionPane.showMessageDialog(null, "Ingrese un n�mero valido", "N�mero de sueldos", JOptionPane.PLAIN_MESSAGE);
				}
				}
			
		}
		if(max!=-INF) {
			JOptionPane.showMessageDialog(null, "El sueldo m�ximo es: "+max, "Sueldo m�ximo", JOptionPane.PLAIN_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "No ingreso ning�n sueldo", "Sueldo m�ximo", JOptionPane.PLAIN_MESSAGE);
		}
	}

}
