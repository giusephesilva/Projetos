package br.exercicios.dia_03_04_18_.exercicio1;

public class Circulo implements FormaGeometrica {

private float raio;

	
	public float getRaio() {
	return raio;
}

public void setRaio(float raio) {
	this.raio = raio;
}

	@Override
	public float area(float raio) {
		return (float) (3.14*(raio*raio));
		
	}

	@Override
	public float comprimento(float raio) {
		
		return (float) (2*3.14*raio);
	}

}
