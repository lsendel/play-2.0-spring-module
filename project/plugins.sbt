resolvers ++= Seq(
  DefaultMavenRepository,
  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
  "Typesafe Other Repository" at "http://repo.typesafe.com/typesafe/repo/"
)

addSbtPlugin("play" % "sbt-plugin" % "2.1.0")

// Comment to get more information during initialization
logLevel := Level.Warn
