#!/bin/bash
for filename in entradas/*.txt; do
    java -classpath /usr/lib/jvm/java-8-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -classpath /home/jack/PL/Programming-language-translator/Translator/bin:/home/jack/java-cup-bin-11b-20160615/java-cup-11b-runtime.jar:/home/jack/java-cup-bin-11b-20160615/java-cup-11b.jar procesadores.Parser "$filename"
done
