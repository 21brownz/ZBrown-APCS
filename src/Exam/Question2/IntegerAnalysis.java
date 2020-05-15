package Exam.Question2;

public class IntegerAnalysis {
    /**
     * Returns an int from simulated user input
     */
    public static int getInt(){
        return (int)((Math.random()*1000)+1);
    }

    public static double analyzeInts(int max, int n){
        int metcriteria = 0;
        for (int i = 0; i < n; i++) {
            int got = getInt();
            if((got > 0) && (got < max) && (got % 3 == 0)){
                metcriteria++;
            }
        }
        return metcriteria / n; //this is a little frowned upon because it is integer division in a double context (based on the behavior of the JVM this reduces operational accuracy),
                                // but I figure using more complicated methods of doing this simple operation are not necessary, as extreme accuracy is not within the scope of this problem.
    }

    /*
    Part B:
    all that has to be done is change the statement in the above method "(got % 3 == 0)" to "(got % divint == 0)"
    where divint is an integer that defines what the divisibility should be. If divint is changed within the analyzeInts method,
    it can be declared at the top of the method. If it is to be modified outside the method, it should be declared at the top of the class as "private int divint;"
    and assigned a value within the constructor either with a constructor parameter (i.e. Public IntegerAnalysis(int divint){this.divint=divint})
    or with explicit definition (i.e. Public IntegerAnalysis(){divint = 3}).
    */

}
