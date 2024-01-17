
public class TestReferencia2 {
	
	public static void main(String[] args) {
		Cliente Karen = new Cliente();
		Karen.nombre = "Karen";
		Karen.documento = "34561234";
		Karen.telefono = "2345678901";
		
		Cuenta cuentaDeKaren = new Cuenta();
		cuentaDeKaren.agencia = 1;
		cuentaDeKaren.titular = Karen;
		
		System.out.println(cuentaDeKaren.titular.documento);
		System.out.println(cuentaDeKaren.titular);
		
		
	}

}
