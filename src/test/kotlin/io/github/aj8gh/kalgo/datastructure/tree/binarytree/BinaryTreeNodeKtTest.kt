package io.github.aj8gh.kalgo.datastructure.tree.binarytree

import io.github.aj8gh.kalgo.testutils.ARGUMENTS
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class BinaryTreeNodeKtTest {

  @ParameterizedTest
  @MethodSource(ARGUMENTS)
  fun from(input: List<Int>, expected: BinaryTreeNode<Int>) =
    assertEquals(expected, binaryTreeFrom(input))

  companion object {

    @JvmStatic
    private fun arguments() = listOf(
      Arguments.of(
        listOf(1),
        leafNodeOf(1)
      ),

      Arguments.of(
        listOf(1, 2, 3),
        BinaryTreeNode(1, leafNodeOf(2), leafNodeOf(3)),
      ),

      Arguments.of(
        listOf(1, 2, 3, 4, 5, 6, 7),
        BinaryTreeNode(
          1,
          BinaryTreeNode(2, leafNodeOf(4), leafNodeOf(5)),
          BinaryTreeNode(3, leafNodeOf(6), leafNodeOf(7)),
        ),
      ),

      Arguments.of(
        listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15),
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

      Arguments.of(
        listOf(1, 2),
        BinaryTreeNode(1, leafNodeOf(2))
      ),

      Arguments.of(
        listOf(1, 2, null, 4, null),
        BinaryTreeNode(1, BinaryTreeNode(2, leafNodeOf(4)))
      ),

      Arguments.of(
        listOf(1, 2, null, null, 5, 6, 7, null, 9, null, 11),
        BinaryTreeNode(
          1,
          BinaryTreeNode(
            2,
            null,
            BinaryTreeNode(
              5,
              BinaryTreeNode(6, null, leafNodeOf(9)),
              BinaryTreeNode(7, null, leafNodeOf(11))
            )
          )
        )
      ),
    )
  }
}
