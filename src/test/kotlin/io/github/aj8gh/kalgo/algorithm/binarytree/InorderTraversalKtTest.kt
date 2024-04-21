package io.github.aj8gh.kalgo.algorithm.binarytree

import io.github.aj8gh.kalgo.datastructure.tree.binarytree.BinaryTreeNode
import io.github.aj8gh.kalgo.datastructure.tree.binarytree.binaryTreeFrom
import io.github.aj8gh.kalgo.testutils.ARGUMENTS
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class InorderTraversalKtTest {

  @ParameterizedTest
  @MethodSource(ARGUMENTS)
  fun <T> inorderTraversal(input: BinaryTreeNode<T>, expected: List<T>) =
    assertEquals(expected, inorderTraversal(input))

  companion object {
    @JvmStatic
    private fun arguments() = listOf(
      Arguments.of(
        binaryTreeFrom(listOf(1, 2, 3)),
        listOf(2, 1, 3)
      ),
      Arguments.of(
        binaryTreeFrom(listOf(1, 2, 3, 4, 5, 6, 7)),
        listOf(4, 2, 5, 1, 6, 3, 7)
      ),
      Arguments.of(
        binaryTreeFrom(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)),
        listOf(8, 4, 9, 2, 10, 5, 11, 1, 12, 6, 13, 3, 14, 7, 15)
      ),
    )
  }
}
