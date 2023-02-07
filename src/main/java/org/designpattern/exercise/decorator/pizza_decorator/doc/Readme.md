### Decorator pattern exercice.

Create an order management system (OMS) for TastyPizza Inc. They wants you to implement a new OMS for his pizza delivery shop. 
For the first milestone, he has defined several requirements that need to be fulfilled by your OMS:

- The shop offers pizza. The system needs to be able to represent all variety of pizza that they offer.
- All pizzas have price and specific nutrition facts.
- Every pizza contains at least cheese and tomato sauce (Pizza Margherita). It can be combined with additional IToppings (ham, onions, etc.), which can be ordered multiple times.
- Pizzas with certain ITopping combinations are named, e.g., Hawaiian Pizza for the base pizza with ham and pineapple. Those names should be contained in the bill. You do not need to auto-detect names for such combinations if they are not explicitly requested in the order.
- In addition to the normal size, pizza can be ordered in family size.

Available items:
<pre>
PIZZAS                                          CALORIES         PRICE
Pizza Margherita (tomato, cheese)                   1104          4.99
Hawaiian Pizza (tomato, cheese, ham, pineapple)     1024          6.49
Salami Pizza (tomato, cheese, salami)               1160          5.99
Family Size for Pizza                             x 1.95        + 4.15

TOPPINGS                                        CALORIES         PRICE
Cheese                                                92          0.69
Ham                                                   35          0.99
Onions                                                22          0.69
Pineapple                                             24          0.79
Salami                                                86          0.99
</pre>
