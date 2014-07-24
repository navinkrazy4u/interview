package navin.anand;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mortbay.log.Log;
//AA
public class Controller extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static String INTERVIEW_JSP = "/interview.jsp";
	private static String DATAQUERY_JSP = "/dataquery.jsp";
	private static String DATALOAD_JSP = "/dataload.jsp";

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward = "";
		Log.info("in controller");
		// Get a map of the request parameters
		Map parameters = request.getParameterMap();
		if (parameters.containsKey("dataquery")) {
			forward = DATAQUERY_JSP;
		} else if (parameters.containsKey("dataload")) {
			forward = DATALOAD_JSP;
		} else {
			forward = INTERVIEW_JSP;
		}
		RequestDispatcher view = request.getRequestDispatcher(forward);
		view.forward(request, response);
	}
}
