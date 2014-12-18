name := "prismicio-starter"

version := "1.2"

scalaVersion := "2.11.1"

libraryDependencies += "io.prismic" %% "scala-kit" % "1.2.12"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

sassOptions in Assets ++= Seq("--compass", "-r", "compass")

TaskKey[Unit]("show-user-dir") := println(sys.props("user.dir"))