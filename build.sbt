name := "scala-unsigned"

organization := "com.github.memo33"

version := "0.1.3"

licenses += ("BSD 2-Clause", url("https://opensource.org/licenses/BSD-2-Clause"))

scalaVersion := "2.11.0"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-optimize")

resolvers ++= Seq(
  "Sonatype Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "Sonatype Releases" at "http://oss.sonatype.org/content/repositories/releases"
)

libraryDependencies ++= Seq(
  "org.scalacheck" %% "scalacheck" % "1.11.3" % "test"
)

