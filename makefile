#Java MakeFile

JFLAGS = -g -Xlint
JC = javac
J = java

.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.$(J)

CLASSES = \
	DVD.java \
	Book.java \
	LibraryItem.java \
	Library.java \
	Cone.java \
	Driver.java 

default: classes

classes: $(CLASSES:.java=.class)

run:
	$(J) Driver

clean:
	$(RM) *.class
	$(RM) *~