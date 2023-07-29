ThisBuild / scalaVersion := "2.12.18"
ThisBuild / organization := "corp.beast"
ThisBuild / version := "0.1.0-SNAPSHOT

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

