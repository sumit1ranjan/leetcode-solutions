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
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev=head;
        ListNode curr=head.next;
        ArrayList<Integer> list= new ArrayList<>();
        int idx=1;
        while(curr.next!=null){
            boolean criticalpoint=false;
            if(prev.val>curr.val && curr.next.val>curr.val){
                criticalpoint=true;
            }
            if(prev.val<curr.val && curr.next.val<curr.val){
                criticalpoint=true;
            }
            if(criticalpoint){
                list.add(idx);
            }
            prev=curr;
            curr=curr.next;
            idx++;
        }
        if(list.size() < 2) {
            return new int[]{-1, -1};
        }
        int min=Integer.MAX_VALUE;
        for(int i=1; i<list.size(); i++){
            int diff=list.get(i)-list.get(i-1);
            min=Math.min(diff,min);
        }
        int max = list.get(list.size() - 1) - list.get(0);
        return new int[]{min,max};

    }
}