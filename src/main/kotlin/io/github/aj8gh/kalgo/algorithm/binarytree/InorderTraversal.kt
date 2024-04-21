package io.github.aj8gh.kalgo.algorithm.binarytree

import io.github.aj8gh.kalgo.datastructure.tree.binarytree.BinaryTreeNode

fun <T> inorderTraversal(input: BinaryTreeNode<T>, values: List<T> = mutableListOf()): List<T> {
  input.left?.let { inorderTraversal(it, values) }
  values.addLast(input.value)
  input.right?.let { inorderTraversal(it, values) }
  return values
}
