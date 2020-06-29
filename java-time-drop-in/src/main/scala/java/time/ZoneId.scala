package java.time

import java.Wrapper
import java.time.format.TextStyle
import java.time.temporal.TemporalAccessor
import java.time.zone.ZoneRules
import java.util.Locale

import scala.jdk.CollectionConverters._
import com.zoepepper.facades.jsjoda.{JSJoda, JSJodaTimezone, ZoneId => ZoneIdF, ZoneOffset => ZoneOffsetF}

object ZoneId {
  def from(temporal: TemporalAccessor): ZoneId = ZoneIdF.from(temporal)
  def getAvailableZoneIds(): java.util.Set[String] = ZoneIdF.getAvailableZoneIds().toSet.asJava
  def of(zoneId: String): ZoneId = ZoneIdF.of(zoneId)
  def of(zoneId: String, aliasMap: java.util.Map[String, String]): ZoneId = ???
  def ofOffset(prefix: String, offset: ZoneOffset): ZoneId = ZoneIdF.ofOffset(prefix, offset.f)
  def systemDefault(): ZoneId = ZoneIdF.systemDefault()

  def SHORT_IDS: java.util.Map[String, String] = ??? // Turn into val if it gets defined in js-joda.

  // Initialize timezone plugin upon loading object.
  JSJoda.use(JSJodaTimezone)
}

trait ZoneId { self: Wrapper =>
  protected[time] val zoneIdF = self.f.asInstanceOf[ZoneIdF]

  def getDisplayName(style: TextStyle, locale: Locale): String = ???
  def getId(): String = zoneIdF.id()
  def getRules(): ZoneRules = zoneIdF.rules()
  def normalized(): ZoneId = zoneIdF.normalized().asInstanceOf[ZoneOffsetF]

  override def toString(): String = zoneIdF.toString()
  override def hashCode(): Int = zoneIdF.hashCode()
  override def equals(obj: Any): Boolean = obj match {
    case other: ZoneId => zoneIdF.equals(other.zoneIdF)
    case _ => false
  }
}
