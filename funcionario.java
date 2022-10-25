package lista5;
//Questão23
public class funcionario extends usuario {
	public funcionario(String nome,String senha){
		super(nome,senha);
	}
	private static float totalVendido = 0;
	
	public void Venda(String NomeProduto,float preco,cliente clt1) {
		System.out.println("\n"+getNome()+" vendeu o produto "+NomeProduto+" por RS"+preco);
		System.out.println("Dados do cliente:");
		clt1.DadosGerais();
		this.totalVendido = this.totalVendido+preco;
	}
	
	public float getTotalVendido(){
		return this.totalVendido;
	}
}
