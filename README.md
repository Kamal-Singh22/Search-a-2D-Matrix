# Search-a-2D-Matrix
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:  Integers in each row are sorted from left to right. The first integer of each row is greater than the last integer of the previous row.
Explanation:
Binary Search Approach:

Treat the 2D matrix as a 1D sorted array.
The mid index is calculated as in a 1D array.
To map the mid index back to the matrix, use:
Row index: mid / cols
Column index: mid % cols
Steps:

Define left as 0 and right as rows * cols - 1.
Use binary search to check the mid element.
Adjust the search space based on whether the mid element is smaller or larger than the target.
Edge Cases:

Empty matrix (rows or cols is 0).
Target smaller or larger than all elements in the matrix.
Time and Space Complexity:
Time Complexity: O(log(m * n)) (binary search over m * n elements).
Space Complexity: O(1) (constant space used).
Time Complexity:
The time complexity of this solution is O(n * m), where:
n is the length of the string s.
m is the length of the words array (the number of words).
For each starting index i, we check the substring of length wordCount * wordLength (which is constant relative to the length of the string s).
Space Complexity:
The space complexity is O(m), where m is the number of words, to store the word count in the wordMap and seenWords maps.
