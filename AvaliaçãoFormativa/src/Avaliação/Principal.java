package Avaliação;


public class Principal {

	public static void main(String[] args) {
			Usuario usuario = new Usuario(1, "Gisele", 1234,"S", "giselelima");
			System.out.println("Usuário:");
			System.out.println("Id: " + usuario.getId());
			System.out.println("Nome: " + usuario.getNome());
			System.out.println("Password: " + usuario.getPassword());
			System.out.println("Permissão: " + usuario.getPermissao());
			System.out.println("Usuario: " + usuario.getUsuario());

	}

}
