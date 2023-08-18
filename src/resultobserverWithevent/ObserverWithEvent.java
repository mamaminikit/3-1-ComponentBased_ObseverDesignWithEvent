/* Kitthanya Teachanontkullawat (Mine) 64050027
 * Use EventObject of Java */
package resultobserverWithevent;
import java.util.Scanner;

/*
 * @author mmmaimankarae
 */
public class ObserverWithEvent {

    public static void main(String[] args) {
        final String red = "\u001B[31m";
        int count = 0;
        String input = "Start";
        Scanner scan = new Scanner(System.in);
        ScoreSource score = new ScoreSource();
        Subscriber s1 = new Subscriber();
        Subscriber s2 = new Subscriber();
        
        score.addObserver(s1);
        score.addObserver(s2);
        
        while (!(input.equals(""))) {
            System.out.print("Enter score: ");
            input = scan.nextLine();
            if (!(input.equals(""))) {
                score.setScoreLine(input);
                count++;
                /* ตัวอย่าง หากมีคนถอนลงทะเบียน */
                if (count == 1) {
                    score.removeObserver(s2);
                }
            } else {
                System.out.println("\n" + red
                        + "\'New match was updated already\'\n");
            }
        }
    }
    
}
