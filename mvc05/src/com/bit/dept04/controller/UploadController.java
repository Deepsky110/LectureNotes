package com.bit.dept04.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/upload.bit")
public class UploadController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("upload.jsp").forward(req, resp);
	}
	
	// C:\webWorkspace\.metadata\.plugins\
	//		org.eclipse.wst.server.core\tmp0\wtpwebapps\mvc05\
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// upload file max size
		int fsize=1*1024*1024; //1024 = 1kb, 1024*1024 = 1mb
		// upload file path
		String path=req.getRealPath("./up");
		// upload file rename FileRenamePolicy
		DefaultFileRenamePolicy frp = null;
		frp = new DefaultFileRenamePolicy();
		// 파일명 중복시 file1.img, file2.img 처럼 바꿔줌
		
		MultipartRequest mpReq = null;
		mpReq = new MultipartRequest(req, path, fsize, "utf-8", frp );
//		System.out.println(mpReq.getParameter("sabun"));
		req.setAttribute("rename", mpReq.getFilesystemName("file1")); // 바뀐 이름
		req.setAttribute("origin", mpReq.getOriginalFileName("file1")); // 원래 이름
		
		req.getRequestDispatcher("download.jsp").forward(req, resp);
	}
}
