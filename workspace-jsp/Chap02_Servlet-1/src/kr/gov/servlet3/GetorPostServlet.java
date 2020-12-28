package kr.gov.servlet3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GetorPost")
public class GetorPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public GetorPostServlet() {
        super();
    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet메서드 호출됨");
		response.setContentType("text/html; charset=utf-8");
		
		// 출력스트림 획득
		PrintWriter writer = response.getWriter();
		
		writer.print("안녕하세요");
		writer.println("<html>");
		writer.println("<head>");
		writer.println("</head>");		
		writer.print("<body>");
		writer.print("<h1>doGet 방식 입니다. 반갑습니다.</h1>");
		writer.print("</body>");
		writer.println("</html>");		
		writer.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost메서드 호출됨");
		response.setContentType("text/html; charset=utf-8");
		
		// 출력스트림 획득
		PrintWriter writer = response.getWriter();
		
		writer.print("안녕하세요");
		writer.println("<html>");
		writer.println("<head>");
		writer.println("</head>");		
		writer.print("<body>");
		writer.print("<h1>doPost 방식 입니다. 반갑습니다.</h1>");
		writer.print("</body>");
		writer.println("</html>");
		writer.close();
	}

}
