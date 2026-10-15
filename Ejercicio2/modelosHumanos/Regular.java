package modelosHumanos;

import modelosTecnologicos.Dispositivo;

public class Regular extends Comprador {
	public Regular() {
		super(Dispositivo.REGULAR);
	}

	@Override
	public double getDescuento() {
		return 0.2;
	}
}
