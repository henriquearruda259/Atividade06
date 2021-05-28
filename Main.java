package Atividade;

public class Main {
	
	public static void main(String[] args) {

		celular celular = new celular ("Samsung");
	
		System.out.println(celular.getTipoAparelho());
		celular.carregar();
		System.out.println(celular.toString());
		System.out.println("Bateria: mAh" + celular.getMAH());
		System.out.println(celular.getModeloProcessador());
		System.out.println("Potencia: " + celular.getPotencia());
		System.out.println("Tela: " + celular.getTipoTela());
	
}

}
