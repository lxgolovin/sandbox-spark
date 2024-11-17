name := "sandbox-spark"

version := "0.1"

scalaVersion := "2.13.6"

lazy val sparkVersion = "3.5.3"
lazy val logbackVersion = "1.5.3"

libraryDependencies += "org.projectlombok" % "lombok" % "1.18.36" % "provided"
libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.9"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % "test"

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % logbackVersion % Test,
  "ch.qos.logback" % "logback-core" % logbackVersion)

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion
)