package download;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/download.bit")
public class DownloadController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String filename = req.getParameter("file");
		String origin = req.getParameter("org");
		String path = req.getRealPath("up");
		java.io.File file = new File(path+"\\"+filename);
		System.out.println(file.exists());
		// 처리 못하는 type 설정하면 브라우저에 출력 못하고 다운로드함
		resp.setContentType("application/octet-stream");
		// Header("Content-Disposition:attachment; filenmae=파일이름);
		// 추가로 파일의 원래 이름으로 다운로드 되도록 설정
		resp.setHeader("Content-Disposition", "attachment; filename="+origin);
		OutputStream out = resp.getOutputStream();
		if(file.exists()){
			FileInputStream fis = new FileInputStream(file);
			int cnt = -1;
			while((cnt=fis.read())!=-1){
				out.write(cnt);
			}
			out.flush();
		}
	}
}
