import sbt._
import Process._
import Keys._

name := "scala-note"

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test",
  "com.typesafe.slick" % "slick_2.10" % "2.1.0",
  "org.slf4j" % "slf4j-nop" % "1.6.4"
)

testOptions in Test += Tests.Argument("-oI")
