package lista5;
//Questão23
public class cliente extends usuario{
	private int cpf;
	private int a=0;
	public cliente(String nome,String senha,int cpf){
		super(nome,senha);
		this.cpf=cpf;
	}
	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public void DadosGerais(){
		System.out.println("Nome: "+ getNome());
		System.out.println("Senha: "+ getSenha());
		System.out.println("CPF: "+ getCpf());
	}
}
