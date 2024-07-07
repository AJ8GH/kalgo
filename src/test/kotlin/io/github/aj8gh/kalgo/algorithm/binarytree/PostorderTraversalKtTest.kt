package io.github.aj8gh.kalgo.algorithm.binarytree

import io.github.aj8gh.kalgo.datastructure.tree.binarytree.BinaryTreeNode
import io.github.aj8gh.kalgo.datastructure.tree.binarytree.binaryTreeFrom
import io.github.aj8gh.kalgo.testutils.ARGUMENTS
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.Ignore

@Ignore
class PostorderTraversalKtTest {

  @ParameterizedTest
  @MethodSource(ARGUMENTS)
  fun <T> postorderTraversal(root: BinaryTreeNode<T>, expected: List<T>) =
    kotlin.test.assertEquals(expected, postorderTraversal(root))

  companion object {
    @JvmStatic
    private fun arguments() = listOf(
      Arguments.of(
        binaryTreeFrom(listOf(1, 2, 3)),
        listOf(2, 3, 1)
      ),
      Arguments.of(
        binaryTreeFrom(listOf(1, 2, 3, 4, 5, 6, 7)),
        listOf(4, 5, 2, 6, 7, 3, 1)
      ),
      Arguments.of(
        binaryTreeFrom(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)),
        listOf(8, 9, 10, 11, 4, 5, 2, 12, 13, 14, 15, 6, 7, 3, 1)
      ),
    )
  }
}
