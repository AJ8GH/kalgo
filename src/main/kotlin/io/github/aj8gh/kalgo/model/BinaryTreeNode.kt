package io.github.aj8gh.kalgo.model

import java.util.*
import java.util.function.Consumer
import kotlin.collections.ArrayDeque

data class BinaryTreeNode<T>(
  val value: T,
  var left: BinaryTreeNode<T>? = null,
  var right: BinaryTreeNode<T>? = null,
) {
  fun setLeft(node: BinaryTreeNode<T>) = apply { left = node }
  fun setRight(node: BinaryTreeNode<T>) = apply { right = node }
}

fun <T> leafNodeOf(value: T) = BinaryTreeNode(value)

fun <T> binaryTreeFrom(values: List<T>): BinaryTreeNode<T> {
  val root = BinaryTreeNode(values[0])
  val nodes = ArrayDeque(listOf(root))
  for (i in values.indices step 2) {
    val currentRoot = nodes.removeFirstOrNull() ?: continue
    updateNode(i + 1, values, nodes, currentRoot::setLeft)
    updateNode(i + 2, values, nodes, currentRoot::setRight)
  }
  return root
}

private fun <T> updateNode(
  index: Int,
  values: List<T>,
  nodes: ArrayDeque<BinaryTreeNode<T>>,
  consumer: Consumer<BinaryTreeNode<T>>,
) {
  if (index < values.size) {
    values[index]?.apply {
      val node: BinaryTreeNode<T> = leafNodeOf(this)
      consumer.accept(node)
      nodes.add(node)
    }
  }
}
