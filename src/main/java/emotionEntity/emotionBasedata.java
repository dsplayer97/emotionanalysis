package emotionEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class emotionBasedata {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer emotiondataid;


    @Column
    private String keyword_1;
    @Column
    private String keyword_2;
    @Column
    private String keyword_3;
    @Column
    private String keyword_4;
    @Column
    private String keyword_5;
    @Column
    private String keyword_6;
    @Column
    private String keyword_7;
    @Column
    private String keyword_8;
    @Column
    private String keyword_9;
    @Column
    private String keyword_10;
    @Column
    private String keyword_11;
    @Column
    private String keyword_12;
    @Column
    private String keyword_13;
    @Column
    private String keyword_14;
    @Column
    private String keyword_15;
    @Column
    private String keyword_16;
    @Column
    private String keyword_17;
    @Column
    private String keyword_18;
    @Column
    private String keyword_19;
    @Column
    private String keyword_20;
    @Column
    private String emotion_value;

    public emotionBasedata(){}

    public Integer getEmotiondataid() {
        return emotiondataid;
    }

    public String getKeyword_1() {
        return keyword_1;
    }

    public String getKeyword_2() {
        return keyword_2;
    }

    public String getKeyword_3() {
        return keyword_3;
    }

    public String getKeyword_4() {
        return keyword_4;
    }

    public String getKeyword_5() {
        return keyword_5;
    }

    public String getKeyword_6() {
        return keyword_6;
    }

    public String getKeyword_7() {
        return keyword_7;
    }

    public String getKeyword_8() {
        return keyword_8;
    }

    public String getKeyword_9() {
        return keyword_9;
    }

    public String getKeyword_10() {
        return keyword_10;
    }

    public String getKeyword_11() {
        return keyword_11;
    }

    public String getKeyword_12() {
        return keyword_12;
    }

    public String getKeyword_13() {
        return keyword_13;
    }

    public String getKeyword_14() {
        return keyword_14;
    }

    public String getKeyword_15() {
        return keyword_15;
    }

    public String getKeyword_16() {
        return keyword_16;
    }

    public String getKeyword_17() {
        return keyword_17;
    }

    public String getKeyword_18() {
        return keyword_18;
    }

    public String getKeyword_19() {
        return keyword_19;
    }

    public String getKeyword_20() {
        return keyword_20;
    }

    public String getEmotion_value() {
        return emotion_value;
    }

    public void setEmotiondataid(Integer emotiondataid) {
        this.emotiondataid = emotiondataid;
    }

    public void setKeyword_1(String keyword_1) {
        this.keyword_1 = keyword_1;
    }


    public void setKeyword_2(String keyword_2) {
        this.keyword_2 = keyword_2;
    }

    public void setKeyword_3(String keyword_3) {
        this.keyword_3 = keyword_3;
    }

    public void setKeyword_4(String keyword_4) {
        this.keyword_4 = keyword_4;
    }

    public void setKeyword_5(String keyword_5) {
        this.keyword_5 = keyword_5;
    }

    public void setKeyword_6(String keyword_6) {
        this.keyword_6 = keyword_6;
    }

    public void setKeyword_7(String keyword_7) {
        this.keyword_7 = keyword_7;
    }

    public void setKeyword_8(String keyword_8) {
        this.keyword_8 = keyword_8;
    }

    public void setKeyword_9(String keyword_9) {
        this.keyword_9 = keyword_9;
    }

    public void setKeyword_10(String keyword_10) {
        this.keyword_10 = keyword_10;
    }

    public void setKeyword_11(String keyword_11) {
        this.keyword_11 = keyword_11;
    }

    public void setKeyword_12(String keyword_12) {
        this.keyword_12 = keyword_12;
    }

    public void setKeyword_13(String keyword_13) {
        this.keyword_13 = keyword_13;
    }

    public void setKeyword_14(String keyword_14) {
        this.keyword_14 = keyword_14;
    }

    public void setKeyword_15(String keyword_15) {
        this.keyword_15 = keyword_15;
    }

    public void setKeyword_16(String keyword_16) {
        this.keyword_16 = keyword_16;
    }

    public void setKeyword_17(String keyword_17) {
        this.keyword_17 = keyword_17;
    }

    public void setKeyword_18(String keyword_18) {
        this.keyword_18 = keyword_18;
    }

    public void setKeyword_19(String keyword_19) {
        this.keyword_19 = keyword_19;
    }

    public void setKeyword_20(String keyword_20) {
        this.keyword_20 = keyword_20;
    }

    public void setEmotion_value(String emotion_value) {
        this.emotion_value = emotion_value;
    }
}
