class Solution(object):
    def maxProfit(self, prices, fee):
        """
        :type prices: List[int]
        :type fee: int
        :rtype: int
        """
        # amount is your reserve of money you have with you. Initially, you are buying 1 stock so its -prices[0]
        amount, profit = -prices[0], 0
        i = 1
        while i < len(prices):
        	profit = max(profit, amount + prices[i] - fee) # (dont do anything, sell the stock)
        	amount = max(amount, profit - prices[i]) # (dont do anything, buy the stock)
        	i += 1
        return profit


