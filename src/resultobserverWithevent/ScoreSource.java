/* Kitthanya Teachanontkullawat (Mine) 64050027
 * Use EventObject of Java */
package resultobserverWithevent;

import java.util.ArrayList;

/*
 * @author mmmaimankarae
 */
public class ScoreSource {
    /* ไว้เก็บชื่อคนลงทะเบียน */
    ArrayList<ScoreListener> obsev;
    
    public ScoreSource() {
        obsev = new ArrayList<>();
    }
    
    /* ลงทะเบียน */
    public void addObserver(ScoreListener obj) {
        obsev.add(obj);
    }
    
    /* ถอนการลงทะเบียน */
    public void removeObserver(ScoreListener obj) {
        obsev.remove(obj);
    }
    
    /* รับผลล่าสุด */
    public void setScoreLine(String value) {
        fireHeadQuaterEvent(new ScoreEvent(this, value));
    }
    
    /* แจ้งการอัปเดทผลให้ผู้ลงทะเบียน */
    public void fireHeadQuaterEvent(ScoreEvent evt) {
        for (ScoreListener observer : obsev){
            observer.scoreChange(evt);
        }
    }
}
