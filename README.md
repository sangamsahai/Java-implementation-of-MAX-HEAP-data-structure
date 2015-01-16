This is my implementation of MAX HEAP in java.
MAX HEAP can be represented using a tree data structure but using an array/array list
is a much simpler and efficient way of representing s heap.

MAX HEAP is a binary tree that satisfies these two properties.
1) It is a complete binary tree
2) Data in each node is greater than or equal to the data in the child nodes.

First we will discuss the Insert operation on the HEAP.
In insert , a new node is added in the lowest level in the left most possible space.
Then that node is sifted all the way up until the tree becomes a MAX HEAP.
The time complexity of this operation is O(h) where h=height of the tree
or O(log n) where n is the number of nodes in the tree.
This is because for a complete binary tree, the height of the tree h=log n , where n is the total number of nodes.

The second operation is delete.
In this operation , the root is deleted and returned to the caller.
Then the root is replaced by the righ most element of the lowest level.
Then that element is sifted all the way down until the tree becomes a MAX HEAP.
The time complexity of this operation is O(h) where h=height of the tree
or O(log n) where n is the number of nodes in the tree.


An interesting application of delete operation is HEAP SORT.
if we keep deleting the element on heap , then will get the elements of the heap in Descending order.
This is one application of delete operation on MAX HEAP.