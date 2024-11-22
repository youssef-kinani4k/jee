

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Servlet implementation class AffichageEtudiants
 */
@WebServlet("/AffichageEtudiants")
public class AffichageEtudiants extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AffichageEtudiants() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<Etudiant> listeEtudiant=new ArrayList<Etudiant>();
		listeEtudiant.add(new Etudiant("cin1","nom Etudiant 1",12.2,"E1.png"));
		listeEtudiant.add(new Etudiant("cin2","nom Etudiant 2",14,"E2.png"));
		listeEtudiant.add(new Etudiant("cin3","nom Etudiant 3",18,"E3.png"));
		listeEtudiant.add(new Etudiant("cin4","nom Etudiant 4",19,"E4.png"));
		listeEtudiant.add(new Etudiant("cin5","nom Etudiant 5",9,"E5.png"));
		response.setContentType("text/html");
		PrintWriter p = response.getWriter();
		p.print("<h1>liste des etudiant</h1>");
		for(int i=0;i<listeEtudiant.size();i++) {
			p.println("<h3>"+listeEtudiant.get(i).getNom()+" "+listeEtudiant.get(i).getCin()+" "+listeEtudiant.get(i).getMoyenne()+"</h3>");
		}
		p.print("<br />");
		p.print("<ul>");
		for(int i=0;i<listeEtudiant.size();i++) {
			p.println("<li>"+listeEtudiant.get(i).getNom()+" "+listeEtudiant.get(i).getCin()+" "+listeEtudiant.get(i).getMoyenne()+"</li>");
		}
		p.print("</ul>");
		p.print("<table border=1 style='width:100%;'>");
		p.print("<tr><th>Nom</th><th>CIN</th><th>Moyenne</th><th>Photo</th></tr>");
		for(int i=0;i<listeEtudiant.size();i++) {
			p.println("<tr style='background:"+(listeEtudiant.get(i).getMoyenne()<10 ?"red":"yellow")+ "'>"+"<td>"+listeEtudiant.get(i).getNom()+"</td>"+"<td>"+" "+listeEtudiant.get(i).getCin()+"</td>"+" "+"<td>"+listeEtudiant.get(i).getMoyenne()+"</td>"+"<td><img style='width:40px;height:40px;' src='/TP3/images/"+listeEtudiant.get(i).getImage()+"' /></td>"+"</tr>");
		}
		p.print("</table>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
