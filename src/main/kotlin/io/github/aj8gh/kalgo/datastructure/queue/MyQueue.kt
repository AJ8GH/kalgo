package io.github.aj8gh.kalgo.datastructure.queue

import java.util.Queue

class MyQueue<E> : Queue<E> {

  override val size: Int get() = TODO()

  override fun add(element: E): Boolean = TODO()
  override fun addAll(elements: Collection<E>): Boolean = TODO()
  override fun clear() = TODO()
  override fun iterator(): MutableIterator<E> = TODO()
  override fun remove(): E = TODO()
  override fun retainAll(elements: Collection<E>): Boolean = TODO()
  override fun removeAll(elements: Collection<E>): Boolean = TODO()
  override fun remove(element: E): Boolean = TODO()
  override fun isEmpty(): Boolean = TODO()
  override fun poll(): E = TODO()
  override fun element(): E = TODO()
  override fun peek(): E = TODO()
  override fun offer(e: E): Boolean = TODO()
  override fun containsAll(elements: Collection<E>): Boolean = TODO()
  override fun contains(element: E): Boolean = TODO()
}

fun <E> myQueueOf(): MyQueue<E> = TODO()
