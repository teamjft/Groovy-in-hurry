#Sheldon-PC

#It will compile Fibonacci script code to two classes
# -d provides the path where generated classes will be stored
echo "Compiling the groovy files in \"classes\" folder"

groovyc -d classes Fibonacci.groovy

#Fibonacci.class                    :     groovy.lang.Script      Contains a main method that can be run the java command.
#Fibonacci$_run_closure1.class      :     groovy.lang.Closure     Captures what has to be done 10 times. You can safely ignore it.

# Run the main() method of Fibonacci class
echo "Run groovy gernerated class \"Fibonacci\""

java -cp $GROOVY_HOME/lib/*:classes Fibonacci



echo "Compiling the java file in \"classes\" folder"
javac -d classes -cp $GROOVY_HOME/lib/*:classes HelloWorld.java
echo "Run HelloWorld class"
java -cp $GROOVY_HOME/lib/*:classes HelloWorld 10
