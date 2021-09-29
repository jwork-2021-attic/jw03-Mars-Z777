package example;

public class ChooseSorter implements Sorter {

	private int a[];
	private String plan = "";
	
	private void swap(int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
		plan += "" + a[i] + "<->" + a[j] + "\n";
	}
	
	private int maxIndex(int size) {
		if(size == 1) return 0;
		int res = 0;
		for(int i = 1; i < size; i++) {
			if(a[i] > a[res])
				res = i;
		}
		return res;
	}
	
	@Override
	public void load(int[] content) {
		a = content;
	}

	@Override
	public void sort() {
		int len = a.length;
		while(len > 1) {
			int mIndex = maxIndex(len);
			len--;
			if(mIndex != len)
				swap(mIndex, len);
		}
	}

	@Override
	public String getPlan() {
		return plan;
	}

}
