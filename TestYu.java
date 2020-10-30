/**
 * Created with Intellij IFEA
 * Description:
 * User : 花朝
 * Date : 2020-10-25
 * Time : 12:19
 */
class  ListNode{
    int val ;
    ListNode next ;
    public ListNode (int val ){
        this.val = val ;
     }
}
public class TestYu {
    ListNode head;
    //头插法；
    public void addFirst(int val){
        ListNode node = new ListNode(val);
            node.next = this.head;
            this.head = node ;
    }
    // 打印链表；
    public void display(){
        ListNode cur = this.head;
        while (cur != null){
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    //打印反转链表；
    public void display2( ListNode newHead){
        ListNode cur = newHead;
        while (cur != null){
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    //尾插法
    public  void addLast(int val){
        ListNode node = new ListNode(val);
        if (this.head == null){
            addFirst(val);
        }
        ListNode cur = this.head;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = node;
    }
    //打印链表长度；
    public int size(){
        int count = 0;
        ListNode cur = this.head;
        while (cur != null){
            count ++ ;
            cur = cur.next;
        }
        return count ;
    }
    //任意位置插入
    public void addIndex(int index ,int val){
        if (this.head == null){
            return;
        }
        if (index == 0){
            addFirst(val);
        }
        ListNode node = new ListNode(val);
        ListNode cur = find(index);
        node .next = cur.next;
        cur.next = node;
    }
    //  寻找插入位置；
    public ListNode find(int index){
        if (index < 0 || index > size()){
            return  null;
        }
        int count = 0;
        ListNode cur = this.head;
        while (count < index -1){
            cur = cur.next;
            count ++ ;
        }
        return  cur;
    }
    //寻找是否包含关键字key；
    public boolean research(int key){
        ListNode cur = this.head;
        while (cur != null){
            if (cur.val == key){
                return true;
            }
            cur= cur.next;
        }
        return false;
    }
    //删除关键字key；
    public void remove(int key){
        if (this.head == null){
            return ;
        }
        if (this.head.val == key){
            this.head = this.head.next;
            return;
        }
        ListNode cur = find2(key);
        if (cur == null){
            return;
        }
        ListNode abc= cur.next;
        cur.next = abc.next;

    }
    //寻找key的前驱
    public ListNode find2(int key){
        ListNode cur = this.head;
        while (cur.next != null){
            if (cur.next.val == key){
                return cur;
            }else {
                cur = cur.next;
            }
        }
        return  null;
    }
    //寻找中点；
    public  ListNode midListNode(){
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return  slow;
    }
    //删除所有的key值；
    public ListNode removeAll(int key){
        ListNode cur = this.head;
        ListNode perv = this.head.next;
        while (cur.next != null){
            if (perv.val == key){
                cur.next = perv.next;
            }else{
                cur = perv;
            }
            perv = perv.next;
        }
        if (this.head.val == key){
            this.head = this.head.next;
        }
        return this.head;
    }
    //反转链表；
    public ListNode reversell(){
        ListNode prev = null;
        ListNode cur = this.head;
        ListNode newHead = null;
        while (cur != null){
            ListNode curNext = cur.next;
            if (curNext == null){
                newHead = cur;
            }
            cur.next = prev ;
            prev = cur ;
            cur = curNext;
        }
        return newHead;
    }
    //找到倒数第k个节点；
    public ListNode  findKthToTail(int k){
        ListNode fast = this.head;
        while (k -1 > 0){
            fast = fast .next;
            k  -- ;
        }
        ListNode slow = this.head;
        while (fast != null && fast.next != null){
            fast  = fast.next;
            slow = slow.next;
        }
        return  slow;
    }
    //小于k的放到前面去，顺序不变；
    public ListNode  partiton(int k ){
        if (this.head == null) {
            return  null;
        }
        ListNode as = null;
        ListNode ae = null;
        ListNode bs = null;
        ListNode be = null;
        ListNode cur = this.head;
        while (cur != null){
            if (cur.val < k){
               if (bs == null){
                   bs = cur;
                   be = cur;
               }else {
                   be.next = cur;
                   be = be.next;
               }
            }else{
                if (as == null){
                    as = cur;
                    ae = cur;
                }else {
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }
        if(be == null || ae == null){
            return this.head;
        }else {
            be.next = as;
            ae.next = null;
            return bs;
        }
    }
    //删除全部重复节点
    public ListNode deletDuplication(){
        ListNode cur = this.head;
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        while (cur != null){
            if (cur.next != null && cur.val == cur.next.val){
                while (cur.next != null && cur.val == cur.next.val){
                    cur = cur.next;
                }
                cur = cur.next;
            }else {
                tmp.next = cur;
                cur = cur.next;
                tmp = tmp.next;
            }
        }
        tmp.next = null;
        return this.head;
    }
    //判断是否回文
    public  boolean chkPalindrome(){
        if (this.head == null){
            return  false;
        }
        if (this.head.next == null){
            return true;
        }
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (fast != null&& fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode cur = slow.next;
        while (cur != null){
            ListNode curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        while (this.head != slow){
            if (this.head.val != slow.val){
                return  false;
            }
            if (this.head.next == slow){
                return  true;
            }
            this.head = this.head.next;
            slow = slow.next;
        }
        return true;
    }
    //判断有无环
    public boolean hasCycle(){
        ListNode fast = this.head ;
        ListNode slow = this.head;
        while (fast!= null&& fast.next !=null){
            fast= fast.next.next;
            slow= slow.next;
            if (fast == slow){
                break;
            }
        }
        if(fast == null || fast.next == null){
            return  false;
        }
            return true;
    }
    // 判断有无环，有的话找出节点；
    public ListNode deletectCycle(){
        ListNode fast = this.head ;
        ListNode slow = this.head;
        while (fast!= null&& fast.next !=null){
            fast= fast.next.next;
            slow= slow.next;
            if (fast == slow){
                break;
            }
        }
        if(fast == null || fast.next == null){
            return  null;
        }
        slow = this.head;
        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    //合二为一;
    public  ListNode mergeTwoList(ListNode headA, ListNode headB){
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        while (headA != null && headB != null){
            if (headA.val < headB.val){
                tmp.next = headA;
                tmp = tmp.next;
                headA = headA .next;
            }else {
                tmp.next = headB;
                tmp = tmp.next;
                headB = headB .next;
            }
        }
        if (headA != null){
            tmp.next= headA;
        }else {
            tmp.next = headB;
        }
        return  newHead.next;
    }
    // 找到两个链表是否有公共节点；
    public ListNode getlnetersection(ListNode headA,ListNode headB){
        ListNode pl = headA;
        ListNode ps = headB;
        if (pl == null || ps ==null){
            return  null;
        }
        int lenA = 0;
        while (pl != null){
            lenA ++;
            pl = pl.next;
        }
        int lenB = 0;
        while (ps != null){
            lenB ++;
            ps = ps.next;
        }
        pl = headA;
        ps = headB;
        int len = lenA - lenB;
        if (len < 0){
            pl = headB;
            ps = headA;
            len = lenB - lenA;
        }
        for (int i = 0; i < len; i++) {
            pl =pl.next;
        }
        while (pl != ps &&pl != null && ps != null){
            pl = pl.next;
            ps = ps.next;
        }
        if (pl != null || ps !=null){
            return pl;
        }
       return null;
    }
    public static void main (String[] args){
        TestYu testYu = new TestYu();
        testYu.addFirst(4);
        testYu.addFirst(2);
        testYu.addFirst(7);
        testYu.addLast(1);
        testYu.addLast(8);
        testYu.addLast(6);
        testYu.display();
//        System.out.println(testYu.size());
//        testYu.addIndex(3,10);
//        testYu.addIndex(5,11);
//        testYu.display();
//        System.out.println(testYu.research(4));
//        System.out.println(testYu.research(34));
//        testYu.remove(6);
//        testYu.remove(9);
//        testYu.display();
//        ListNode ret = testYu.midListNode();
//        System.out.println(ret.val);
//        testYu.removeAll(3);
//        testYu.display();
//        ListNode ret2 = testYu.reversell();
//        testYu.display2(ret2);
//        ListNode ret3 = testYu.findKthToTail(4);
//        ListNode ret4 = testYu.findKthToTail(1);
//        System.out.println(ret3.val);
//        System.out.println(ret4.val);
    }


}
