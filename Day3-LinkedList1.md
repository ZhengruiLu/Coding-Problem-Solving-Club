# Key Words in Foundation
two pointers - pre and curr

# Problem List
## 203. Remove Linked List Elements
- https://leetcode.com/problems/remove-linked-list-elements/description/
- pre, curr pointer, use curr = curr.next continue to explore next ele, use pre.next = curr.next to skip deleted val

## 707. Design Linked List
- https://leetcode.com/problems/design-linked-list/description/
- Fully understand: 1.the class of singly linked list; 2.operations.

## 206. Reverse Linked List
- https://leetcode.com/problems/reverse-linked-list/description/
- two pointers: pre, curr, follow. 
- 1. Use follow = curr.next, to record the next ele of curr. 
- 2. Use curr.next = pre change direction.
- 3. Move pre, curr to move forward, until curr = null.

# Resources
- Introduction to Singly Linked List
  https://www.geeksforgeeks.org/data-structures/linked-list/singly-linked-list/