package dao;

import entity.Music;
import util.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MusicDao
 * @Description ：有关于音乐的数据库操作
 * @Author Josvin
 * @Date 2021/02/19/12:44
 */
public class MusicDao {
    /**
     * 查询全部歌单
     */
    public List<Music> findMusic(){
        List<Music> musics = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement("select*from music");
            rs = ps.executeQuery();
            // 查询结果不止一条
            while(rs.next()) {
                Music music = new Music();
                music.setId(rs.getInt("id"));
                music.setTitle(rs.getString("title"));
                music.setSinger(rs.getString("singer"));
                music.setTime(rs.getDate("time"));
                music.setUrl(rs.getString("url"));
                music.setUserid(rs.getInt("userid"));
                musics.add(music);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally {
            DBUtils.getClose(conn, ps, rs);
        }
        return musics;
    }

    /**
     * 根据id查找音乐
     * @param id
     * @return
     */
    public Music findMusicById(int id){
        Music music = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement("select * from music where id=?");
            ps.setInt(1,id);
            rs = ps.executeQuery();
            if(rs.next()) {
                music = new Music();
                music.setId(rs.getInt("id"));
                music.setTitle(rs.getString("title"));
                music.setSinger(rs.getString("singer"));
                music.setTime(rs.getDate("time"));
                music.setUrl(rs.getString("url"));
                music.setUserid(rs.getInt("userid"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally {
            DBUtils.getClose(conn, ps, rs);
        }
        return music;
    }


    /**
     * 根据关键字查询歌单
     */
    public List<Music> ifMusic(String str){
        List<Music> musics = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement("select*from music where title like '%"+str+"%'");
            rs = ps.executeQuery();
            while(rs.next()) {
                Music music = new Music();
                music.setId(rs.getInt("id"));
                music.setTitle(rs.getString("title"));
                music.setSinger(rs.getString("singer"));
                music.setTime(rs.getDate("time"));
                music.setUrl(rs.getString("url"));
                music.setUserid(rs.getInt("userid"));
                musics.add(music);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            DBUtils.getClose(conn, ps, rs);
        }
        return musics;
    }


    /**
     * 也可以直接传一个Music 对象
     * 上传音乐
     * 1、上传到服务器
     * 2、上传到数据库
     */
    public int Insert(String title, String singer, String time, String url, int userid) {
        Connection conn = DBUtils.getConnection();
        PreparedStatement pst=null;
        int number = 0;
        try {
            pst=conn.prepareStatement("insert into music(title,singer,time,url,userid) values(?,?,?,?,?)");
            pst.setString(1,title);
            pst.setString(2,singer);
            pst.setString(3,time);
            pst.setString(4,url);
            pst.setInt(5,userid);
            number = pst.executeUpdate();/// 更新数据库
            return number;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.getClose(conn, pst, null);
        }
        return 0;
    }

}
