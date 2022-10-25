package List52;

public class Main {
	public static void main(String[] args) {	
		Client firstClient = new Client("Gessyca","111",142);
		Client secondClient = new Client("Quezia","222",444);
		Client thirdClient = new Client("Eyshila","333",666);
		
		Employee firstEmployee = new Employee("Moreira1","123");		
		firstEmployee.Venda("Batata", 10,firstClient);
		Employee secondEmployee = new Employee("Moreira2","123");		
		secondEmployee.Venda("carne", 20,secondClient);
		Employee thirdEmployee = new Employee("Moreira3","123");		
		thirdEmployee.Venda("sorvete", 30,thirdClient);
		
		
		Manager manager = new Manager("Gerente","123456");
		manager.cashierClosing();
	}

}
