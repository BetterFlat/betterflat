name := """BetterFlat"""
organization := "de.betterflat"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.6"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.0-M1" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "de.betterflat.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "de.betterflat.binders._"
