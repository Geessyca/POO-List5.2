package List52;

public class Employee extends User {
	public Employee(String name,String password){
		super(name,password);
	}
	private static float salesAmount = 0;
	
	public void Venda(String nameProduct, float price, Client client) {
		System.out.println("\n"+getName()+" vendeu o produto "+nameProduct+" por R$ "+price);
		System.out.println("Dados do cliente:");
		client.generalData();
		Employee.salesAmount = Employee.salesAmount+price;
	}
	
	public float getSalesAmount(){
		return Employee.salesAmount;
	}
}
