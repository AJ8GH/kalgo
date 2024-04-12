package io.github.aj8gh.kalgo.model

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class BinaryTreeNodeKtTest {

  @ParameterizedTest
  @MethodSource("params")
  fun from(input: List<Int>, expected: BinaryTreeNode<Int>) =
    assertEquals(expected, from(input))

  companion object {

    @JvmStatic
    private fun params() = listOf(
      Arguments.of(
        listOf(1),
        leafNodeOf(1)
      ),
      Arguments.of(
        listOf(
          1,
          2, 3
        ),
        BinaryTreeNode(1, leafNodeOf(2), leafNodeOf(3)),
      ),
      Arguments.of(
        listOf(
          1,
          2, 3,
          4, 5, 6, 7
        ),
        BinaryTreeNode(
          1,
          BinaryTreeNode(2, leafNodeOf(4), leafNodeOf(5)),
          BinaryTreeNode(3, leafNodeOf(6), leafNodeOf(7)),
        ),
      ),
      Arguments.of(
        listOf(
          1,
          2, 3,
          4, 5, 6, 7,
          8, 9, 10, 11, 12, 13, 14, 15
        ),
        BinaryTreeNode(
          1,
          BinaryTreeNode(
            2,
            BinaryTreeNode(4, leafNodeOf(8), leafNodeOf(9)),
            BinaryTreeNode(5, leafNodeOf(10), leafNodeOf(11)),
          ),
          BinaryTreeNode(
            3,
            BinaryTreeNode(6, leafNodeOf(12), leafNodeOf(13)),
            BinaryTreeNode(7, leafNodeOf(14), leafNodeOf(15)),
          ),
        ),
      ),
    )
  }
}
