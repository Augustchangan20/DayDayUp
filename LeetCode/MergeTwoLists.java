 class ListNode{
    int data;
    ListNode next = null;
    ListNode(int data){
        this.data = data;
    }

}
 class MergeTwoLists {
    public static ListNode mergeTwoLists(ListNode l1,ListNode l2){
        ListNode newHead = new ListNode(-1);//构建辅助头节点,输出的时候输出虚拟结点的下一个结点就OK
        ListNode tmp = newHead;
        while (l1 != null && l2!= null){//终止条件，有一方为空则终止
            if (l1.data < l2.data){//比较后，小的节点放前面
                tmp.next = l1;
                tmp = tmp.next;
                l1 = l1.next;
            }else {
                tmp.next = l2;
                tmp = tmp.next;
                l2 = l2.next;
            }
        }
        if (l1 != null){//有一方为空，虚拟节点直接连接非空链表
            tmp.next = l1;
        }
        if (l2 != null){
            tmp.next = l2;
        }
        return newHead.next;//返回虚拟节点的下一个节点
    }
}
