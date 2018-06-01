package emotionEntity;

import javax.persistence.*;

@Entity
public class wordBase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer wordid;

    @Column
    private String keyword;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
