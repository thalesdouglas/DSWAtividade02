//Thales Douglas de Souza 4º TADSB - NOTURNO
package Servlet;

import Classe.Produto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author thales.dsouza
 */
@WebServlet(name = "Entrada", urlPatterns = {"/Entrada"})
public class Entrada extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Produto> produtosTemp = new ArrayList();
        List<Produto> listaProdutos = new ArrayList();

        Produto p1 = new Produto();
        p1.setNome("Smartphone Motorola z2 play");
        p1.setPreco(1850.00);
        p1.setDescricao("Celular Intermediario Premium com 64gb de armazenamento Interno e 4gb de ram");
        produtosTemp.add(p1);

        Produto p2 = new Produto();
        p2.setNome("Smartphone Samsung S8 Edge");
        p2.setPreco(3500.00);
        p2.setDescricao("Celular Premium com 64gb de armazenamento interno e 6gb de ram");
        produtosTemp.add(p2);

        Produto p3 = new Produto();
        p3.setNome("Smart TV LED 50" + '"' + " Philips");
        p3.setPreco(5550.00);
        p3.setDescricao("Televisão Full HD 4K com conexão wi-fi e Netflix e Youtube integrado");
        produtosTemp.add(p3);

        Produto p4 = new Produto();
        p4.setNome("Suporte de parede para TV ");
        p4.setPreco(119.60);
        p4.setDescricao("Suporte para Tvs LCD/LED/PLASMA/3D de 15" + '"' + "a 32" + '"' + " poledadas");
        produtosTemp.add(p4);

        Produto p5 = new Produto();
        p5.setNome("Suporte de celular para carro");
        p5.setPreco(42.90);
        p5.setDescricao("Suporte Universal De Smartphone No Parabrisa Do Carro");
        produtosTemp.add(p5);
        int c = 1;
        for(int i = 0; i < 4; i++) {
            for(Produto pro : produtosTemp) {
                Produto p = new Produto();
                p.setId(c);
                p.setNome(pro.getNome());
                p.setPreco(pro.getPreco());
                p.setDescricao(pro.getDescricao());
                listaProdutos.add(p);
                c++;
            }
        }
        
        request.setAttribute("produtos", listaProdutos);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/home.jsp");
        dispatcher.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
