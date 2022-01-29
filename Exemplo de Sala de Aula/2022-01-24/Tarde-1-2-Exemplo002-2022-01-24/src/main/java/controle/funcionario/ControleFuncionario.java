package controle.funcionario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.pessoal.Funcionario;
import modelos.pessoal.FuncionarioCLT;
import modelos.pessoal.FuncionarioCNPJ;

/**
 * Servlet implementation class ControleFuncionario
 */
@WebServlet("/funcionarios")
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

		Funcionario funcionario;
		
		String tipo = request.getParameter("rdbTipo");
		
		if(tipo.equals("CLT"))
			funcionario = new FuncionarioCLT();
		else
			funcionario = new FuncionarioCNPJ();
		
		funcionario.setMatricula(request.getParameter("txtMatricula"));
		funcionario.setNome(request.getParameter("txtNome"));
		funcionario.setSalarioBruto(Double.parseDouble(request.getParameter("txtSalarioBruto")));
		
		request.setAttribute("func", funcionario);
		
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
