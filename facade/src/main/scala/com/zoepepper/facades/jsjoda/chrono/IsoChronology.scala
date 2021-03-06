package com.zoepepper.facades.jsjoda.chrono

import com.zoepepper.facades.jsjoda.format.ResolverStyle
import com.zoepepper.facades.jsjoda.{Enum, LocalDate}

import scalajs.js
import scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("JSJoda.IsoChronology")
object IsoChronology extends js.Object {
  def isLeapYear(prolepticYear: Double): Boolean = js.native

  val INSTANCE: IsoChronology = js.native
}

@js.native
@JSGlobal("JSJoda.IsoChronology")
class IsoChronology extends Enum {
  def resolveDate(fieldValues: js.Dictionary[Long], resolverStyle: ResolverStyle): LocalDate = js.native
}
