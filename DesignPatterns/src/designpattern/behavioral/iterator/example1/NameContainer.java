package designpattern.behavioral.iterator.example1;

public class NameContainer implements Container {

	// private MyIterator iterator;
	private String[] names;

	public NameContainer() {
		super();
		String[] nm = { "ram", "shyam", "jadu", "madhu" };
		names = nm;
	}

	@Override
	public MyIterator getIterator() {
		return new MyIterator() {
			
			int index = 0;

			@Override
			public boolean hasNext() {
				if (names.length > index) {
					index++;
					return true;
				} else {
					return false;
				}
			}

			@Override
			public String next() {
				return names[index - 1];
			}
		};
	}

	/*private class NameIterator implements MyIterator {

		int index = 0;

		@Override
		public boolean hasNext() {
			if (names.length > index) {
				index++;
				return true;
			} else {
				return false;
			}
		}

		@Override
		public String next() {
			return names[index - 1];
		}

	}*/
}
