name := """play-scala"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test,
  "com.typesafe.play" %% "play-slick" % "0.8.1",
  "org.postgresql" % "postgresql" % "9.2-1002-jdbc4",
  "org.flywaydb" % "flyway-core" % "4.0.3"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
