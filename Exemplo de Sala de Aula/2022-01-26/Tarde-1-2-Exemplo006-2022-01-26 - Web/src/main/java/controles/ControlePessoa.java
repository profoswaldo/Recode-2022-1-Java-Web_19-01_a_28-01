package controles;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.DAOPessoa;
import modelos.Pessoa;

/**
 * Servlet implementation class ControlePessoa
 */
@WebServlet("/pessoas")
public class ControlePessoa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlePessoa() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		DAOPessoa daoPessoa = new DAOPessoa();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setCpf(Integer.parseInt(request.getParameter("txtCpf")));
		pessoa.setNome(request.getParameter("txtNome"));
		
		daoPessoa.incluir(pessoa);
		
		
		request.setAttribute("p", pessoa);
		RequestDispatcher despacho = request.getRequestDispatcher("inclusaoPessoa.jsp");
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
