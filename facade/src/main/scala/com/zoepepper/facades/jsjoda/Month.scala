package com.zoepepper.facades.jsjoda

import com.zoepepper.facades.jsjoda.temporal._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("JSJoda.Month")
object Month extends js.Object {
  def values: js.Array[Month] = js.native
  def of(month: Int): Month = js.native
  def from(temporal: TemporalAccessor): Month = js.native

  val JANUARY: Month = js.native
  val FEBRUARY: Month = js.native
  val MARCH: Month = js.native
  val APRIL: Month = js.native
  val MAY: Month = js.native
  val JUNE: Month = js.native
  val JULY: Month = js.native
  val AUGUST: Month = js.native
  val SEPTEMBER: Month = js.native
  val OCTOBER: Month = js.native
  val NOVEMBER: Month = js.native
  val DECEMBER: Month = js.native
}

@js.native
class Month extends Temporal {
  def value: Int = js.native
  def getLong(unit: TemporalUnit): Double = js.native
  def plus(months: Double): Month = js.native
  def minus(months: Double): Month = js.native
  def length(leapYear: Boolean): Int = js.native
  def minLength: Int = js.native
  def maxLength: Int = js.native
  def firstDayOfYear(leapYear: Boolean): Int = js.native
  def firstMonthOfQuarter: Month = js.native
  def adjustInto(temporal: Temporal): Temporal = js.native

  def minus(amountToSubtract: Double, unit: TemporalUnit): Temporal = js.native
  def minus(amount: TemporalAmount): Temporal = js.native
  def plus(amountToAdd: Double, unit: TemporalUnit): Temporal = js.native
  def plus(amount: TemporalAmount): Temporal = js.native
  def until(endExclusive: Temporal, unit: TemporalUnit): Double = js.native
  def `with`(adjuster: TemporalAdjuster): Temporal = js.native
  def `with`(field: TemporalField, newValue: Double): Temporal = js.native
}