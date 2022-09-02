package crud;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.UsuarioDAO;
import model.Usuario;

public class UsuarioCrud {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
		UsuarioDAO pessoaDAO = new UsuarioDAO();
		
		Scanner input = new Scanner(System.in);
		
	
		int opcao = 0;
		int posicao = 0;
		
		int id = 0;
		String nome = "";
		
		
		List<Usuario> pessoas = new ArrayList<Usuario>();
		
		//MENU
		do {
			System.out.println("--- CRUD Usuario ---");
			System.out.println("1 - Cadastro de usuario");
			System.out.println("2 - Consulta de usuario");
			System.out.println("3 - Delete de usuario");
			System.out.println("4 - Atualizar usuario");
			System.out.println("0 - Sair");
			
			opcao = input.nextInt();
			
			
			switch (opcao) { 
			case 1: 
				//CREATE
				System.out.println("**Cadastrar Usuario**");
				System.out.println("Digite o nome: ");
				nome = input.nextLine();
				nome = input.nextLine();
				
				Usuario pessoa = new Usuario();
				
				pessoa.setNome_usuario(nome);
				
				pessoaDAO.save(pessoa);
				
				System.out.println("\n***Cadastrado**\n");
				break;
			case 2:
				//READ
				
				for (Usuario a : pessoaDAO.getUsuario()) { 
					System.out.println("Id: " + a.getId_usuario() + "Nome: " 
				+ a.getNome_usuario());
				}
				
				System.out.println("*Consulta Finalizada*");
				break;
			case 3:
				//DELETE
				System.out.println("Passe o ID para exclusÃ£o: ");
				posicao = input.nextInt();
				
				
				pessoaDAO.deleteById(posicao);
				System.out.println("*Usuário excluído*");
				break;
			case 4: 
				//UPDATE
				System.out.println("Digite o id do usuário: ");
				id = input.nextInt();
				System.out.println("Digite o novo nome do usuário: ");
				nome = input.nextLine();
				nome = input.nextLine();
				
				Usuario autor1 = new Usuario(id, nome);
				pessoaDAO.update(autor1);
				break;
			default:
				System.out.println(opcao != 0 ? "\n OpÃ§Ã£o Ã© invÃ¡lida, " + "tente novamente.\n" : "");
				break;
			}
		} while (opcao != 0);
		input.close();
		System.out.println("*Finalizado*");
		
	}
}