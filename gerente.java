package lista5;
//Questão23
public class gerente extends funcionario{
	gerente(String nome, String senha){
		super(nome,senha);
	}
	float total = getTotalVendido();
	public void fechamentoCaixa() {
		System.out.print("\n\nGerente: " + this.getNome());
		System.out.print("\n\nFechamento do caixa\n Valor total R$: " + this.total);
	}
}
