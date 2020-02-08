package project;

public class Main_class {

	public String display(int low, int high, New_year_gift gif1[], New_year_gift gif2[]) {
		int k = 0, i, j;
		String s="";
		New_year_gift gif3[] = new New_year_gift[10];
		New_year_gift ob;
		for (i = 0; i < 3; i++) {
			if (gif1[i].weigh >= low && gif1[i].weigh <= high) {
				gif3[k++] = gif1[i];
			}
		}
		for (i = 0; i < 3; i++) {
			if (gif2[i].weigh >= low && gif2[i].weigh <= high) {
				gif3[k++] = gif2[i];
			}
		}
		for (i = 0; i < k; i++) {
			for (j = 0; j < k - 1; j++) {
				if (gif3[j].weigh > gif3[j + 1].weigh) {
					ob = gif3[j];
					gif3[j] = gif3[j + 1];
					gif3[j + 1] = ob;
				}
			}
		}
		for(i=0;i<k;i++)
		{
			s=s+gif3[i].nm+" ";
		}
		return s;
	}
}
