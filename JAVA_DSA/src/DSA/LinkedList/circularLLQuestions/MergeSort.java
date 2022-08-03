package DSA.LinkedList.circularLLQuestions;

public class MergeSort {

    //https://leetcode.com/problems/sort-list/
    public ListNOde sortList(ListNOde head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNOde mid = getmid(head);
        ListNOde left = sortList(head);
        ListNOde right = sortList(mid);
        return merge(left, right);
    }

    ListNOde merge(ListNOde list1, ListNOde list2) {
        ListNOde dummyHead = new ListNOde();
        ListNOde tail = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }

    ListNOde getmid(ListNOde head) {
        ListNOde midprev = null;
        while (head != null && head.next != null) {
            midprev = (midprev == null) ? head : midprev.next;
            head = head.next.next;

        }
        ListNOde mid = midprev.next;
        midprev.next = null;
        return mid;
    }
}

class ListNOde {
    int val;
    ListNOde next;
    public ListNOde() {

    }

    ListNOde(int x) {
        val = x;
        next = null;
    }
}
