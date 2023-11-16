package AvaliaçãoAtv5;


public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Gisele");
		System.out.println("Funcionario:");
		System.out.println("Nome: " + pessoa.getNome());
		
		Fisica fisica = new Fisica("Gisele", "1234", "5678");
		System.out.println("\nFisica:");
		System.out.println("Nome: " + fisica.getNome());
		System.out.println("Cpf: " + fisica.getCpf());
		System.out.println("Rg: " + fisica.getRg());
	

	}

}
