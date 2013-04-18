import sbt._
import Keys._

object Build extends sbt.Build {

  // publishTo := Some(Resolver.file("file", new File(Path.userHome.absolutePath+"/.m2/repository")))
  // credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

  val appName = "spring-module"
  val appVersion = "1.1-SNAPSHOT"

  val springVersion = "3.0.7.RELEASE"
  val springPackage = "org.springframework"

  val appDependencies = {
    Seq(
      springPackage % "spring-context" % springVersion,
      springPackage % "spring-core" % springVersion,
      springPackage % "spring-beans" % springVersion
    )
  }

  val main = play.Project(appName, appVersion, appDependencies).settings(organization := "play")

}
