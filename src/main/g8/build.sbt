import Dependencies._

ThisBuild / organization := "com.example"
ThisBuild / version      := "1.0-SNAPSHOT"

ThisBuild / scalaVersion := "$scala_version$"
ThisBuild / scalacOptions ++= Seq(
  "-unchecked", 
  "-deprecation", 
  "-feature"
)

lazy val root = (project in file("."))
  .settings(
    name := "$name;format="norm"$",
    libraryDependencies ++= backendDeps
  )