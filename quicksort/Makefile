# Macros
CC = gcc
CFLAGS = -c -std=c99 -fPIC -Wall
LFLAGS = -shared

# If no rules are given, the first rule is executed by make. Traditionally, the name is all, but that is not required. 
all: quicksort.so

quicksort.so: quicksort.o
	$(CC) $(LFLAGS) -o $@ quicksort.o

# $@ is replaced by the target name

# Rules have a fixed structure:

#target: prerequisites
#\t      recipe (set of commands)

quicksort.o: quicksort.c
	$(CC) $(CFLAGS) quicksort.c

# Wilcarrds are used extensively
# %.o: %.c
#	$(CC) $(CFLAGS) $<

# $< is replaced by the first prerequisite. Use $^ if you want to retrieve all prerequisites. See https://www.gnu.org/software/make/manual/html_node/Automatic-Variables.html#Automatic-Variables for reference

#PHONY target (no prerequisites)
clean:
	rm *.o
	rm *.so
