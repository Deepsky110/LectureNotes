package com.bit.dept.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.dept.model.Dept04Dao;

@WebServlet("/dept/detail.bit")
public class DetailController extends HttpServlet {
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      int deptno=Integer.parseInt(request.getParameter("idx"));
      try {
         Dept04Dao dao=new Dept04Dao();
         request.setAttribute("bean", dao.selectOne(deptno));
         
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      request.getRequestDispatcher("/detail.jsp").forward(request, response);
   }
   
   @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	   req.setCharacterEncoding("utf-8");
	   int deptno = Integer.parseInt(req.getParameter("deptno"));
	   String dname = req.getParameter("dname").trim();
	   String loc = req.getParameter("loc").trim();
	   try {
		Dept04Dao dao = new Dept04Dao();
		dao.updateOne(deptno, dname, loc);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	   
	   resp.sendRedirect("list.bit");
	}

}