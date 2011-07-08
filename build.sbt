organization := "Lift"

name := "Lift SBT Template"

version := "0.1"

scalaVersion := "2.9.0-1"

retrieveManaged := false

logLevel := Level.Warn

jettyScanDirs := Nil

seq(WebPlugin.webSettings :_*)

libraryDependencies ++= {
  val liftVersion = "2.4-M2"
  Seq(
	"net.liftweb" %% "lift-webkit" % liftVersion % "compile->default",
   "net.liftweb" %% "lift-mongodb" % liftVersion % "compile->default",
    "net.liftweb" %% "lift-mongodb-record" % liftVersion % "compile->default",
    "org.mortbay.jetty" % "jetty" % "6.1.22" % "jetty",
    "junit" % "junit" % "4.5" % "test->default",
    "ch.qos.logback" % "logback-classic" % "0.9.26",
    "org.scala-tools.testing" %% "specs" % "1.6.8" % "test->default",
    "com.h2database" % "h2" % "1.2.138"
  )
}

resolvers += "Jetty Repo" at "http://repo1.maven.org/maven2/org/mortbay/jetty"

libraryDependencies += "org.mortbay.jetty" % "jetty" % "6.1.22" % "test->default"

