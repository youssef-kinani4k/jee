

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class bonjour
 */
@WebServlet("/bonjour")
public class bonjour extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public bonjour() {
        // TODO Auto-generated constructor stub
    	//super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter p=response.getWriter();
		p.print("Bonjour Servlet");
		p.print("<br/>");
		p.print("<br/>");
		p.print("<table border=1>");
		for(int i=0;i<10;i++) {
			p.print("<tr>");
			for(int j=0;j<3;j++) {
				p.print("<td>ligne "+j+" colone "+i+"</td>");
		}
			p.print("</tr>");
	}
		p.print("</table>");
		p.print("<br/>");
		p.print("date courant :");
		Date t=new Date();
		p.print(t.toString());
		p.print("<h3> Etudiants et moyennes</h3>");
		p.println("<table border=1>"+"<tr> <th>nom</th><th>Moyenne</th> </tr");
		for(int i=1;i<=10;i++) {
			p.println("<tr> <td>nom"+i+"</td><td>"+Math.random()*20+"</td> </tr");
		}
		p.println("</table>");
		}
	
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
