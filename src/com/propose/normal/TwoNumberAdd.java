package com.propose.normal;

/**
 * @author js_liuyangchao@163.com
 * @create 2018-03-27 14:29
 * @desc 给定两个非空链表来代表两个非负数，位数按照逆序方式存储，
 * 它们的每个节点只存储单个数字。将这两数相加会返回一个新的链表。
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * 状态：
 **/
class TwoNumberAdd {

    class ListNode {

        int val;
        ListNode next;

        ListNode(){

        }

        ListNode(int val){
            this.val = val;
        }

        int getVal() {
            return val;
        }

        void setVal(int val) {
            this.val = val;
        }

        ListNode getNext() {
            return next;
        }

        void setNext(ListNode next) {
            this.next = next;
        }
    }

    TwoNumberAdd.ListNode addTwoNumbers(TwoNumberAdd.ListNode l1, TwoNumberAdd.ListNode l2) {
        TwoNumberAdd.ListNode resultNode = new TwoNumberAdd.ListNode();
        test(resultNode, l1, l2);
        return resultNode;
    }

    void test(TwoNumberAdd.ListNode resultNode, TwoNumberAdd.ListNode l1, TwoNumberAdd.ListNode l2){
        String val = l1.getVal()+l2.getVal()+"";
        String lastNum = (val+"").substring(val.length()-1);
        if(l1.getNext() != null){
            resultNode.setNext(new TwoNumberAdd.ListNode(Integer.parseInt(lastNum)));
            test(resultNode, l1.getNext(), l2.getNext());
        }else{
            resultNode.setVal(Integer.parseInt(lastNum));
        }
    }

    int currentPosition = 0;

    int[] addTwoNumbers(int[] l1, int[] l2) {
        int length = l1.length;
        int[] resultArray = new int[length];
        int[] resultNode = new int[l1.length];
        for(int i=length-1; i>=0; i--){
            String val = l1[i] + l2[i]+"";
            String lastEle = val.substring(val.length()-1);
            resultArray[length-i-1] = Integer.parseInt(lastEle);
        }
        return resultArray;
    }

    //已通过代码
//    void test(ListNode resultNode, ListNode l1, ListNode l2, int addNumber){
//        if(l1 != null && l2 != null){
//            String val = l1.val+l2.val+addNumber+"";
//            String lastNum = (val+"").substring(val.length()-1);
//            if(val.length() == 2){
//                addNumber = 1;
//            }else{
//                addNumber = 0;
//            }
//
//            ListNode node = new ListNode(Integer.parseInt(lastNum));
//            resultNode.next = node;
//
//            if(l1.next != null && l2.next != null){
//                test(node, l1.next, l2.next, addNumber);
//            }else if(l1.next == null && l2.next != null){
//                test(node, new ListNode(0), l2.next, addNumber);
//            }else if(l1.next != null && l2.next == null){
//                test(node, l1.next, new ListNode(0), addNumber);
//            }else{
//                if(addNumber == 1){
//                    node.next = new ListNode(1);
//                }
//            }
//        }
//    }
//
//    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode resultNode = new ListNode(-1);
//        test(resultNode, l1, l2, 0);
//        return resultNode.next;
//    }


}
