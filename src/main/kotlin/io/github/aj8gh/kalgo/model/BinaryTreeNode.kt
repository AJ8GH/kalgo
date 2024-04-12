package io.github.aj8gh.kalgo.model

data class BinaryTreeNode<T>(
  val value: T,
  var left: BinaryTreeNode<T>? = null,
  var right: BinaryTreeNode<T>? = null,
)

fun <T> from(values: List<T>): BinaryTreeNode<T> {
  val root = BinaryTreeNode(values[0])
  val nodes = ArrayDeque(listOf(root))
  for (i in values.indices step 2) {
    val currentRoot = nodes.removeFirstOrNull() ?: continue
    if (i + 1 < values.size) {
      val left = leafNodeOf(values[i + 1])
      currentRoot.left = left
      nodes.add(left)
    }
    if (i + 2 < values.size) {
      val right = leafNodeOf(values[i + 2])
      currentRoot.right = right
      nodes.add(right)
    }
  }
  return root
}

fun <T> leafNodeOf(value: T) = BinaryTreeNode(value)
