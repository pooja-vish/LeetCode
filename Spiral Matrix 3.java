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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix = new int[m][n];
        for(int i = 0; i < m; i++){
            java.util.Arrays.fill(matrix[i],-1);
        }
        int left = 0, top = 0;
        int right = n -1,bottom =  m - 1;
        ListNode temp = head;
        while(top <= bottom && left <= right && temp != null){
            for(int i = left; i <= right && temp != null; i++){
                matrix[top][i] = temp.val;
                temp = temp.next;
            }
            top++;
            for(int i = top; i <= bottom && temp != null; i++){
                matrix[i][right] = temp.val;
                temp = temp.next;
            }
            right--;
            if(top <= bottom){
                for(int i = right; i >= left && temp != null; i--){
                    matrix[bottom][i] = temp.val;
                    temp = temp.next;
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top && temp != null; i--){
                    matrix[i][left] = temp.val;
                    temp = temp.next;
                }
                left++;
            }
        }

        return matrix;
    }
}