package controles.alunos;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.persistencia.DAOAluno;
import modelo.pessoal.Aluno;

/**
 * Servlet implementation class ControleAluno
 */
@WebServlet("/meus.alunos")
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

		RequestDispatcher despacho = null;
		
		try {
		
			
		DAOAluno daoAluno = new DAOAluno();
		
		Aluno aluno = new Aluno();
		aluno.setId(Integer.parseInt(request.getParameter("txtId")));
		aluno.setMatricula(request.getParameter("txtMatricula"));
		aluno.setNome(request.getParameter("txtNome"));
		aluno.setTeste(Double.parseDouble(request.getParameter("txtTeste")));
		aluno.setProva(Double.parseDouble(request.getParameter("txtProva")));

		daoAluno.incluir(aluno);
		
		despacho = request.getRequestDispatcher("saidaInclusao.jsp");
		despacho.forward(request, response);
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
