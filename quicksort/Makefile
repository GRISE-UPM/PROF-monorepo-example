# Macros
CC = gcc
CFLAGS = -c -std=c99 -fPIC -Wall
LFLAGS = -shared

# The first rule is executed by make if no rules are given. Traditionally, the name is all, but that is not required. The following rule is actually unnecessary
all: quicksort.so

quicksort.so: quicksort.o
	$(CC) $(LFLAGS) -o $@ quicksort.o

# $@ is replaced by the target name

# Rules have a given structure
#target      #prerequisites
quicksort.o: quicksort.c
#tab    #recipe (set of commands)
	$(CC) $(CFLAGS) quicksort.c

#The timestamp of the target and prerequisites are compared. When they differ, the build is launched


# %.o: %.c
#	$(CC) $(CFLAGS) $<

# $< is replaced by the first prerequisite. Use $^ if you want to retrieve all prerequisites. See https://www.gnu.org/software/make/manual/html_node/Automatic-Variables.html#Automatic-Variables for reference

#PHONY target (no prerequisites)
clean:
	rm *.o
	rm *.so
