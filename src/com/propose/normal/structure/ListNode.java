package com.propose.normal.structure;

/**
 * @author js_liuyangchao@163.com
 * @create 2018-03-27 14:32
 * @desc
 **/
public class ListNode {

    int val;
    ListNode next;

    public ListNode(){

    }

    public ListNode(int val){
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
