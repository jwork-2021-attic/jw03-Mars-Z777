package example;

public class QuickSorter implements Sorter {

	private int[] a;
	private String plan = "";
	
	private void swap(int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
		plan += "" + a[i] + "<->" + a[j] + "\n";
	}
	
	private void sortHelper(int left, int right) {
		if(left >= right) return;
		int i = left, j = right, key = a[i];
		while(i < j) {
			while(i < j && a[j] >= key)
				j--;
			if(i < j) {
				swap(i, j);
				i++;
			}
			while(i < j && a[i] <= key)
				i++;
			if(i < j) {
				swap(i, j);
				j--;
			}
		}
		a[i] = key;
		sortHelper(left, i - 1);
		sortHelper(i + 1, right);
	}
	
	@Override
	public void load(int[] content) {
		a = content;
	}

	@Override
	public void sort() {
		int len = a.length;
		sortHelper(0, len - 1);
	}

	@Override
	public String getPlan() {
		return plan;
	}

}
