package br.com.lead.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.lead.modelo.Filme;

@WebServlet("/filme")
public class FilmeServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Filme coringa = new Filme("Coringa", "Drama", 2019);
		Filme matrix = new Filme("Matrix", "Ação", 1999);
		Filme forrestGump = new Filme("Forrest Gump", "Drama", 1994);
		
		ArrayList<Filme> filmes = new ArrayList<Filme>();
		
		filmes.add(coringa);
		filmes.add(matrix);
		filmes.add(forrestGump);
		
		String genero = req.getParameter("genero");
		
		resp.setContentType("text/HTML");
		PrintWriter out = resp.getWriter();
		
		out.println("<h2>Lista de Filmes utilizando Servlets:</h2>");
        out.println("<ol>");
        
        filmes.stream().filter(filme -> filme.getGenero().toUpperCase().equals(genero.toUpperCase())).forEach(filme -> {
        	out.println(String.format("<li> Nome: %s", filme.getNome()));
        	out.println(String.format(" Genero: %s", filme.getGenero()));
        	out.println(String.format(" Ano: %s </li>", filme.getAno()));
        });
        out.close();
	}
}