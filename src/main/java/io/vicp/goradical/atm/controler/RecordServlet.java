package io.vicp.goradical.atm.controler;

import io.vicp.goradical.atm.dao.ActionTypeDao;
import io.vicp.goradical.atm.dao.DaoManager;
import io.vicp.goradical.atm.dao.RecordDao;
import io.vicp.goradical.atm.entity.Record;
import io.vicp.goradical.atm.service.RecordService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

@WebServlet(name = "recordServlet", urlPatterns = "/record")
public class RecordServlet extends HttpServlet {
	private RecordService recordService = new RecordService(DaoManager.getDao(RecordDao.class));

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

	private void getRecordList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int accountId = Integer.parseInt(request.getParameter("account_id"));
		int pageNum = Integer.parseInt(request.getParameter("page_num"));
		List<Record> recordList = recordService.getRecordListWithAccountId(accountId, pageNum, 10);
		int recordCount = recordService.getRecordCountWithAccountId(accountId);
		Map<Integer, String> actionTypeMap = ActionTypeDao.getActionTypeMap();
		request.setAttribute("recordList", recordList);
		request.setAttribute("actionTypeMap", actionTypeMap);
		request.setAttribute("accountId", accountId);
		request.setAttribute("pageNum", pageNum);
		request.setAttribute("recordCount", recordCount);
		request.setAttribute("dataPage", "/atm/record.jsp");
		request.getRequestDispatcher("/atm/main-page.jsp").forward(request, response);
	}
}
