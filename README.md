exo-skeleton
============

Generic Ant build system.  This Project can be dropped into any Java project for a full build system with ivy dependencies, unit tests and static code analysis tools all ready to go.
Or better yet always use this as your project skeleton before you start a project.  Remove HelloWorld.java and its test and start writing your code!

Developing Cethrepoh in my spare time at home I started using Maven as it was an easy start in eclipse but always wanted to move it to an apache ant+ivy solution.  I realised when doing it that I end up doing this all the time with every Java build I do and it's so generic that I might as well make it wasy for myself and create an ant+ivy template.

So here it is, it uses the Maven Project Structure for a Java project by default.  To use it drop these files into your project and type *ant*.

Im still developing this and theres loads to do so please let me know about any requests or just fork :)

Released under BSD 3-Clause Licence.

Dependencies
------------
You will require apache ivy and ant contrib as well as ant and Java available on your system.
Please refer to there manuals for building.

Manual
============
Getting started:
------------
Clone this project somewhere, and remove the .git folder.
Type ant to see it work.
Add your own source to the project and build away.
Just type 'ant' in the root directory.

Please see the apache ivy documentation for how it does dependency management.
Please see the apache ant documentation if you need to modify the build.xml file.

Common things to update:
------------
Change the project name right at the top of your build.xml to the name of your project.

Modify the build.properties file to modify the group/artifact and verison of your project.

Add the projects into ivy.xml of any dependencies that you code against there API.

When loading in eclipse its a good idea when adding the ivyDE dependencies to not select 'all' and remove the code analysis dependencies from your classpath.  Just like if you were building from ant.



