# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        dummy = cur = ListNode()
        while list1 and list2:
            if list1.val < list2.val: #list1이 list2보다 작을 때
                cur.next = list1
                list1 = list1.next
            else: # list2가 list2보다 작거나 같을 때
                cur.next = list2
                list2 = list2.next
            cur = cur.next
            
        cur.next = list1 or list2

        return dummy.next