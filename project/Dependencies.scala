import sbt._

object Version {
  final val Scala = "2.11.8"

  final val Circe = "0.6.0"

  final val ScalaLogging = "3.5.0"
  final val Logback      = "1.1.7"

  final val ScalaTest      = "3.0.1"
}

object Library {

  val circe       = "io.circe" %% "circe-generic" % Version.Circe
  val circeParser = "io.circe" %% "circe-parser"  % Version.Circe
  val circeJava8  = "io.circe" %% "circe-java8"   % Version.Circe
  val circeOptics = "io.circe" %% "circe-optics"  % Version.Circe

  val scalaLogging = "com.typesafe.scala-logging" %% "scala-logging"  % Version.ScalaLogging
  val logBack      = "ch.qos.logback"             % "logback-classic" % Version.Logback

  val scalaTest = "org.scalatest" %% "scalatest" % Version.ScalaTest
}
