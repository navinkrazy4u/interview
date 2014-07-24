package navin.anand;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class InterviewWSServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println(req.toString());
		resp.getWriter().println(req.getParameterMap());
		resp.getWriter().println("Hello, world2");
		resp.getWriter().println("Hello, world");
		resp.getWriter().println("Hello, world");
	}
}
