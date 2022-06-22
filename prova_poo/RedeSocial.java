package prova_poo;

import java.util.ArrayList;

public class RedeSocial {

	private String dataCriacao;
	private String nomeUsuario;
	private String dataNascimento;
	private String senha;

	public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
		super();
		this.dataCriacao = dataCriacao;
		this.nomeUsuario = nomeUsuario;
		this.dataNascimento = dataNascimento;
		this.senha = senha;
	}
	
	ArrayList<Publicacao>publicacoes = new ArrayList<>();

	public String getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public ArrayList<Publicacao> getPublicacoes() {
		return publicacoes;
	}

	public void setPublicacoes(ArrayList<Publicacao> publicacoes) {
		this.publicacoes = publicacoes;
	}
	
	public void inserePublicacao(Publicacao publi) {
		publicacoes.add(publi);
	}
	public void imprimePublicacoes() {
		System.out.println(Publicacao.getContadorPublicacao());
		
		for(int i=0; i<publicacoes.size(); i++){  
		     System.out.println("Texto da publica��o: "+publicacoes.get(i).getTextoPublicacao() +"   "+ "Data da publica��o: "+ publicacoes.get(i).getDataPublicacao() +"   "+ "Link da publica��o: "+publicacoes.get(i).getLinkMidia());  
		}
	}
}
