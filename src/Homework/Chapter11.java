package Homework;

import java.util.ArrayList;
import java.util.Collections;

public class Chapter11 {
    /*
    1.
        A. True
        B. True
        C. False
        D. True
        E. True
    2.

     */
    // 4) What is the output from the following code?
    public void questionFour(){
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(0);
        lst.add(1);
        lst.add(2);
        lst.add(0,0);
        lst.add(1,1);
        lst.add(2,2);
        System.out.println(lst);
    }
    /*
    5) Write and test a method that takes an ArrayList<String> and returns a new ArrayList<String>
       in which the elements are stored in reverse order. The original list should remain unchanged.
       (Use ArrayList's methods but no other library methods.)
     */
    public ArrayList<String> reverseArray(ArrayList<String> lst){
        ArrayList<String> reverse = new ArrayList<>();
        for(int i = lst.size() - 1; i >= 0; i--) {
            reverse.add(lst.get(i));
        }
        return reverse;
    }
    /*
    6) Write and test a method that removes the smallest value from an ArrayList<Integer>.
    HINT: Integer has a method compareTo(Integer other) that returns a positive integer if this is greater than other,
    a negative integer if this is less than other, and 0 if this is equal to other.
     */
    public ArrayList<Integer> removeSmallest(ArrayList<Integer> lst){
        ArrayList<Integer> clone = (ArrayList<Integer>) lst.clone();
        Collections.sort(clone);
        lst.remove(clone.get(0));
        return lst;
    }

    /*
    7) Write and test a method that removes from list1 all objects that are also in list2.
    Your method should compare the objects using the == operator, not equals.
    HINT: the contains and indexOf methods cannot be used.
    */
    public ArrayList<Object> compareAndRemove(ArrayList<Object> list1, ArrayList<Object> list2){
        for (int i = 0; i <list1.size(); i++) {
            for (int j = 0; j <list2.size(); j++) {
                if (list1.get(i) == list2.get(j)){
                    list1.remove(i);
                }
            }
        }
        return list1;
    }

    /*
    8) Can an ArrayList be its own element? Test this hypothesis.
     */
    public void ohNo(){
            ArrayList<Object> al = new ArrayList<>();
            al.add("test");
            al.add(al);
        for (Object o : al) {
            if (al.equals(o)) {
                System.out.println("Uh Oh Boolean!");
            }
        }
    }

    /*
    10) Fill in the blanks in the method removeConsecutiveDuplicates, which removes consecutive duplicate values from an ArrayList of strings.
    For example, if letters contains ["A", "A", "A", "B", "C", "C", "A", "A"],
    after a call to removeConsecutiveDuplicates(letters), letters should contain ["A", "B", "C", "A"].
     */
    public ArrayList<String> removeConsecutiveDuplicates(ArrayList<String> lst){
        ArrayList<String> sublist = new ArrayList<>();
        sublist.add(lst.get(0));
        for(int i = 1; i < lst.size(); i++) {
            if(!lst.get(i - 1).equals(lst.get(i))) {
                sublist.add(lst.get(i));
            }
        }
        return sublist;
    }

    public static void main(String[] args) {
        Chapter11 chapter11 = new Chapter11();
        chapter11.questionFour();
    }
}
