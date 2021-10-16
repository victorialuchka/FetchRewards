package pojo;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class LeftBowlDataContainer {

    private String left0;
    private String left1;
    private String left2;
    private String left3;

    public LeftBowlDataContainer() {
    }

    public LeftBowlDataContainer(String left0, String left1, String left2, String left3) {
        this.left0 = left0;
        this.left1 = left1;
        this.left2 = left2;
        this.left3 = left3;
    }

    public String getLeft0() {
        return left0;
    }

    public void setLeft0(String left0) {
        this.left0 = left0;
    }

    public String getLeft1() {
        return left1;
    }

    public void setLeft1(String left1) {
        this.left1 = left1;
    }

    public String getLeft2() {
        return left2;
    }

    public void setLeft2(String left2) {
        this.left2 = left2;
    }

    public String getLeft3() {
        return left3;
    }

    public void setLeft3(String left3) {
        this.left3 = left3;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("left0", left0)
                .append("left1", left1)
                .append("left2", left2)
                .append("left3", left3)
                .toString();
    }
}
