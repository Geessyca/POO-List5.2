package lista5;
//Questão23
public class Main {
	public static void main(String[] args) {	
		cliente clt1 = new cliente("Gessyca","111",142);
		cliente clt2 = new cliente("Quezia","222",444);
		cliente clt3 = new cliente("Eyshila","333",666);
		
		funcionario fun1 = new funcionario("Moreira1","123");		
		fun1.Venda("Batata", 10,clt1);
		funcionario fun2 = new funcionario("Moreira2","123");		
		fun2.Venda("carne", 20,clt2);
		funcionario fun3 = new funcionario("Moreira3","123");		
		fun1.Venda("sorvete", 30,clt3);
		
		
		gerente gr1 = new gerente("Gerente","123456");
		gr1.fechamentoCaixa();
	}

}
