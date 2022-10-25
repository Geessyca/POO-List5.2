package List52;

public class Manager extends Employee{
	Manager(String name, String password){
		super(name,password);
	}
	float salesAmount = getSalesAmount();
	public void cashierClosing() {
		System.out.print("\n\nGerente: " + this.getName());
		System.out.print("\n\nFechamento do caixa\n Valor salesAmount R$: " + this.salesAmount);
	}
}
