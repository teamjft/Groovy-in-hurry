#Sheldon-PC

#It will compile Fibonacci script code to two classes
# -d provides the path where generated classes will be stored
echo "Compiling the groovy files in \"classes\" folder"

groovyc -d classes DemoOverrideOperator.groovy

java -cp $GROOVY_HOME/lib/*:classes DemoOverrideOperator


