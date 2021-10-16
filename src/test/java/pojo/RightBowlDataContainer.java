package pojo;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class RightBowlDataContainer {

    private String right0;
    private String right1;
    private String right2;
    private String right3;

    public RightBowlDataContainer() {
    }

    public RightBowlDataContainer(String right0, String right1, String right2, String right3) {
        this.right0 = right0;
        this.right1 = right1;
        this.right2 = right2;
        this.right3 = right3;
    }

    public String getRight0() {
        return right0;
    }

    public void setRight0(String right0) {
        this.right0 = right0;
    }

    public String getRight1() {
        return right1;
    }

    public void setRight1(String right1) {
        this.right1 = right1;
    }

    public String getRight2() {
        return right2;
    }

    public void setRight2(String right2) {
        this.right2 = right2;
    }

    public String getRight3() {
        return right3;
    }

    public void setRight3(String right3) {
        this.right3 = right3;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("right0", right0)
                .append("right1", right1)
                .append("right2", right2)
                .append("right3", right3)
                .toString();
    }
}
