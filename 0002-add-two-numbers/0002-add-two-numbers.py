# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        res = 0
        temp = 1
        while l1 or l2:
            if l1:
                res += l1.val * temp
                l1 = l1.next
            if l2:
                res += l2.val * temp
                l2 = l2.next
            temp *= 10
        result = ListNode()
        temp = result
        while True:
            result.val = res % 10
            res //= 10
            if res < 1:
                break
            result.next = ListNode()
            result = result.next
        return temp
        