package controller;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Rectangulo;

@WebServlet("/ServletController")
public class ServletController extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        //1. Procesamos parametros
        String action = request.getParameter("action");

        //2. Creamos los JavaBeans
        Rectangulo recRequest = new Rectangulo(2, 3);
        Rectangulo recSession = new Rectangulo(4, 3);
        Rectangulo recApplication = new Rectangulo(8, 3);

        //3. Agregamos el JavaBeans a algun alcance
        
            //revisamos la accion proporcionada
        if ("addVars".equals(action)) {
            //Alcance Request
            request.setAttribute("rectanguloRequest", recRequest);
            
            //Alcance Session
            HttpSession session = request.getSession();
            session.setAttribute("rectanguloSession", recSession);

            //Alcance Applicaction
            ServletContext application = this.getServletContext();
            application.setAttribute("rectanguloApplication", recApplication);

            //agregamos un mensaje
            request.setAttribute("message", "The vars has been add");

            //4. Redireccionamos a la vista seleccionada
            request.getRequestDispatcher("index.jsp").forward(request, response);

        } else if ("listVars".equals(action)) {

            //4. Redireccionamos a la vista seleccionada
            request.getRequestDispatcher("WEB-INF/scopeVar.jsp").forward(request, response);
        } else {
            
            //4. Redireccionamos a la vista seleccionada
            request.setAttribute("message", "Unknown or not pushed action");
            request.getRequestDispatcher("index.jsp").forward(request, response);

            //Esta linea no propaga información entre JSPs
            //response.sendRedirect("index.jsp");
        }



    }
    
}
