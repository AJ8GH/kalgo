package io.github.aj8gh.kalgo.algorithm.binarytree

import io.github.aj8gh.kalgo.datastructure.tree.binarytree.BinaryTreeNode

fun <T> postorderTraversal(root: BinaryTreeNode<T>, values: List<T> = mutableListOf()): List<T> {
  println("root is    ${root.value} values: $values")

  var current: BinaryTreeNode<T>? = root
  val nodes = ArrayDeque(listOf(root))

  while (current != null) {
    current.left?.let { nodes.add(it) }
    current = current.left
  }

  while (nodes.isNotEmpty()) {
    nodes.removeLastOrNull()?.let { node ->
      node.right?.let { postorderTraversal(it, values) }
      values.addLast(node.value)
    }
  }

  return values
}

/*


                                    1

                        2                       3

                4           5             6              7

          8        9    10     11      12     13      14         15

     16 17     18 19   20 21  22 23   24 25   26 27  28 29      30 31

values  [8, 9, 10]
nodes   [1, 2x, 4x, 8x, 9x, 5x, 10x]
 */
