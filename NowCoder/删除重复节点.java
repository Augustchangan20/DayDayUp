public class 删除重复节点 {
        public ListNode deleteDuplication(ListNode pHead){
            if(pHead == null && pHead.next == null){
                return pHead;
            }
            ListNode newHead = new ListNode(-1);
            //构建辅助头节点
            ListNode cur = pHead;
            ListNode tmp = newHead;
            while(cur != null){
                if(cur.next != null && cur.data == cur.next.data){
                    while(cur.next != null && cur.data == cur.next.data){
                        //跳过值与当前结点相同的全部结点,找到第一个与当前结点不同的结点
                        cur = cur.next;
                    }
                    cur = cur.next;
                }else{
                    tmp.next = cur;//tmp连接新结点
                    tmp = tmp.next;
                    cur = cur.next;
                }
            }
            tmp.next = null;
            return newHead.next;
            //返回时去掉自己创建的辅助接点
        }
}

