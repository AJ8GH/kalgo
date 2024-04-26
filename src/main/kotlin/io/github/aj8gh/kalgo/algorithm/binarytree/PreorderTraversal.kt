package io.github.aj8gh.kalgo.algorithm.binarytree

import io.github.aj8gh.kalgo.datastructure.tree.binarytree.BinaryTreeNode

fun <T> preorderTraversal(root: BinaryTreeNode<T>, values: List<T> = mutableListOf()): List<T> {
  values.addLast(root.value)
  val nodes = ArrayDeque<BinaryTreeNode<T>>()
  root.right?.let { nodes.add(it) }
  root.left?.let { preorderTraversal(it, values) }
  while (nodes.isNotEmpty()) {
    preorderTraversal(nodes.removeLast(), values)
  }
  return values
}
