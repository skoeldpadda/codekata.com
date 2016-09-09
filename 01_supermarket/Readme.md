#Kata 01: Supermarket
A possible solution to [the first kata on codekata.com](http://codekata.com/kata/kata01-supermarket-pricing/).
For more katas see [codekata.com][codekata]

As stated by the author of [codekata.com][codekata]:
> How do you get to be a great musician? It helps to know the theory, and to understand the mechanics of your instrument. It helps to have talent. But ultimately, greatness comes from practicing; applying the theory over and over again, using feedback to get better every time.

##Delicate questions to consider
* Should offers like "one item of product A and one item of product B for 10$" be possible?
* How should the functionality to _calculate the total value of a shopping basket_ be provided?
* Are countable and per-weight products two inherently different kinds of products?

##Pitfalls of the task
* It's about modelling, not about implementation. I regularly notice myself pondering about how this or that decision will affect the implementation...

##Basic definitions and design decisions (valid for all models)
> **Product**: a product with a name, e.g. "Tomatoes" or "Water of Brand XY"  
> **Item**: an instance of a product, with a quantity (either count or weight)  
> **Basket**: a set of items, where there exists at most one item for each product.  

> _Price ambiguities_: price ambiguities are to be resolved by using those prices that lead to a minimum total value of a given basket. Note that this decision can lead to difficulties in implementation, since provably finding the optimal solution might even be a NP-hard problem (to be investigated).

##Supermarket Pricing Models

###Model M1: A price maps a pair of <quantity, product> to a price.
> Price :: Item -> Money

###Model M2: A price maps a set of <quantity, product> pairs to a price.
> Price :: [Item] -> Money

* This enables offers involving more than one product, e.g. "buy two of A and two of B for 10$".

###Model M3: Only one simple price per product, offers as a subclass of Product.
**Pro**

* This approach seems to be quite straight-forward yet powerful.

**Con**

* On the other hand, it's a bit ugly and confusing to calculate the amount of money that is to be substracted from the original, simple price.
* _The responsibility for determining prices lies outside of the actual prices._ That seems to be unclean.


##Model validation
* Full implementation (costly)
* Answering some appropriate questions:
 * How can the example offers _O1_ - _O4_ be modeled?
 * Is the stock value of 100 cans as given in the original task clearly defined?
* **Mock implementation**, without working implementation of algorithms. Maybe written as a top-level testcase? _This seems to work quite well! Simply writing down the testcase gives a lot of insight into whether the model is easy to use and comprehensible._

[codekata]: www.codekata.com
