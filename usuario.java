package lista5;
//Questão23
public class usuario {
	private String nome;
	private String senha;
	
	public usuario(String nome,String senha) {
		this.nome = nome;
		this.senha = senha;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getSenha() {
		return this.senha;
	}
	public void DadosGerais(){
		System.out.println("Nome: "+ getNome());
		System.out.println("Senha: "+ getSenha());
	}
}
