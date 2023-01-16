package RemoveDuplicate;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int a[] = { 1, 1, 2, 2, 2 };
        int n = a.length;
		int[] temp = new int[n];
        int j = 0;
 
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }
 
        temp[j++] = a[n - 1];
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
        
        System.out.println(Arrays.toString(temp));
 
	}

}
