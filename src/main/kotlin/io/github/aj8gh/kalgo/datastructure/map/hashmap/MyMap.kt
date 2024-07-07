package io.github.aj8gh.kalgo.datastructure.map.hashmap

private const val INITIAL_CAPACITY = 16
private const val LOAD_FACTOR = 0.75

class MyMap<K, V> : MutableMap<K?, V?> {

  override val entries: MutableSet<MutableMap.MutableEntry<K?, V?>> get() = TODO()
  override val size: Int get() = TODO()
  override val keys: MutableSet<K?> get() = TODO()
  override val values: MutableCollection<V?> get() = TODO()

  override fun put(key: K?, value: V?): V? = TODO()
  override fun get(key: K?): V? = TODO()
  override fun remove(key: K?): V? = TODO()
  override fun putAll(from: Map<out K?, V?>) = TODO()
  override fun containsKey(key: K?): Boolean = TODO()
  override fun containsValue(value: V?): Boolean = TODO()
  override fun isEmpty(): Boolean = TODO()
  override fun clear() = TODO()

  class MyEntry<K, V> : MutableMap.MutableEntry<K, V> {

    override val key: K get() = TODO()
    override val value: V get() = TODO()

    override fun setValue(newValue: V): V = TODO()
  }
}

fun <K, V> myMapOf(): MyMap<K, V> = TODO()
