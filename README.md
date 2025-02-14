# Best Time to Buy and Sell Stock

### Problem Statement

You are given an array `prices`, where `prices[i]` represents the price of a stock on the `i`th day.  

Your goal is to maximize profit by choosing **one day to buy** and a **future day to sell**.  

Return the **maximum profit** possible. If no profit can be made, return `0`.  

---

### Example 1:
**Input:**  
`prices = [7,1,5,3,6,4]`  

**Output:**  
`5`  

**Explanation:**  
- Buy on day `2` (price = `1`)  
- Sell on day `5` (price = `6`)  
- Profit = `6 - 1 = 5`  

---

### Example 2:
**Input:**  
`prices = [7,6,4,3,1]`  

**Output:**  
`0`  

**Explanation:**  
No profitable transaction is possible.

---

### Constraints:
- `1 <= prices.length <= 10⁵`
- `0 <= prices[i] <= 10⁴`
