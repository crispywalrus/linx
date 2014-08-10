import com.typesafe.sbt.pgp.PgpKeys

name := "linx"

organization := "net.crispywalrus"

scalaVersion := "2.11.2"

description := "A simple and typesafe link representation"

libraryDependencies ++= Seq(
  "com.novocode" % "junit-interface" % "0.10-M2" % "test",
  "junit" % "junit" % "4.11" % "test")

licenses := Seq("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0"))

homepage := Some(url("http://github.com/crispywalrus/linx"))

seq(bintraySettings:_*)

pomExtra := (
  <scm>
    <url>git@github.com:crispywalrus/linx.git</url>
    <connection>scm:git:git@github.com:crispywalrus/linx.git</connection>
  </scm>
  <developers>
    <developer>
      <id>jteigen</id>
      <name>Jon-Anders Teigen</name>
      <url>http://jteigen.com</url>
    </developer>
    <developer>
      <id>crispywalrus</id>
      <name>Chris Vale</name>
    </developer>
  </developers>)
