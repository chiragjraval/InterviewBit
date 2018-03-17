package com.chirag.ib.heapmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DistinctNumberInWindow {

	public ArrayList<Integer> dNums(List<Integer> A, int B) {
		List<Integer> input = A;
		int K = B;
		int N = input.size();
		
		Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>(N-K+1);
		
		if(K > N) {
			return result;
		}
		else {
			//Build Initial Map
			for(int i=0; i<K; i++) {
				addToFrequencyMap(frequencyMap, input.get(i));
			}
			
			for(int i=K; i<N; i++) {
				result.add(frequencyMap.size());
				removeFromFrequencyMap(frequencyMap, input.get(i-K));
				addToFrequencyMap(frequencyMap, input.get(i));
			}
			
			result.add(frequencyMap.size());
		}
		
		return result;
    }
	
	private void addToFrequencyMap(Map<Integer, Integer> frequencyMap, Integer newElement) {
		if(frequencyMap.containsKey(newElement))
			frequencyMap.put(newElement, frequencyMap.get(newElement) + 1);
		else
			frequencyMap.put(newElement, 1);
	}
	
	private void removeFromFrequencyMap(Map<Integer, Integer> frequencyMap, Integer oldElement) {
		frequencyMap.put(oldElement, frequencyMap.get(oldElement) - 1);
		
		if(frequencyMap.get(oldElement).equals(0))
			frequencyMap.remove(oldElement);
	}
}
