name := "Giskard"

version := "0.1"

scalaVersion := "3.0.0"

organization := "A.S.I.M.o.V."

lazy val giskard = (project in file("."))
  .settings(
    name := "Giskard"
  )

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-swing" % "3.0.0",
)