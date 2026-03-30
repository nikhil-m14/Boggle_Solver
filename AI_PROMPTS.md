# AI Prompt Log

## Interaction 1

Problem:
How to implement Trie insertion in Java?

Prompt:
How to build a 26-way Trie for dictionary words in Java?

Modification:
Integrated into BoggleSolver with private static TrieNode.

---

## Interaction 2

Problem:
How to combine DFS with Trie prefix pruning?

Prompt:
How to recursively search Boggle board using Trie in Java?

Modification:
Used visited[][] backtracking and 8-direction recursion.

---

## Interaction 3

Problem:
How to handle QU tile in Boggle?

Prompt:
How to process Q as QU during DFS Trie traversal?

Modification:
Used nextNode.children['U' - 'A'] and appended 'U' to current word.

---

## Interaction 4

Problem:
How to implement Boggle scoring?

Prompt:
What is official Boggle score logic by word length?

Modification:
Added scoreOf() and isInDictionary() helper.
