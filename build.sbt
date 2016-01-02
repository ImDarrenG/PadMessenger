name := "PadMessenger"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  "com.twitter" %% "finatra" % "1.6.0",
  "com.github.mauricio" %% "postgresql-async" % "0.2.15",
  "com.github.nscala-time" %% "nscala-time" % "1.8.0",
  "com.jason-goodwin" %% "authentikat-jwt" % "0.4.1",
  "com.websudos" %% "phantom-dsl" % "1.7.0"
)

resolvers +=
  "Twitter" at "http://maven.twttr.com"

resolvers +=
  "Websudos releases" at "http://maven.websudos.co.uk/ext-release-local"

resolvers ++= Seq("snapshots", "releases").map(Resolver.sonatypeRepo)

resolvers ++= Seq(
 "Typesafe repository snapshots" at "http://repo.typesafe.com/typesafe/snapshots/",
  "Typesafe repository releases" at "http://repo.typesafe.com/typesafe/releases/",
  "Sonatype repo"                    at "https://oss.sonatype.org/content/groups/scala-tools/",
  "Sonatype releases"                at "https://oss.sonatype.org/content/repositories/releases",
  "Sonatype snapshots"               at "https://oss.sonatype.org/content/repositories/snapshots",
  "Sonatype staging"                 at "http://oss.sonatype.org/content/repositories/staging",
  "Java.net Maven2 Repository"       at "http://download.java.net/maven/2/",
  "Websudos releases"                at "http://maven.websudos.co.uk/ext-release-local"
)