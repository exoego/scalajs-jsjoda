logLevel := Level.Warn

val scalaJSVersion =
  Option(System.getenv("SCALAJS_VERSION")).filter(_.nonEmpty).getOrElse("1.1.1")

addSbtPlugin("org.scala-js" % "sbt-jsdependencies" % "1.0.1").filterNot(_ => scalaJSVersion.startsWith("0.6."))
addSbtPlugin("org.scala-js" % "sbt-scalajs" % scalaJSVersion)
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.3")
addSbtPlugin("com.dwijnand" % "sbt-travisci" % "1.2.0")
