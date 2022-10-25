package List52;

public class Client extends User{
	private int cpf;
	public Client(String name,String password,int cpf){
		super(name,password);
		this.cpf=cpf;
	}
	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public void generalData(){
		System.out.println("Name: "+ getName());
		System.out.println("Password: "+ getPassword());
		System.out.println("CPF: "+ getCpf());
	}
}
