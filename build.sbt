
ReleaseKeys.publishArtifactsAction := PgpKeys.publishSigned.value

name := "linx"

organization := "net.crispywalrus"

scalaVersion := "2.11.4"

description := "A simple and typesafe link representation"

javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

libraryDependencies ++= Seq(
  "com.novocode" % "junit-interface" % "0.11" % Test,
  "junit" % "junit" % "4.11" % Test
)

licenses := Seq("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0"))

publishArtifact in Test := false

publishMavenStyle := true

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
