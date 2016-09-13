import math
import unittest

def chop_iterative(value, ints):
    lowerBound = 0
    upperBound = len(ints)    #exclusive
        
    while True:
        numElements = upperBound - lowerBound

        if numElements == 0:
            return -1
        
        pivotIndex = lowerBound + math.floor(numElements / 2.0)
        pivotValue = ints[pivotIndex]
        
        if pivotValue == value:
            return pivotIndex
        elif pivotValue < value:
            lowerBound = pivotIndex + 1
        elif pivotValue > value:
            upperBound = pivotIndex

        
def chop_recursive(value, ints):
    numElements = len(ints)
    if numElements == 0:
        return -1
    elif numElements == 1:
        return 0 if ints[0] == value else -1
    else:
        pivotIndex = math.floor(numElements / 2.0)
        pivotValue = ints[pivotIndex]
        if pivotValue == value:
            return pivotIndex
        elif pivotValue < value:
            indexInSubarray = chop_recursive(value, ints[pivotIndex+1:])
            return combineIndices(pivotIndex + 1, indexInSubarray)
        elif pivotValue > value:
            indexInSubarray = chop_recursive(value, ints[:pivotIndex])
            return combineIndices(0, indexInSubarray)

def combineIndices(baseIndex, indexInSubarray):
    if indexInSubarray == -1:
        return -1
    return baseIndex + indexInSubarray

def chop_functional(value, ints):
    return -1
    
class TestChopping(unittest.TestCase):
    def test_iterative(self):
        self.chopTestTemplate(chop_iterative)

    def test_recursive(self):
        self.chopTestTemplate(chop_recursive)
        
    def chopTestTemplate(self, fun):
        self.assertEqual(-1, fun(3, []))
        self.assertEqual(-1, fun(3, [1]))
        self.assertEqual(0,  fun(1, [1]))
        #
        self.assertEqual(0,  fun(1, [1, 3, 5]))
        self.assertEqual(1,  fun(3, [1, 3, 5]))
        self.assertEqual(2,  fun(5, [1, 3, 5]))
        self.assertEqual(-1, fun(0, [1, 3, 5]))
        self.assertEqual(-1, fun(2, [1, 3, 5]))
        self.assertEqual(-1, fun(4, [1, 3, 5]))
        self.assertEqual(-1, fun(6, [1, 3, 5]))
        #
        self.assertEqual(0,  fun(1, [1, 3, 5, 7]))
        self.assertEqual(1,  fun(3, [1, 3, 5, 7]))
        self.assertEqual(2,  fun(5, [1, 3, 5, 7]))
        self.assertEqual(3,  fun(7, [1, 3, 5, 7]))
        self.assertEqual(-1, fun(0, [1, 3, 5, 7]))
        self.assertEqual(-1, fun(2, [1, 3, 5, 7]))
        self.assertEqual(-1, fun(4, [1, 3, 5, 7]))
        self.assertEqual(-1, fun(6, [1, 3, 5, 7]))
        self.assertEqual(-1, fun(8, [1, 3, 5, 7]))

unittest.main()
