import java.util.UUID;

/**
 * @ClassName Test
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/03/19/11:02
 */
public class Test {

    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);
        System.out.println(uuid.toString().replace("-",""));
    }
}
