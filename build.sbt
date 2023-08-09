addCommandAlias("test", "g8Test")

lazy val root = (project in file("."))
  .enablePlugins(ScriptedPlugin)
  .settings(
    name := "Simple Scala 2 Template",
    scriptedLaunchOpts ++= Seq(
      "-Xms1024m", 
      "-Xmx1024m", 
      "-XX:ReservedCodeCacheSize=128m", 
      "-Xss2m", 
      "-Dfile.encoding=UTF-8"
    )
  )
