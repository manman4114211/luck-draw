/**
 * Created by shendongdong on 2016/7/2.
 */
public class Gift {
    // 每个奖品有唯一id，抽奖不会重复
    private int id;
    // 奖品所属的类型
    private GiftType type;

    public Gift(int id, GiftType type) {
        this.id = id;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Gift [id=" + id + ", type=" + type + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GiftType getType() {
        return type;
    }

    public void setType(GiftType type) {
        this.type = type;
    }
}
