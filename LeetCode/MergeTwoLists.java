 class ListNode{
    int data;
    ListNode next = null;
    ListNode(int data){
        this.data = data;
    }

}
 class MergeTwoLists {
    public static ListNode mergeTwoLists(ListNode l1,ListNode l2){
        ListNode newHead = new ListNode(-1);//构建辅助头节点
        ListNode tmp = newHead;
        while (l1 != null && l2!= null){
            if (l1.data < l2.data){
                tmp.next = l1;
                tmp = tmp.next;
                l1 = l1.next;
            }else {
                tmp.next = l2;
                tmp = tmp.next;
                l2 = l2.next;
            }
        }
        if (l1 != null){
            tmp.next = l1;
        }
        if (l2 != null){
            tmp.next = l2;
        }
        return newHead.next;
    }
}
