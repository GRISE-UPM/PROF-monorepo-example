package es.upm.grise.prof.pipelines;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface Quicksort extends Library { 
	Quicksort INSTANCE = Native.load(
			System.getProperty("user.dir") + "/lib/quicksort.so", 
			Quicksort.class);
	
    void quicksort(int [] arr, int low, int high);
}