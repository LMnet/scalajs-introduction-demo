name := "scalajs-introduction-demo"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.8"

scalacOptions ++= Seq("-feature")

enablePlugins(ScalaJSPlugin)

libraryDependencies ++= Seq(
  "fr.iscpif" %%% "scaladget" % "0.8.1"
)
