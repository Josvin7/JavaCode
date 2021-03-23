import java.io.IOException;
import java.util.Scanner;
import java.util.UUID;

/**
 * @ClassName Main
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/03/18/20:17
 */
public class Main {

    /*dict:停词:我想,的,得,从,去
dict:目的地:三亚,北京,上海
dict:出发地:南京,苏州
dict:出游类型:跟团游,自由行
dict:供应商:携程自营
dict:节假日:春节
query:​我想春节从南京去三亚和海口潜水跟团游5天5钻携程自营*/
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String[] strings = new String[1024];
        int num = 0;
        while (in.hasNext()) {
            strings[num] = in.nextLine();
            if (strings[num].startsWith("query")) {
                break;
            }
            num++;
        }
        Helper(num+1,strings);
    }

    private static void Helper(int num, String[] strings) {
        String[] aimStr = new String[num - 1];
        String query = strings[num - 1];
        for (int i = 0; i < num-1; i++) {
            String[] strings1 = strings[i].split(":");
            aimStr[i] = strings1[1];
            String[] strings2 = strings1[2].split(",");
            for (int j = 0; j < strings2.length; j++) {
                if (query.contains(strings2[j])) {
                    System.out.println(strings2[j]+":["+aimStr[i] +"]");
                }
            }

        }
        UUID.fromString("asd");


    }


}
