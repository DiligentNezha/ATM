package io.vicp.goradical.atm.controler;

import io.vicp.goradical.atm.dao.DaoManager;
import io.vicp.goradical.atm.dao.UserDao;
import io.vicp.goradical.atm.entity.User;
import io.vicp.goradical.atm.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Method;

@WebServlet(name = "userServlet", urlPatterns = "/user")
public class UserServlet extends HttpServlet {
	private UserService userService = new UserService(DaoManager.getDao(UserDao.class));

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		try {
			Method method = getClass().getDeclaredMethod(action, HttpServletRequest.class, HttpServletResponse.class);
			method.invoke(this, request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String identityCard = request.getParameter("id_card");
		String password = request.getParameter("password");
		User currentUser = userService.login(identityCard, password);
		HttpSession session = request.getSession();
		try {
			if (currentUser != null) {
				session.setAttribute("currentUser", currentUser);
				request.setAttribute("dataPage", "/atm/user-info.jsp");
				request.getRequestDispatcher("/atm/main-page.jsp").forward(request, response);
			} else {
				request.setAttribute("id_card", identityCard);
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		User currentUser = (User) session.getAttribute("currentUser");
		if (currentUser != null) {
			request.setAttribute("id_card", currentUser.getIdentityCard());
		}
		try {
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void showUserInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		User currentUser= (User) session.getAttribute("currentUser");
		try {
			if (currentUser != null) {
				session.setAttribute("currentUser", currentUser);
				request.setAttribute("dataPage", "/atm/user-info.jsp");
				request.getRequestDispatcher("/atm/main-page.jsp").forward(request, response);
			} else {
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
