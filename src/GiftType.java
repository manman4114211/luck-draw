/**
 * Created by shendongdong on 2016/7/2.
 */
public class GiftType {
    // 奖励话费：2、3、5、10、20、50、100
    private int fees;
    // 奖品的数量，数量越大越容易抽到
    private int quantity;
    // 奖品的优先级，最小为1，越大越容易抽到
    private int priority;

    public GiftType(int fees, int quantity, int priority) {
        this.fees = fees;
        this.quantity = quantity;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "GiftType [fees=" + fees + ", quantity=" + quantity
                + ", priority=" + priority + "]";
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
