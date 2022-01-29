package controle.aluno;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.negocio.Aluno;
import modelo.persistencia.DAOAluno;

/**
 * Servlet implementation class ControleAluno
 */
@WebServlet("/aluno.controle")
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
		
		DAOAluno banco = new DAOAluno();
		Aluno aluno = new Aluno();
		
		
		aluno.setMatricula(request.getParameter("txtMatricula"));
		
		aluno = banco.consultar(aluno);
		
		
		request.setAttribute("al", aluno);
		RequestDispatcher despacho = request.getRequestDispatcher("saida.jsp");
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
