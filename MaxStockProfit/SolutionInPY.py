def max_profit(prices):
    min_price,max_profit=float('inf'),0

    for price in prices:
        min_price=min(min_price,price)
        max_profit=max(max_profit,price-min_price)
    return max_profit


prices1=[7,1,5,3,6,4]

print(max_profit(prices1))