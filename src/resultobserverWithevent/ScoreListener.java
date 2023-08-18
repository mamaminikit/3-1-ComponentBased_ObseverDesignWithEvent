/* Kitthanya Teachanontkullawat (Mine) 64050027
 * Use EventObject of Java */
package resultobserverWithevent;

import java.util.EventListener;

/*
 * @author mmmaimankarae
 */
public interface ScoreListener extends EventListener {
    /* Interface Listener */
    public void scoreChange(ScoreEvent evt);
}
