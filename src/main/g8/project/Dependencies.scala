import sbt._

object Dependencies {
  // versions
  lazy val scalatestVersion = "3.2.16"

  // libraries
  val scalatest = "org.scalatest" %% "scalatest" % scalatestVersion % Test

  // projects
  val backendDeps = Seq(scalatest)
}
