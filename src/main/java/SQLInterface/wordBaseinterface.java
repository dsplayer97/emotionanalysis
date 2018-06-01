package SQLInterface;

import emotionEntity.emotionBasedata;
import emotionEntity.wordBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface wordBaseinterface extends JpaRepository<wordBase,Long> {

    public List<wordBase> findBykeyword(String keyword);

//    public List<User> findByUphoneAndUpassword(String uphone,String upassword);

}
