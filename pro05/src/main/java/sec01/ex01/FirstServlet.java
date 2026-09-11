package sec01.ex01;
//충돌연습 
import java.io.IOException;
import java.io.PrintWriter;
//야르 ㅎㅎ
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destory() 호출됩니다. 1회만 실행됩니다.");
		
	}
	
	

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service() 메소드 호출");
	}



	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init()호출 FirstServlet클래스 객체 메모리 톰캣 서버 메모리에 처음 올라가서 실행됩니다.");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet() 요청되었습니다. 클라이언트의 get요청으로 실행됩니다. service() 다음 실행됩니다.");
		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter writer =resp.getWriter();
		try {
			writer.println("<html>");
			writer.println("<body>");
			writer.println("HttpServletResponse객체에 응답할데이터를 담아 톰캣이 클라이언트에게 전송합니다.");
			writer.println("</body>");
			writer.println("</html>");
		} catch (Exception e) {
			if (writer != null) {
				writer.close();
            }
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	
	
}


// 야르 ㅎㅎ





