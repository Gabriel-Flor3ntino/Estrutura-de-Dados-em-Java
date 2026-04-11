package br.com.estruturadados.main;

import java.util.Scanner;

import br.com.estruturadados.listasligadas.ListaDuplamenteLigada;
import br.com.estruturadados.listasligadas.ListaLigada;
import br.com.estruturadados.modelos.Pessoa;
import br.com.estruturadados.pilha.Pilha;
import br.com.estruturadados.vetores.Vetor;

public class Main {

	public static void main(String[] args) {
		IO.println("Digite a opção desejado");
		IO.println("1. Gerenciamento de memória");
		IO.println("2. Vetores");
		IO.println("3. Lista ligada");
		IO.println("4. Lista duplamente ligada");
		IO.println("5. Pilha");

		Scanner sc = new Scanner(System.in);
		int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			fazerGerenciamentoMemoria();
			break;
		case 2:
			fazerVetor();
			break;
		case 3:
			fazerListaLigada();
			break;
		case 4:
			fazerListaDuplamenteLigada();
			break;
		case 5:
			fazerPilha();
			break;	
		} 
		
		sc.close();
	}
	
	private static void fazerPilha() {
		Pilha<Pessoa> pilhaPessoas = new Pilha<Pessoa>();
		IO.println(pilhaPessoas.estaVazia());
		pilhaPessoas.empilhar(new Pessoa(1, "Gabriel 1"));
		pilhaPessoas.empilhar(new Pessoa(2, "Gabriel 2"));
		pilhaPessoas.empilhar(new Pessoa(3, "Gabriel 3"));
		Pessoa p1 = pilhaPessoas.desempilhar();
		IO.println(p1.toString());

	}

	private static void fazerListaDuplamenteLigada() {
		ListaDuplamenteLigada<Pessoa> listaPessoas = new ListaDuplamenteLigada<Pessoa>();
		listaPessoas.inserir(new Pessoa(1, "Gabriel 1"));
		listaPessoas.inserir(new Pessoa(2, "Gabriel 2"));
		listaPessoas.inserir(new Pessoa(3, "Gabriel 3"));
		listaPessoas.inserirEm(1, new Pessoa(4, "Gabriel 4"));
		listaPessoas.inserirPrimeiro(new Pessoa(5, "Gabriel 5"));
		listaPessoas.inserirUltimo(new Pessoa(6, "Gabriel 6"));
		IO.println(listaPessoas.toString());
		Pessoa p = listaPessoas.recuperar(1);
		Pessoa pessoaErrada =  new Pessoa(100, "Gabriel 100");
		IO.println(listaPessoas.contem(p));
		IO.println(listaPessoas.contem(pessoaErrada));
		IO.println(listaPessoas.indice(p));
		IO.println(listaPessoas.indice(pessoaErrada));
		listaPessoas.remover(p);
		IO.println(listaPessoas.toString());
		listaPessoas.remover(0);
		IO.println(listaPessoas.toString());
		IO.println("Lista de pessoas");
		for (int i = 0; i < listaPessoas.tamanho(); i++) {
			IO.println(listaPessoas.recuperar(i).toString());
		}
	}

	public static void fazerListaLigada() {
		ListaLigada<Pessoa> listaPessoas = new ListaLigada<Pessoa>();
		listaPessoas.inserir(new Pessoa(1, "Gabriel 1"));
		listaPessoas.inserir(new Pessoa(2, "Gabriel 2"));
		listaPessoas.inserir(new Pessoa(3, "Gabriel 3"));
		listaPessoas.inserirEm(1, new Pessoa(4, "Gabriel 4"));
		listaPessoas.inserirPrimeiro(new Pessoa(5, "Gabriel 5"));
		listaPessoas.inserirUltimo(new Pessoa(6, "Gabriel 6"));
		IO.println(listaPessoas.toString());
		Pessoa p = listaPessoas.recuperar(1);
		Pessoa pessoaErrada =  new Pessoa(100, "Gabriel 100");
		IO.println(listaPessoas.contem(p));
		IO.println(listaPessoas.contem(pessoaErrada));
		IO.println(listaPessoas.indice(p));
		IO.println(listaPessoas.indice(pessoaErrada));
		listaPessoas.remover(p);
		IO.println(listaPessoas.toString());
		listaPessoas.remover(0);
		IO.println(listaPessoas.toString());
		IO.println("Lista de pessoas");
		for (int i = 0; i < listaPessoas.tamanho(); i++) {
			IO.println(listaPessoas.recuperar(i).toString());
		}
		
	}
	
	private static void fazerGerenciamentoMemoria() {
		int a = 3;
		IO.println(a);
		int b = a;
		IO.println(b);
		b = 2;
		IO.println("----------------");
		IO.println(a);
		IO.println(b);
		IO.println(a == b);
		IO.println("**********************");
		Pessoa p1 = new Pessoa(1, "TreinaWeb");
		IO.println(p1.toString());
		Pessoa p2 = new Pessoa(1, "TreinaWeb");
		IO.println(p2.toString());
		IO.println("----------------");
//		p2.setNome("TreinaWeb Modificado");
		IO.println(p1.toString());
		IO.println(p2.toString());
		IO.println(p1.equals(p2));
	}
	
	public static void fazerVetor() {
		// indice comeca com 0
		//Vetor vetorPessoas = new Vetor(3);
		
		Vetor<Pessoa> vetorPessoas = new Vetor<Pessoa>();
		//vetorPessoas.inserirEm(0, new Pessoa(1, "Gabriel"));
		//IO.println(vetorPessoas.recuperar(0).getNome());
		
		vetorPessoas.inserir(new Pessoa(1, "Gabriel 1"));
		vetorPessoas.inserir(new Pessoa(2, "Gabriel 2"));
		vetorPessoas.inserir(new Pessoa(3, "Gabriel 3"));
		vetorPessoas.inserir(new Pessoa(4, "Gabriel 4"));
		vetorPessoas.inserirEm(1, new Pessoa(5, "Gabriel 5"));
		IO.println(vetorPessoas);
		IO.println("Lista de pessoas: ");
		
		for (int i = 0; i < vetorPessoas.tamanho(); i++) {
			IO.println(vetorPessoas.recuperar(i).getNome());
		}
		Pessoa p = vetorPessoas.recuperar(1);
		Pessoa pessoaErrada = new Pessoa(100,"Wannessa");
		IO.println(vetorPessoas.contem(p));
		IO.println(vetorPessoas.contem(pessoaErrada));
		IO.println(vetorPessoas.indice(p));
		IO.println(vetorPessoas.indice(pessoaErrada));
		vetorPessoas.remover(2);
		IO.println(vetorPessoas.toString());
		vetorPessoas.remover(p);
		IO.println(vetorPessoas.toString());

	}

}
