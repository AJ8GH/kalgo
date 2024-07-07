package io.github.aj8gh.kalgo.datastructure.stack

class MyStack<E> : MutableList<E> {

  override val size: Int get() = TODO()

  override fun clear() = TODO()
  override fun addAll(elements: Collection<E>): Boolean = TODO()
  override fun addAll(index: Int, elements: Collection<E>): Boolean = TODO()
  override fun add(index: Int, element: E) = TODO()
  override fun add(element: E): Boolean = TODO()
  override fun get(index: Int): E = TODO()
  override fun isEmpty(): Boolean = TODO()
  override fun iterator(): MutableIterator<E> = TODO()
  override fun listIterator(): MutableListIterator<E> = TODO()
  override fun listIterator(index: Int): MutableListIterator<E> = TODO()
  override fun removeAt(index: Int): E = TODO()
  override fun subList(fromIndex: Int, toIndex: Int): MutableList<E> = TODO()
  override fun set(index: Int, element: E): E = TODO()
  override fun retainAll(elements: Collection<E>): Boolean = TODO()
  override fun removeAll(elements: Collection<E>): Boolean = TODO()
  override fun remove(element: E): Boolean = TODO()
  override fun lastIndexOf(element: E): Int = TODO()
  override fun indexOf(element: E): Int = TODO()
  override fun containsAll(elements: Collection<E>): Boolean = TODO()
  override fun contains(element: E): Boolean = TODO()

  fun push(item: E): E = TODO()
  fun pop(): E = TODO()
  fun peek(): E = TODO()
  fun empty(): Boolean = TODO()
  fun search(o: Any?): Int = TODO()
}

fun <E> myStackOf(): MyStack<E> = myStackOf()
