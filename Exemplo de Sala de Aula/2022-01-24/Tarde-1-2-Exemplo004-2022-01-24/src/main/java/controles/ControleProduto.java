package controles;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.DAOProduto;
import modelos.Produto;

/**
 * Servlet implementation class ControleProduto
 */
@WebServlet("/produtos")
public class ControleProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleProduto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAOProduto dao = new DAOProduto();
		Produto produto = new Produto();
		produto.setCodigo(request.getParameter("txtCodigo"));
		
		produto = dao.consultar(produto);
		
		request.setAttribute("prod", produto);
		RequestDispatcher despacho = request.getRequestDispatcher("consultaProduto.jsp");
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
