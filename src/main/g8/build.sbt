import sbt.Keys.javacOptions

lazy val root = (project in file(".")).settings(
  name := "$name$",
  version := "$version$",
  scalaVersion := "$scala_version$",
  mainClass := Some("src.scala.$organization$.$job$"),
  javacOptions ++= Seq("-source", "11", "-target", "11")
)

val jarName = "$name$-$version$.jar"
val flinkVersion = "1.18.1"
val msfRuntimeVersion = "1.2.0"
val connectorVersion = "4.2.0-1.18"

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-kinesisanalytics-runtime" % msfRuntimeVersion,
  "org.apache.flink" % "flink-connector-kinesis" % connectorVersion,
  "org.apache.flink" % "flink-streaming-java" % flinkVersion % "provided",
  "org.apache.flink" % "flink-connector-base" % flinkVersion % "provided"
)

artifactName := { (_: ScalaVersion, _: ModuleID, _: Artifact) => jarName }

assembly / assemblyJarName := jarName
assembly / assemblyMergeStrategy := {
  case PathList("META-INF", _*) => MergeStrategy.discard
  case _                        => MergeStrategy.first
}
