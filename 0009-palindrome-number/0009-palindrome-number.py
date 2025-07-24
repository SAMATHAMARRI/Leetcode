class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x < 0 :
            return False
        num = x
        rev_num = 0
        while x > 0:
            last_dig = x % 10
            rev_num = rev_num * 10 + last_dig
            x = x / 10
        return rev_num == num

        