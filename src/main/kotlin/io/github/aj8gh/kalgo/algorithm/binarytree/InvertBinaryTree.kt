package io.github.aj8gh.kalgo.algorithm.binarytree

import io.github.aj8gh.kalgo.datastructure.tree.binarytree.BinaryTreeNode
import java.util.function.Consumer

fun <T> invert(input: BinaryTreeNode<T>): BinaryTreeNode<T> {
  val nodes = ArrayDeque(listOf(input))
  while (nodes.isNotEmpty()) {
    val current = nodes.removeFirstOrNull() ?: continue
    val right = current.right
    invert(current.left, current::setRight, nodes)
    invert(right, current::setLeft, nodes)
  }
  return input
}

private fun <T> invert(
  node: BinaryTreeNode<T>?,
  consumer: Consumer<BinaryTreeNode<T>?>,
  nodes: ArrayDeque<BinaryTreeNode<T>>,
) {
  consumer.accept(node)
  node?.let { nodes.add(it) }
}
