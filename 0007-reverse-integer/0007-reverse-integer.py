class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        sign = x < 0
        x = abs(x)
        rev_num = 0
        while x > 0:
            last_dig = x % 10
            rev_num = rev_num * 10 + last_dig
            x = x / 10
            if rev_num > ((1 << 31) - 1):
                return 0
        return -rev_num if sign else rev_num
        