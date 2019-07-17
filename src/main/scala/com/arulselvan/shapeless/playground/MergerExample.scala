package com.arulselvan.shapeless.playground

import shapeless._

trait DepFn2[T, U] {
  type Out
  def apply(t:T, u:U): Out
}

trait Merger[L <: HList, M <: HList] extends DepFn2[L, M] with Serializable { type Out <: HList }

object MergerExample {

}
