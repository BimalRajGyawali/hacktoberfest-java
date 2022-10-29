import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class Solution {
	public List<int[]> getSkyline(int[][] buildings) {
		TreeMap<Integer, Integer> availableHeights = new TreeMap<>();
		List<int[]> view = new ArrayList<>(buildings.length);
		int N = buildings.length;
		if (N == 0) {
			return view;
		}
		Event[] events = new Event[N << 1];
		for (int i = 0; i < N; ++i) {
			int[] building = buildings[i];
			events[i << 1] = new Event(building[0], building[2], false);
			events[1 + (i << 1)] = new Event(building[1], building[2], true);
		}
		Arrays.sort(events);
		int currentHeight = 0;
		availableHeights.put(0, 1);
		for (int i = 0, j; i < N << 1; i = j) {
			for (j = i; j < N << 1 && events[i].x == events[j].x; ++j) {
				Event event = events[j];
				if (event.closing) {
					int counter = availableHeights.get(event.height);
					if (counter == 1) {
						availableHeights.remove(event.height);
					} else {
						availableHeights.put(event.height, counter - 1);
					}
				} else {
					Integer counter = availableHeights.get(event.height);
					if (counter == null) {
						availableHeights.put(event.height, 1);
					} else {
						availableHeights.put(event.height, counter + 1);
					}
				}
			}
			int x = events[i].x;
			int height = availableHeights.lastKey();
			if (height != currentHeight) {
				view.add(new int[] { x, height });
				currentHeight = height;
			}
		}
		return view;
	}
}

class Event implements Comparable<Event> {
	int x, height;
	boolean closing;

	public Event(int a, int b, boolean c) {
		x = a;
		height = b;
		closing = c;
	}

	@Override
	public int compareTo(Event that) {
		return x != that.x ? x - that.x : Boolean.compare(closing, that.closing);
	}
}
