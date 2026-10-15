package modelosHumanos;

import modelosTecnologicos.Dispositivo;

public class ClienteVip extends Comprador {
	public ClienteVip() {
		super(Dispositivo.MEJOR);
	}

	@Override
	public double getDescuento() {
		return 0.3;
	}
}
