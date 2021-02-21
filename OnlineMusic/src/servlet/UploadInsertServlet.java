package servlet;

import dao.MusicDao;
import entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName UploadInsertServlet
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/21/20:11
 */
@WebServlet("/uploadsucess")
public class UploadInsertServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=utf-8");
        String strings = (String)req.getSession().getAttribute("fileName");
        String[] titles = strings.split("\\.");// 去掉.mp3
        String title = titles[0];
        System.out.println("title:" + title);
        String url = "music\\"+title;
        System.out.println("url："+url);
        String singer = req.getParameter("singer");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String time=sdf.format(new Date());
        MusicDao dao = new MusicDao();
        User user = (User) req.getSession().getAttribute("user");
        int user_id = user.getId();
        int num = dao.insert(title,singer,time,url,user_id);
        if(num!=0){
            resp.sendRedirect("list.html");
        }
    }
}