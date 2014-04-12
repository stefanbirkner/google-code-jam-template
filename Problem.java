import java.util.*;

public class Problem {
	public static void main(String... args) {
		Locale.setDefault(Locale.ENGLISH);
		for (DataSet dataSet : new DataSets())
			handleDataSet(dataSet);
	}


	private static void handleDataSet(DataSet dataSet) {
		System.out.println(
			"Case #" + dataSet.number + ": " + dataSet.getResult());
	}

	public static class DataSet {
		public long number;

		public String getResult() {
			//calculate result
			return "your result";		
		}
	}

	public static class DataSets implements Iterable<DataSet> {
		public Iterator<DataSet> iterator() {
			return new DataSetsIterator();
		}		
	}

	public static class DataSetsIterator implements Iterator<DataSet> {
		private final long numberOfDataSets;
		private final Scanner sc;
		private long indexOfCurrentDataSet; //zero based

		public DataSetsIterator() {
			sc = new Scanner(System.in);
			numberOfDataSets = sc.nextLong();
			nextLine();
			indexOfCurrentDataSet = 0;
		}

		public boolean hasNext() {
			return indexOfCurrentDataSet < numberOfDataSets;
		}

		public DataSet next() {
			DataSet dataSet = new DataSet();
			dataSet.number = ++indexOfCurrentDataSet;
			return dataSet;
		}

		private void nextLine() {
			sc.nextLine();
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
}
