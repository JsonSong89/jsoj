package leetcode.number


class Test1 {

    class ListNode(var `val`: Int = 0) {
        var next: ListNode? = null
    }

   
    fun addTwoNumbers(l1: ListNode, l2: ListNode): ListNode? {
        val dummyHead = ListNode(0)
        var p: ListNode? = l1
        var q: ListNode? = l2
        var curr: ListNode? = dummyHead
        var carry = 0
        while (p != null || q != null) {
            val x = if (p != null) p.`val` else 0
            val y = if (q != null) q.`val` else 0
            val sum = carry + x + y
            carry = sum / 10
            curr!!.next = ListNode(sum % 10)
            curr = curr.next
            if (p != null) p = p!!.next
            if (q != null) q = q!!.next
        }
        if (carry > 0) {
            curr!!.next = ListNode(carry)
        }
        return dummyHead.next
    }
}