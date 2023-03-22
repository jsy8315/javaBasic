package com.javaApplication12;

public interface Counter {
	int count();
}

class UpCounter implements Counter {
	int count = 0;
	
	@Override
	public int count() {
		count ++;
		return count;
	}
}
class DownCounter implements Counter {
	int count = 0;
	
	@Override
	public int count() {
		count --;
		return count;
	}
}

public class DependencyMain (Counter counter) {
		this.counter = count;
	}
	
	public static void main(String[] args) {
		DependencyMain main = new DependencyMain(new DownCounter());
	}
	
	public void count() {
		counter.count();
	}
}
