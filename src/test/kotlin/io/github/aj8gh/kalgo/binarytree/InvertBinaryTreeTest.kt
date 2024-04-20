package io.github.aj8gh.kalgo.binarytree

import io.github.aj8gh.kalgo.algorithm.binarytree.invert
import io.github.aj8gh.kalgo.datastructure.tree.binarytree.BinaryTreeNode
import io.github.aj8gh.kalgo.datastructure.tree.binarytree.binaryTreeFrom
import io.github.aj8gh.kalgo.testutils.ARGUMENTS
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class InvertBinaryTreeTest {

  @ParameterizedTest
  @MethodSource(ARGUMENTS)
  fun invertBinaryTree(input: BinaryTreeNode<Int>, expected: BinaryTreeNode<Int>) =
    assertEquals(expected, invert(input))

  companion object {
    @JvmStatic
    private fun arguments() = listOf(
      Arguments.of(
        binaryTreeFrom(listOf(1)),
        binaryTreeFrom(listOf(1)),
      ),
      Arguments.of(
        binaryTreeFrom(listOf(2, 1, 3)),
        binaryTreeFrom(listOf(2, 3, 1)),
      ),
      Arguments.of(
        binaryTreeFrom(listOf(4, 2, 7, 1, 3, 6, 9)),
        binaryTreeFrom(listOf(4, 7, 2, 9, 6, 3, 1)),
      ),
      Arguments.of(
        binaryTreeFrom(listOf(4, 2, 7, 1, 3, 6, 9, 10, 11, 12, 13, 14, 15, 16, 17)),
        binaryTreeFrom(listOf(4, 7, 2, 9, 6, 3, 1, 17, 16, 15, 14, 13, 12, 11, 10)),
      ),
      Arguments.of(
        binaryTreeFrom(listOf(4, 2, 7, 1, 3, null, null)),
        binaryTreeFrom(listOf(4, 7, 2, null, null, 3, 1)),
      ),
      Arguments.of(
        binaryTreeFrom(listOf(4, 2, 7, 1, 3, 6, null)),
        binaryTreeFrom(listOf(4, 7, 2, null, 6, 3, 1)),
      ),
    )
  }
}
