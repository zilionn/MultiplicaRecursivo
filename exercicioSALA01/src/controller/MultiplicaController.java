package controller;

public class MultiplicaController {

	public MultiplicaController() { 
		super();
	}
	
	public int multiplica(int a, int b) {
		if (b <= 0) {
			return 0;
		} else {
			return a + multiplica(a, b - 1); 
		}
	}
}
