package ex07_Leetcode_practicesession;

import java.lang.classfile.components.ClassPrinter;

public class Lab43_MergerSorted {

    public ClassPrinter.ListNode mergeTwoLists(ClassPrinter.ListNode l1, ClassPrinter.ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        if(l1.val < l2.val){

            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
