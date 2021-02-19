package entity;

import java.util.Date;

/**
 * @ClassName Music
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/18/22:30
 */
public class Music {
    private int id;
    private String title;
    private String singer;
    private Date time;
    private String url;
    private int userid;

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSinger() {
        return singer;
    }

    public Date getTime() {
        return time;
    }

    public String getUrl() {
        return url;
    }

    public int getUserid() {
        return userid;
    }

    @Override
    public String toString() {
        return "Music{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", singer='" + singer + '\'' +
                ", time=" + time +
                ", url='" + url + '\'' +
                ", userid=" + userid +
                '}';
    }
}
