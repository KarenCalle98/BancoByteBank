
public class TestReferencia3 {
	
	public static void main(String[] args) {
		Cuenta cuentaDeKaren = new Cuenta();
		
		
		cuentaDeKaren.titular = new Cliente();
		cuentaDeKaren.titular.nombre = "Karen";
		System.out.println(cuentaDeKaren.titular.nombre);
	}

}
