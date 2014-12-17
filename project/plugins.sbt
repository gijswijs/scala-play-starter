resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.3.4")

resolvers += "Sonatype OSS Releases" at "https://oss.sonatype.org/content/repositories/releases"

// The SASS plugin
addSbtPlugin("net.litola" % "play-sass" % "0.4.0")
