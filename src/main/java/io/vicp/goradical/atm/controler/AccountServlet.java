package io.vicp.goradical.atm.controler;

import io.vicp.goradical.atm.dao.AccountDao;
import io.vicp.goradical.atm.dao.DaoManager;
import io.vicp.goradical.atm.dao.RecordDao;
import io.vicp.goradical.atm.service.AccountService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

@WebServlet(name = "accountServlet", urlPatterns = "/account")
public class AccountServlet extends HttpServlet {
	private AccountService accountService = new AccountService(DaoManager.getDao(AccountDao.class), DaoManager.getDao(RecordDao.class));

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


	private void saveMoneyPrepare(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException {
		request.setAttribute("dataPage", "/atm/save-money.jsp");
		request.getRequestDispatcher("/atm/main-page.jsp").forward(request, response);
	}

	private void saveMoney(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException {
		double amount = Double.valueOf(request.getParameter("amount"));
		int accountId = Integer.valueOf(request.getParameter("account_id"));
		int result = accountService.saveMoney(accountId, amount);
		if (result == 1) {
			request.setAttribute("message", "存款成功！");
		}
		request.setAttribute("dataPage", "/atm/save-money.jsp");
		request.getRequestDispatcher("/atm/main-page.jsp").forward(request, response);
	}

	private void drawMoneyPrepare(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException {
		request.setAttribute("dataPage", "/atm/draw-money.jsp");
		request.getRequestDispatcher("/atm/main-page.jsp").forward(request, response);
	}

	private void drawMoney(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException {
		double amount = Double.valueOf(request.getParameter("amount"));
		int accountId = Integer.valueOf(request.getParameter("account_id"));
		int result = accountService.drawMoney(accountId, amount);
		if (result == 1) {
			request.setAttribute("message", "取款成功！");
		} else {
			request.setAttribute("message", "余额不足！");
		}
		request.setAttribute("dataPage", "/atm/draw-money.jsp");
		request.getRequestDispatcher("/atm/main-page.jsp").forward(request, response);
	}
}
