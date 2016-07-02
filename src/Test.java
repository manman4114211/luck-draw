/**
 * Created by shendongdong on 2016/7/2.
 */
public class Test {
    public static void main(String[] args) {
        GetGift gg = GetGift.getInstance();
        for (int i = 0; i < 10; i++) {
            System.out.println(gg.getGift().getType().getFees() + "元话费");
        }
    }
}
