import java.util.Arrays;
/*
Given array of integers, remove each kth element from it.
Example: For inputArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] and k = 3,
the output should be extractEachKth(inputArray, k) = [1, 2, 4, 5, 7, 8, 10].
 */
public class ExtractEachKth {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 2;
        System.out.println(Arrays.toString(extractEachKth(inputArray, k)));
    }
    public static int[] extractEachKth(int[] inputArray, int k) {
        int size = inputArray.length;
        int[] newArray = new int [size - size / k];
        int specialK = 0;
        for (int i = 0; i < size; i++){
            if((i + 1) % k != 0){
                newArray[specialK++] = inputArray[i];
//              specialK++;
            }
        }
        return newArray;
    }
}

/*
alts:

***

int[] solution(int[] inputArray, int k) {
    return IntStream.range(0, inputArray.length).filter(i -> ((i + 1) % k) != 0).map(i -> inputArray[i]).toArray();
}

***

int[] solution(int[] inputArray, int k) {
    return IntStream.range(0, inputArray.length)
        .filter(i -> (i+1)%k != 0)
        .map(i -> inputArray[i])
        .toArray();
}

***

Integer[] solution(int[] a, int k) {
		ArrayList<Integer> result=new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			if((i+1)%k==0)continue;
			result.add(a[i]);
		}
		return result.toArray(new Integer[result.size()]);
}
***

int[] solution(int[] inputArray, int k) {
    int[] cleared = new int[inputArray.length - inputArray.length / k];
    int counter = 0;
    for (int i = 1; i <= inputArray.length; i++)
        if (i % k != 0)
            cleared[counter++] = inputArray[i - 1];

    return cleared;
}

***
 */