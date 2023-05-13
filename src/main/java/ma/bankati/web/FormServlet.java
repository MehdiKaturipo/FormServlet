package ma.bankati.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "Form", urlPatterns = "/form")
public class FormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/plain");
        PrintWriter out = resp.getWriter();
        out.println("Nom : "+req.getParameter("nom"));
        out.println("Prenom : "+req.getParameter("prenom"));
        if (req.getParameter("sexe").equals("Homme"))
            out.println("Sexe : C'est un homme");
        else
            out.println("Sexe : C'est une femme");
        out.println("a écrit sur moi");
        out.println(req.getParameter("commentaire"));

    }
}
