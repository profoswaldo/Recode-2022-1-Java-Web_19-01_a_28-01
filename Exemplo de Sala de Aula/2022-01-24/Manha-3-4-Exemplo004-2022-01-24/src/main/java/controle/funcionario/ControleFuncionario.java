package controle.funcionario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.persistencia.DAOFuncionario;
import modelo.pessoal.Funcionario;

/**
 * Servlet implementation class ControleFuncionario
 */
@WebServlet("/funcionario.controle")
public class ControleFuncionario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleFuncionario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			DAOFuncionario daoFuncionario = new DAOFuncionario();
			Funcionario funcionario = new Funcionario();
			
			funcionario.setMatricula(request.getParameter("txtMatricula"));
			
			funcionario = daoFuncionario.consultar(funcionario);
			
			request.setAttribute("func", funcionario);
			RequestDispatcher despacho = request.getRequestDispatcher("consultaFuncionario.jsp");
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
