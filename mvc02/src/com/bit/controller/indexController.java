package com.bit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/index.bit")
public class indexController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// view
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp"); // mvc2 모델에서는 jsp를 직접 받아오지 않고 컨트롤러를 통해 받는다
		rd.forward(request, response);
	}

}
