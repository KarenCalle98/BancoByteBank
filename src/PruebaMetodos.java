
public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta ();
		miCuenta.saldo = 300;
		miCuenta.depositar(200);
		System.out.println(miCuenta.saldo);
		
		miCuenta.retirar(100);
		System.out.println(miCuenta.saldo);
		
		Cuenta CuentaDeJimena = new Cuenta();
		CuentaDeJimena.depositar(1000);
		boolean puedeTransferir = CuentaDeJimena.transferir(400, miCuenta);
		
		if(puedeTransferir) {
			System.out.println("Tranferencia exitosa");
		}else {
			System.out.println("No es posible");
		}
		
		System.out.println(CuentaDeJimena.saldo);
		System.out.println(miCuenta.saldo);
	}
	
 
}

