# Algorithms, Part I #

These are the assignments (not the solutions!) from the _Coursera Class Algorithms, Part 1_ by Kevin Wayne and Robert Sedgewick.

I bundled them up in Maven projects, added tests and configured [checkstyle](http://checkstyle.sourceforge.net/) and [findbugs](http://findbugs.sourceforge.net/) to comply with the course rules.

You can **test your code** with

	mvn clean test

create **checkstyle and findbugs** reports with

	mvn clean compile site

and have a look at them by opening them in a browser

	# `open` is only available on OS X,
	# try `xdg-open` on other Linux distributions
	open target/site/project-reports.html

**create submission package** with

	mvn clean package

and find them in `target` directory.

## Troubleshooting ##

### Java Default Package vs. Named Packages ###

As stated in [this thread](https://class.coursera.org/algs4partI-004/forum/thread?thread_id=47) every class you create should live in the default package.

> The key lesson of this post is that you should not name a package in your source, but leave everything in the default package by not naming one.

## Copyright ##

These projects import two libraries: [stdlib](http://introcs.cs.princeton.edu/java/stdlib/) and [algs4](http://algs4.cs.princeton.edu/code/). Both are provided for this course, and are copyright © 2002–2014 Robert Sedgewick and Kevin Wayne.

THe import is done via a [third party Maven repository](https://github.com/slok/algs4-mvn-repo) created for the Coursera course by slok.