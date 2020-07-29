package com.bit.dept.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.dept.model.Dept04Dao;
import com.bit.dept.model.Dept04Dto;

@WebServlet("/dept/list.bit")
public class ListController extends HttpServlet {
	//리스트는 select니까 doGet만 오버라이딩
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Dept04Dao dao = new Dept04Dao();
			ArrayList<Dept04Dto> list = dao.selectAll();
			request.setAttribute("list", list); // list라는 이름으로 list 보내기
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("../list.jsp").forward(request, response);
	}

}
