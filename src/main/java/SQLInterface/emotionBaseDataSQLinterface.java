package SQLInterface;


import emotionEntity.emotionBasedata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface emotionBaseDataSQLinterface extends JpaRepository<emotionBasedata,Long> {

}
