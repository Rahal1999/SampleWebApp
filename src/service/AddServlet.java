package service;

import core.DBMongo;
import core.DBMysql;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("id");
        String title = request.getParameter("title");
        String price = request.getParameter("price");

        System.out.println(" Book id is"+id+"\n title is: "+title+" \n price is:"+price);



        PrintWriter writer = response.getWriter();
      //  writer.println("<h1>Hello " + yourName + "</h1>");
        DBMysql o = new DBMysql();
        o.add(id,title,price);
        DBMongo obj = new DBMongo();
        obj.add(id,title,price);
        writer.close();
    }



}