import java.util.LinkedList;
import java.util.List;

/**
 * Created by shendongdong on 2016/7/2.
 */
public class GetGift {
    // 奖品仓库
    private List<Gift> gifts = new LinkedList<Gift>();
    // 奖品序号
    private int number = 1;

    private GetGift() {
        // 生成一堆奖品放进奖品仓库
        // 一等奖10个，优先级1；二等奖30个，优先级2；。。。
        GiftType gt = null;
        gt = new GiftType(100, 10, 1);
        addGift(gt);
        gt = new GiftType(50, 30, 2);
        addGift(gt);
        gt = new GiftType(20, 100, 3);
        addGift(gt);
        gt = new GiftType(10, 400, 4);
        addGift(gt);
        gt = new GiftType(5, 1000, 5);
        addGift(gt);
        gt = new GiftType(3, 2000, 6);
        addGift(gt);
        gt = new GiftType(2, 6460, 7);
        addGift(gt);
    }

    private static final GetGift single = new GetGift();

    // 静态工厂方法
    public static GetGift getInstance() {
        return single;
    }

    // 抽奖
    public synchronized Gift getGift() {
        int randomNumber = (int) (Math.random() * total());
        int priority = 0;
        for (Gift g : gifts) {
            priority += g.getType().getPriority();
            if (priority >= randomNumber) {
                // 从奖品库移出奖品
                gifts.remove(g);
                return g;
            }
        }
        // 抽奖次数多于奖品时，没有奖品
        return null;
    }

    // 计算总优先级，内部使用
    private int total() {
        int result = 0;
        for (Gift g : gifts) {
            result += g.getType().getPriority();
        }
        return result;
    }

    // 向奖品池添加指定类型奖品
    private void addGift(GiftType gt) {
        for (int i = 1; i <= gt.getQuantity(); i++) {
            gifts.add(new Gift(number++, gt));
        }
    }
}
