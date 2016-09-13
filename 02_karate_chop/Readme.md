#Kata 02: Karate Chop

##Goals:
* Encountered errors
* Merits: which one will make it into production? fun of writing? hardest to get working?
* how did you come up with approaches four and five?

##Technique 1: iterative approach
###Notes
* many cases to consider and to explicitly solve
* code duplication, eg for first loop iteration
* hard to write: a clean, readable solution is not obvious
* handling the current search window is nasty and a possible source of errors

###Encountered errors
1. infinite loop: typo (two distinct variable names by accident)
2. errenous handling of current search window
3. (was able to remove duplicate check for a special case)

##Technique 2: recursive approach
###Notes
* it's necessary to determine the global index from the local index within an subarray, which appears not to be straight-forward to solve in an elegant way -- I solved it using a function which combines the indices
* nevertheless, this one is easy and fast to write

###Encountered errors
1. again a typo, leading to a type error
2. off-by-one error in the recombination of the results of the recursive calls

##Technique 3: functional approach
###Notes
* I came to ask myself whether the recursive approach isn't already a functional one. Indeed I think that this is more or less the case (of course one would have to inline the variable assignments...). Let's write a purely functional binary search in Haskell! The result is indeed very similar to the recursive approach -- in my eyes, the readability is a bit better because the different cases can be seperated in a clean way using pattern matching.
* Writing the functional one is much less fun than expected: Splitting the list, getting a pivot element, ...
* It took me more time to write this one than the previous one, most likely due to the fact that I'm less fluent in Haskell than in Python.

###Encountered errors
1. a parse error, I didn't exactly stick to the Haskell syntax

