package ChallengeONEJava;

public class SeleccionMoneda {
	public void seleccionmoneda() {
		
		Conversor.MonedaEscogida = 1; 
		Operaciones op = new Operaciones();
		
		switch(Conversor.IItem) {
		
		case "Dolar":
			Conversor.MonedaEscogida = IndicesDolar.indiceDolar;
			op.operaciones();
			//IndicadorMonedas(MonedaEscogida);
			break;

		case "Euros":
			Conversor.MonedaEscogida = IndicesDolar.indiceEuros;
			op.operaciones();
			//IndicadorMonedas(MonedaEscogida);
			break;
		case "Libras Esterlinas":
			Conversor.MonedaEscogida = IndicesDolar.indiceLibras;
			op.operaciones();
			//IndicadorMonedas(MonedaEscogida);
			break;
		
		case "Yen Japones":
			Conversor.MonedaEscogida = IndicesDolar.indiceYen;
			op.operaciones();
			//IndicadorMonedas(MonedaEscogida);
			break;
		case "Won sul corea":
			Conversor.MonedaEscogida =IndicesDolar.indiceWon;
			op.operaciones();
			//IndicadorMonedas(MonedaEscogida);
			break;
		case "Pesos":
			Conversor.MonedaEscogida = IndicesDolar.indicePesos;
			op.operaciones();
			//IndicadorMonedas(MonedaEscogida);
			break;
		}
		
	}

}
