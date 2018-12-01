package br.usjt.ads.arqdes.model.service;

import java.io.IOException;
import java.util.ArrayList;

import br.usjt.ads.arqdes.model.dao.FilmeDAO;
import br.usjt.ads.arqdes.model.entity.Filme;

public class FilmeService {
	private FilmeDAO dao;
	
	public FilmeService() {
		dao = new FilmeDAO();
	}
	
	public Filme inserirFilme(Filme filme) throws IOException {
		int id = dao.inserirFilme(filme);
		filme.setId(id);
		return filme;
	}
	
	// Busca um filme pelo ID
	public Filme buscarFilme(int id) throws IOException{
		return dao.buscarFilme(id);
	}
	// Busca Todos os filmes
	public ArrayList<Filme> buscarFilmes() throws IOException
	{
		return dao.buscarFilmes();
	}
	// Atualiza um filmes
	public void atualizarFilme(Filme filme) throws IOException
	{
		dao.atualizarFilme(filme);
	}
	// Apaga um filme
	public void deletarFilme(int id) throws IOException
	{
		dao.deletarFilme(id);
	}

}
