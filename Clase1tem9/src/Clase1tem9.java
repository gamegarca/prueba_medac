
public class Clase1tem9 {

	public static void main(String[] args) {
		// Paso 1
		Semaforo oSem1 = new Semaforo();
		Semaforo oSem2 = new Semaforo();
		Semaforo oSem3 = new Semaforo();
		System.out.println(oSem1.imprimir());
		// Paso 2
		oSem1.setiColor(2);
		oSem1.setbParpadeando(true);
		System.out.println(oSem1.imprimir());
		// Paso 3
		oSem1.setiColor(3);
		oSem1.setbParpadeando(false);
		System.out.println(oSem1.imprimir());
		// Paso 4
		oSem1.setbParpadeando(true);
		System.out.println(oSem1.imprimir());
		// Paso 5
		oSem1.setiColor(2);
		oSem1.setbParpadeando(false);
		System.out.println(oSem1.imprimir());
		// Paso 6
		oSem1.setbParpadeando(true);
		System.out.println(oSem1.imprimir());
		// Paso 7
		for (int i = 0; i < 5; i++) {
			oSem1.cambia();
			System.out.println(oSem1.imprimir());
		}

		// Paso 8
		System.out.println("SEMAFORO 2: ");
		oSem2 = new Semaforo();
		oSem2.setiColor(oSem1.getiColor());
		oSem2.setbParpadeando(oSem2.isbParpadeando());
		System.out.println(oSem2.imprimir());

		// Ejercicio de Clase
		System.out.println("SEMAFORO 3: ");
		oSem3 = new Semaforo();
		oSem3.setiColor(oSem1.getiColor());
		oSem3.setbParpadeando(oSem3.isbParpadeando());
		System.out.println(oSem3.imprimir());

	}

}
