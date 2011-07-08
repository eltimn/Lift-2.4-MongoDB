Basic Lift Template using SBT 0.10.x
====================================
This is a simple port of the [lift_basic](https://github.com/lift/lift_24_sbt/tree/master/scala_29/lift_basic) template to [sbt 0.10.x](https://github.com/harrah/xsbt/wiki/Setup).  The port includes the [xsbt-web-plugin](https://github.com/siasia/xsbt-web-plugin) with Jetty 6.1.22. Because I use JRebel, `jettyScanDirs := Nil`.

Outstanding Issues
------------------
1. The tests don't yet run... not sure why yet.

Run
---
Download and setup SBT 0.10.0, then

	$ git clone git://github.com/arcticpenguin/lift_basic_2.4-M2_sbt_0.10.0.git
	$ cd lift_basic_2.4-M2_sbt_0.10.0.git
	$ sbt
	> update
	> jetty-run



