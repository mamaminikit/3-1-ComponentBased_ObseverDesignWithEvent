/* Kitthanya Teachanontkullawat (Mine) 64050027
 * Use EventObject of Java */
package resultobserverWithevent;

import java.util.EventObject;

/*
 * @author mmmaimankarae
 */
public class ScoreEvent extends EventObject {
    private String scoreLine;
    
    /* method สำหรับผู้ต้องการทราบผลล่าสุด */
    public String getScoreLine() {
        return scoreLine;
    }

    /* เก็บผลคะแนนล่าสุด */
    public ScoreEvent(Object source, String value) {
        super(source);
        scoreLine = value;
    }
}
