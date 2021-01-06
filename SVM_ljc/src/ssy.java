
import java.io.File;

/**
 *
 * @author 陆钇成
 *
 *程序设计目的：读取FilePath中的所有的.class文件  转移到FilePath的一个子目录（.class里面）实现源代码与类分离
 *
 *相当于移动文件
 */
public class ssy {
    private String FilePath="D:\\Java\\test";			//文件的原路径
    private String DesPath="D:\\Java\\test\\class";		//文件目标路径
    private String fileleixin=".class";					//文件类型
    //构造器
    public ssy() {}
    //getter setter方法
    public void setFilePath(String FilePath) {
        this.FilePath=FilePath;
    }
    public String getDesPath() {
        return DesPath;
    }
    public void setDesPath(String desPath) {
        DesPath = desPath;
    }
    public String getFileleixin() {
        return fileleixin;
    }
    public void setFileleixin(String fileleixin) {
        this.fileleixin = fileleixin;
    }
    public String getFilePath() {
        return this.FilePath;
    }
    //具体实现的方法
    public String YiDong()  {
        File f1=new File(this.FilePath);
        File f2=new File(this.DesPath);
        if(f1.exists()) {
            //如果目的路径不存在，就创建一个
            if(!f2.exists()) {
                f2.mkdirs();
            }
//			s1数组存放的是源文件夹中所有的文件名称
            //s2数组放的是目标文件所有文件的名称
            String [] s1=f1.list();
            String [] s2=f2.list();
            int count=0;
            for(int x=0;x<s1.length;x++) {
                int foot=s1[x].length();
                int front=foot-6;
                if(front>0) {
                    if(this.fileleixin.equals(s1[x].substring(front, foot))) {

                        for(int y=0;y<s2.length;y++)
                        {
                            if(s1[x].equals(s2[y]))
                                System.out.println(this.DesPath+s2[y]+"已更新："+new File(this.DesPath+"\\"+s2[y]).delete());

                        }
                        new File(this.FilePath+"\\"+s1[x]).renameTo(new File(this.DesPath+"\\"+s1[x]));
//				System.out.println(s1[x].length());		打印.class文件的文件名字符数
                        count++;
                    }
                }
            }

            return  "文件转移成功\n"+this.FilePath+"目录下的"+this.getFileleixin()+"文件已经转移到"+this.getDesPath()+"\n一共转移文件"+count+"个";

        }
        else
            return "对不起"+this.FilePath+"文件目录不存在！";
    }
    public static void main(String [] args) {
        ssy z1=new ssy();
        System.out.println(z1.YiDong());


    }

}


