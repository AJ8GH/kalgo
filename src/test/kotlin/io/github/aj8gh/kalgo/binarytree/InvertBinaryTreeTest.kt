package io.github.aj8gh.kalgo.binarytree

import io.github.aj8gh.kalgo.algorithm.binarytree.invert
import io.github.aj8gh.kalgo.model.BinaryTreeNode
import io.github.aj8gh.kalgo.model.binaryTreeFrom
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
        binaryTreeFrom(listOf(4, 2, 7, 1, 3, 6, 9)),
        binaryTreeFrom(listOf(4, 7, 2, 9, 6, 3, 1)),
      ),
    )
  }
}
