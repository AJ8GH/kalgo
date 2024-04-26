package io.github.aj8gh.kalgo.algorithm.binarytree

import io.github.aj8gh.kalgo.datastructure.tree.binarytree.BinaryTreeNode
import io.github.aj8gh.kalgo.datastructure.tree.binarytree.binaryTreeFrom
import io.github.aj8gh.kalgo.testutils.ARGUMENTS
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class PreorderTraversalKtTest {

  @ParameterizedTest
  @MethodSource(ARGUMENTS)
  fun <T> preorderTraversal(root: BinaryTreeNode<T>, expected: List<T>) =
    assertEquals(expected, preorderTraversal(root))

  companion object {
    @JvmStatic
    private fun arguments() = listOf(
      Arguments.of(
        binaryTreeFrom(listOf(1, 2, 3)),
        listOf(1, 2, 3)
      ),
      Arguments.of(
        binaryTreeFrom(listOf(1, 2, 3, 4, 5, 6, 7)),
        listOf(1, 2, 4, 5, 3, 6, 7)
      ),
      Arguments.of(
        binaryTreeFrom(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)),
        listOf(1, 2, 4, 8, 9, 5, 10, 11, 3, 6, 12, 13, 7, 14, 15)
      ),
    )
  }
}

/*


                 1
           2            3
      4        5    6        7


vals   [ 1, 2, 4,                     ]

stack  [ 1, 2,                             ]

 */
