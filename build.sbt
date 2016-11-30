import sbt.Keys._

lazy val escargo =
  project.in(file(".")).aggregate(main).enablePlugins(GitVersioning).settings(commonSettings: _*)


lazy val main = (project in file("main"))
  .settings(commonSettings: _*)
  .settings(libraryDependencies ++= utilLibs ++ jsonLibs)

lazy val commonSettings = Vector(
  resolvers ++= Vector(Resolver.jcenterRepo, "elasticsearch-releases" at "https://maven.elasticsearch.org/releases"),
  initialCommands := """|import default.escargo._
                     |""".stripMargin
)


lazy val jsonLibs = Vector(
  Library.circe,
  Library.circeParser,
  Library.circeJava8,
  Library.circeOptics
)

lazy val utilLibs = Vector(
  Library.scalaLogging,
  Library.logBack,
  Library.scalaTest % "test"
)

libraryDependencies ++= utilLibs ++ jsonLibs

enablePlugins(JavaAppPackaging)
