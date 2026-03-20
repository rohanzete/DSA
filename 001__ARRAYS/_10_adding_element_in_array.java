// Input: N = 5, array[] = {1,2,3,4,5}
// insertbeginning(6)
// insertending(7)
// insertatpos(8,4)
// Output: 6,1,2,8,3,4,5,7
//Explanation: 6 is added at the beginning and 7 is added at the end and 8 is added at position 4.

// Input: N = 5, array[] = {1,2,3,4,5}
// insertbeginning(2)
// insertending(4)
// insertatpos(8,4)
// Output: 2,1,2,8,3,4,5,4
//Explanation: 2 is added at the beginning and 4 is added at the end and 8 is added at position 4.

import java.util.*;

public class _10_adding_element_in_array {
    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list);
        // Input: N = 5, array[] = {1,2,3,4,5}
        // insertbeginning(6)
        // insertending(7)
        // insertatpos(8,4)
        // Output: 6,1,2,8,3,4,5,7

        // insert at begining
        list.add(0, 6);

        //insert at particular index i.e  // insertatpos(8,4)
        int pos=4;
        list.add(pos-1,8);

        //insert at end
        list.add(7);

        System.out.println(list);

    }
}
