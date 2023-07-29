ThisBuild / scalaVersion := "2.12.18"
ThisBuild / organization := "corp.beast"

lazy val core = (project in file("core"))
  .settings(
    name := "core",
  )

lazy val main = (project in file("main"))
  .aggregate(core)
  .dependsOn(core)
  .settings(
    name := "main",
  )

lazy val root = (project in file("."))
  .aggregate(main)
  .dependsOn(main)
  .settings(
    name := "mineblast",
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % Test

