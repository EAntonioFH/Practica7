package modelosHumanos;

import modelosTecnologicos.Dispositivo;

public class Estudiante extends Comprador {
	public Estudiante() {
		super(Dispositivo.ESTUDIANTE);
	}

	@Override
	public double getDescuento() {
		return 0.1;
	}
}
