package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import dao.MusicDao;
import entity.Music;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @ClassName FindMusicServlet
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/20/20:27
 */
@WebServlet("/findMusic")
public class FindMusicServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        //resp.setContentType("application/json;charset=utf-8");
        resp.setContentType("text/html; charset=utf-8");
        System.out.println("测试查找函数");
        String str = req.getParameter("musicName");
        MusicDao dao = new MusicDao();
        List<Music> musics = null;
        if(str!=null) {
            musics = dao.ifMusic(str);//关键字查询
        }else {
            musics = dao.findMusic();
        }
        for (Music music : musics) {
            System.out.println(music.getUrl());
        }
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(resp.getWriter(),musics);
    }
}
