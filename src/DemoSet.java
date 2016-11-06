import com.sun.tools.javac.util.ArrayUtils;

import java.util.*;

/**
 * Created by icondor on 05/11/16.
 */
public class DemoSet {
    public static void main(String[] args) {


        Set<Integer> se = new HashSet<>();

        Random myNumbersMachine = new Random();

        int counter=0;
        while(se.size()<6) {
            counter++;
            int nr = myNumbersMachine.nextInt(49) + 1;
            se.add(nr);
        }

        System.out.println(se.size()+":"+counter);




    }
}
