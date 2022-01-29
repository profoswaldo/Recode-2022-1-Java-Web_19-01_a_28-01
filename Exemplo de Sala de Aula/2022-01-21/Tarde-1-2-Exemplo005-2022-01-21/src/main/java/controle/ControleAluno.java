package controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Aluno;

/**
 * Servlet implementation class ControleAluno
 */
@WebServlet("/aluno")
public class ControleAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleAluno() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Aluno aluno = new Aluno();
		
		aluno.setMatricula(request.getParameter("txtMatricula"));
		aluno.setNome(request.getParameter("txtNome"));
		aluno.setTeste(Double.parseDouble(request.getParameter("txtTeste")));
		aluno.setProva(Double.parseDouble(request.getParameter("txtProva")));
		
		
		request.setAttribute("refAluno", aluno);
		
		RequestDispatcher despacho = request.getRequestDispatcher("resultado.jsp");
		despacho.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
