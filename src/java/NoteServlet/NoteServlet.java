/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NoteServlet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.NoteBean;

/**
 *
 * @author 798125
 */
public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
// to read files

        String edit = request.getParameter("edit");

        if (edit != null) {

            BufferedReader br = new BufferedReader(new FileReader(new File(path)));
            String title = br.readLine();
            String content = br.readLine();

            NoteBean nb = new NoteBean(title, content);

            request.setAttribute("note", nb);

            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp")
                    .forward(request, response);

        }
        
        
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));

  String title = br.readLine();
  String content=br.readLine();
	 
   NoteBean nb=new NoteBean(title,content);
        
        
        
     
        
        request.setAttribute("note", nb);
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String path = getServletContext().getRealPath("/WEB-INF/note.txt");

        String title = request.getParameter("title");

        String content = request.getParameter("content");
        
        NoteBean nb=new NoteBean(title,content);
        
            request.setAttribute("note", nb);

       

        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, true)));

        pw.write(title);
        pw.write(content);
       
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request, response);

    }

}
