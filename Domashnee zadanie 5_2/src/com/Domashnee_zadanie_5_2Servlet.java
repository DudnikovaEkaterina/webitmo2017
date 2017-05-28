package com;
import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Domashnee_zadanie_5_2Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html;charset=UTF-8");
		String tourname = req.getParameter("tourname");
		String tourage = req.getParameter("tourage");
		String tourzagran = req.getParameter("tourzagran");
		String tourdengi = req.getParameter("tourdengi");
		String tranname = req.getParameter("tranname");
		String maxras = req.getParameter("maxras");
		String trandengi = req.getParameter("trandengi");
		String gorodname = req.getParameter("gorodname");
		String strana = req.getParameter("strana");
		String gorodras = req.getParameter("gorodras");
		int age = Integer.parseInt(tourage);
		int dengi = Integer.parseInt(tourdengi);
		int tranras = Integer.parseInt(maxras);
		int transt = Integer.parseInt(trandengi);
		int gorodr = Integer.parseInt(gorodras);
		
		Tourist T = new Tourist();
		T.init(tourname, age, tourzagran, dengi);
		Goroda G = new Goroda();
		G.init(gorodname, strana, gorodr);
		Transport Tr = new Transport();
		Tr.init(tranname, tranras, transt);
		resp.getWriter().println(T.poedet(G, Tr));
		
		
	}
}
