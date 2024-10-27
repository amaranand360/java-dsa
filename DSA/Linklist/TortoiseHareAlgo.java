//#LINLLIST MED PROBLEMS

public class TortoiseHareAlgo {
    // 1. Given the head of a singly linked list, return the middle node of the linked list.

    // class Solution {
    //     public ListNode middleNode(ListNode head) {
    //         ListNode slow = head;
    //         ListNode fast = head;
            
    //         while (fast != null && fast.next != null) {
    //             slow = slow.next;
    //             fast = fast.next.next;
    //         }
            
    //         return slow;
        
    //     }
    // }

    // 2. Given the head of a singly linked list, reverse the list, and return the reversed list.

    // class Solution {
    //     public ListNode reverseList(ListNode head) {
    //         if (head == null || head.next == null) {
    //             return head;
    //         }
            
    //         ListNode prev = null;
    //         ListNode current = head;
    //         while (current != null) {
    //             ListNode nextNode = current.next;
    //             current.next = prev;
    //             prev = current;
    //             current = nextNode;
    //         }
    //         return prev;
    //     }
    
    // }
   
    // Recurssion Approach
    // class Solution {
    //     public ListNode middleNode(ListNode head) {
    //         ListNode slow = head;
    //         ListNode fast = head;
            
    //         while (fast != null && fast.next != null) {
    //             slow = slow.next;
    //             fast = fast.next.next;
    //         }
            
    //         return slow;
        
    //     }
    // }

    // 3. Given the head of a singly  Linked List has Cycle.
    // public class Solution {
    //     public boolean hasCycle(ListNode head) {
    //         if (head == null || head.next == null) {
    //             return false;
    //         }
            
    //         ListNode slow = head;
    //         ListNode fast = head.next;
            
    //         while (slow != fast) {
    //             if (fast == null || fast.next == null) {
    //                 return false;
    //             }
    //             slow = slow.next;
    //             fast = fast.next.next;
    //         }
            
    //         return true;
            
    //     }
    // }

    // 4. Given the head of a singly linked list, return the starting node of the cycle. If there is no cycle, return null.
    // public class Solution {
    //     public ListNode detectCycle(ListNode head) {
    //         if (head == null || head.next == null) {
    //             return null;
    //         }
            
    //         ListNode slow = head;
    //         ListNode fast = head;
            
    //         while (fast != null && fast.next != null) {
    //             slow = slow.next;
    //             fast = fast.next.next;
    //             if (slow == fast) {
    //                 break;
    //             }
    //         }
            
    //         if (fast == null || fast.next == null) {
    //             return null;
    //         }
            
    //         slow = head;
    //         while (slow != fast) {
    //             slow = slow.next;
    //             fast = fast.next;
    //         }
            
    //         return slow;
    //     }
    // }

// 5.length of cycle
//     public class Solution {
//     public static int lengthOfLoop(Node head) {
//         if (head == null || head.next == null) {
//             return 0;
//         }
        
//         Node slow = head;
//         Node fast = head;
        
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//             if (slow == fast) {
//                 break;
//             }
//         }
        
//         if (slow != fast) {
//             return 0;
//         }

//         int count = 1;
//         Node temp = slow;
//         while (temp.next != slow) {
//             count++;
//             temp = temp.next;
//         }
        
//         return count;
//     }
// }

// 6.# Segregate even and odd nodes in LinkedList
// ListNode oddHead = new ListNode(-1), oddTail = oddHead;
// ListNode evenHead = new ListNode(-1), evenTail = evenHead;
// ListNode curr = head;
// boolean isodd = false;


// while(curr != null){
// ListNode temp = curr;
// curr = curr.next;
// temp.next = null;

// if (temp.val%2!=0) 
// {
//     oddTail.next = temp;
//     oddTail = temp;

// }
// else
// {
//     evenTail.next = temp;
//     evenTail = temp;
// }

// }
//  oddTail.next = evenHead.next;

//  return oddHead.next;
// }


// 7. Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
    // class Solution {
    //     public ListNode oddEvenList(ListNode head) {
    //         if (head == null || head.next == null) {
    //             return head; 
    //         }
            
    //         ListNode odd = head;           
    //         ListNode even = head.next;     
    //         ListNode evenHead = even;       
            
    //         while (even != null && even.next != null) {
    //             odd.next = even.next;       
    //             odd = odd.next;             
    //             even.next = odd.next;       
    //             even = even.next;           
    //         }
            
    //         odd.next = evenHead;  
            
    //         return head;  
    //     }
    
    // }

    // #8. Given the head of a singly linked list, sort the list using insertion sort, and return the sorted list.
    // class Solution {
    //     public ListNode sortList(ListNode head) {
    //         if (head == null || head.next == null) {
    //             return head; 
    //         }
    //         ListNode temp = head;
    
    //         while(temp != null){
    //             ListNode minNode = temp;
    //             ListNode current = temp.next;
    
    //             while(current != null){
    //                 if(current.val < minNode.val){
    //                     minNode = current;
    //                 }
    //                 current = current.next;
    //             }
    //             //swap
    //             int tempVal = temp.val;
    //             temp.val = minNode.val;
    //             minNode.val = tempVal;
    //             // Move temp to the next node
    //             temp = temp.next;
    //         }
    //     return head;
    //     }
    // }


//#Remove Nth Node From End of List

// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         if (head == null || n <= 0) {
//             return head;
//         }
//         if (head.next == null && n == 1) {
//             return null;
//         }

//         ListNode slow = head;
//         ListNode fast = head.next;
//         int length = 2;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//             length = length + 2;
//         }

//         if(fast == null){
//             length = length -1;
//         }

//         int mid = length / 2;
//         int limit = n/2;

//         if(n == length){
//             return head.next;
//         }
//         else if ( n >= mid){
//             ListNode temp = head;
//             for(int i=1 ;i<length-n;i++){
//                 temp = temp.next;
//             }
//              temp.next = temp.next.next;
//             return head;
//         }
//         else {
//             for(int i=1 ;i<limit;i++){
//                 slow = slow.next;
//             }
        
//         slow.next = slow.next.next;
//         return head;
//         }
//     }
// }


}

// #9. Given the head of a singly linked list, given-a-linked-list-of-0s-1s-and-2s-sort-it.
// class Solution {
    
//     static Node segregate(Node head) {
//                 if (head == null || head.next == null) {
//             return head;
//         }

//         // Pointers for the three lists
//         Node zeroHead = new Node(0); // dummy node for 0s
//         Node oneHead = new Node(0);  // dummy node for 1s
//         Node twoHead = new Node(0);  // dummy node for 2s

//         Node zero = zeroHead, one = oneHead, two = twoHead;

//         // Traverse the original list and partition nodes into three lists
//         Node curr = head;
//         while (curr != null) {
//             if (curr.data == 0) {
//                 zero.next = curr;
//                 zero = zero.next;
//             } else if (curr.data == 1) {
//                 one.next = curr;
//                 one = one.next;
//             } else {
//                 two.next = curr;
//                 two = two.next;
//             }
//             curr = curr.next;
//         }

//         // Now connect the three lists together
//         zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
//         one.next = twoHead.next;
//         two.next = null; // End the list

//         // Return the head of the sorted list
//         return zeroHead.next;
//     }
    

// #10Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.
// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         if (headA == null || headB == null) return null;
//         ListNode tempA = headA;
//         ListNode tempB = headB;

//         while(tempA != tempB){
//             tempA = tempA != null ? tempA.next : headB;
//             tempB = tempB != null ? tempB.next : headA;
//         }
//         return tempA;
//     }
// }