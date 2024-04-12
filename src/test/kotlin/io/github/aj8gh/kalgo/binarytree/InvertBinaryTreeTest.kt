package io.github.aj8gh.kalgo.binarytree

import io.github.aj8gh.kalgo.testutils.ARGUMENTS
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class InvertBinaryTreeTest {

  @ParameterizedTest
  @MethodSource(ARGUMENTS)
  fun invertBinaryTree() {

  }

  companion object {
    @JvmStatic
    private fun arguments() = Stream.of(
      Arguments.of(
        listOf(4,2,7,1,3,6,9),
        listOf(4,7,2,9,6,3,1),
      ),
    )
  }
}
