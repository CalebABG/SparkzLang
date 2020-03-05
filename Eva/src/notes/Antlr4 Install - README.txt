///////////////////////////////////////////////////
////    Setting up ANTLR4 on Windows:          ////
///////////////////////////////////////////////////

------------------------------------------------------------------
Download ANTLR4 from: http://www.antlr.org/
Create a 'Javalib' folder in 'C:/' drive, or location of choosing
Then copy the antlr4 jar file to the 'Javalib' folder

Now you'll need to set up or edit the CLASSPATH and PATH environment variables:
Open up your environment variables, and under the User variables you'll need to add the path,
of the 'C:/Javalib' or path you chose, to the CLASSPATH variable (if you don't have the CLASSPATH variable, create it

Next, you'll need to add the com.antlr4_gen JDK bin and com.antlr4_gen JRE bin folders to your PATH variable
Under the System variables, add the path to the JRE and JDK; ex. my paths:
JRE path: C:\Program Files (x86)\com.antlr4_gen\jre1.8.0_161\bin
JDK: path: C:\Program Files (x86)\com.antlr4_gen\jdk1.8.0_161\bin

Lastly, you'll need to create antlr4.bat and grun.bat files(executables and aliases for running antlr4 and testing grammars)
In the 'Javalib' folder, create two files, 1. antlr4.bat. 2. grun.bat
Open the antlr4.bat, and paste in: java org.antlr.v4.Tool %*
Then save the file.

Open the grun.bat, and paste in: java org.antlr.v4.gui.TestRig %*
Then save the file.

Congrats, you've got antlr4 installed and ready to go on Windows
------------------------------------------------------------------

///////////////////////////////////////////////////
////       Setting up ANTLR4 on OS X:          ////
///////////////////////////////////////////////////

------------------------------------------------------------------
$ cd /usr/local/lib
$ sudo curl -O https://www.antlr.org/download/antlr-4.7.1-complete.jar
$ export CLASSPATH=".:/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH"
$ alias antlr4='java -jar /usr/local/lib/antlr-4.7.1-complete.jar'
$ alias grun='java org.antlr.v4.gui.TestRig'
------------------------------------------------------------------


///////////////////////////////////////////////////
////       Setting up ANTLR4 on Linux:        ////
///////////////////////////////////////////////////

------------------------------------------------------------------
$ cd /usr/local/lib
$ wget https://www.antlr.org/download/antlr-4.7.1-complete.jar
$ export CLASSPATH=".:/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH"
$ alias antlr4='java -jar /usr/local/lib/antlr-4.7.1-complete.jar'
$ alias grun='java org.antlr.v4.gui.TestRig'
------------------------------------------------------------------