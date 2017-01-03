//package adthas
package day5.DClassSamples.adthas

trait A {
  def d: D
}

sealed trait D

trait B extends D

trait C extends D with A







