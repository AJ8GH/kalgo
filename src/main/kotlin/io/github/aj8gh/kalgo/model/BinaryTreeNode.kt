package io.github.aj8gh.kalgo.model

data class BinaryTreeNode<T>(
  val value: T,
  var left: BinaryTreeNode<T>? = null,
  var right: BinaryTreeNode<T>? = null,
)

fun <T> binaryTreeFrom(values: List<T>): BinaryTreeNode<T> {
  val root = BinaryTreeNode(values[0])
  val nodes = ArrayDeque(listOf(root))
  for (i in values.indices step 2) {
    val currentRoot = nodes.removeFirstOrNull() ?: continue
    if (i + 1 < values.size) {
      val value = values[i + 1]
      currentRoot.left = if (value == null) null else leafNodeOf(value)
      currentRoot.left?.let { nodes.add(it) }
    }
    if (i + 2 < values.size) {
      val value = values[i + 2]
      currentRoot.right = if (value == null) null else leafNodeOf(value)
      currentRoot.right?.let { nodes.add(it) }
    }
  }
  return root
}

fun <T> leafNodeOf(value: T) = BinaryTreeNode(value)
