import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.SpringLayout;

import javafx.scene.control.TableColumn.SortType;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// [2,4,3]
// [5,6,4]
class Solution {

    public static int lengthOfLongestSubstring(String s) {
        int longestCount = 0;
        ArrayList<Character> tmpLst = new ArrayList<>();
        if (s.length() == 1) {
            return s.length();
        }

        for (int i = 0; i < s.length(); i++){
            if (tmpLst.indexOf(s.charAt(i)) != -1){
                tmpLst.subList(0, tmpLst.indexOf(s.charAt(i)) + 1).clear();
            }
            tmpLst.add(s.charAt(i));

            if (longestCount < tmpLst.size()){
                longestCount = tmpLst.size();
            }
        }
        return longestCount;
    }        


    public static void main(String[] args) {
        String test = "dvdf";
        // System.out.println("test");
        int a = lengthOfLongestSubstring(test);
        System.out.println(a);


    }


}