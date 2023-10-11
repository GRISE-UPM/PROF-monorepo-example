package es.upm.grise.prof.pipelines;

import static org.junit.Assert.*;

import org.junit.Test;

public class JavaClassThatUsesQuicksortTest {

	@Test
	public void quicksortWorksInArrayWithIntegerValues() {

		int [] oldarr = {3, 1, 6, 4, 9, 8};
		int [] newarr = oldarr;
		int low = 0;
		int high = oldarr.length - 1;
		
		Quicksort.INSTANCE.quicksort(newarr, low, high);
		assertArrayEquals(oldarr, newarr);
		
	}

}
