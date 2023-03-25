package ChallengeONEJava;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Operaciones {

	public void operaciones()
	{

		double OperadorDolar = IndicesDolar.indiceDolar / Conversor.MonedaEscogida;
		double OperadorEuros = IndicesDolar.indiceEuros / Conversor.MonedaEscogida;
		double OperadorLibras = IndicesDolar.indiceLibras / Conversor.MonedaEscogida;
		double OperadorPesos = IndicesDolar.indicePesos / Conversor.MonedaEscogida;
		double OperadorWon = IndicesDolar.indiceWon / Conversor.MonedaEscogida;
		double OperadorYen = IndicesDolar.indiceYen / Conversor.MonedaEscogida;

		DecimalFormat df = new DecimalFormat("#.000");
		try {
			double i = Double.parseDouble(Conversor.textMonedas.getText());
			Conversor.textDolar.setText(df.format(i*OperadorDolar));
		    Conversor.textEuros.setText(df.format(i*OperadorEuros));
			Conversor.textLibras.setText(df.format(i*OperadorLibras));
			Conversor.textPesos.setText(df.format(i*OperadorPesos));
			Conversor.textWon.setText(df.format(i*OperadorWon));
			Conversor.textYen.setText(df.format(i*OperadorYen));
			
		}catch (NumberFormatException nfe){
			JOptionPane.showMessageDialog(null, "El valor ingresado no es correcto, debe ingreser solo numeros");
			LimpiarCampos lim = new LimpiarCampos();
			lim.limpiarCampos();
		}
		
		

		
	}
}
