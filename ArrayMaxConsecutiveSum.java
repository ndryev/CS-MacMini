/*
Given array of integers, find the maximal possible sum of some of its k consecutive elements.
 */
public class ArrayMaxConsecutiveSum {
    public static void main(String[] args) {
        int[] inputArray = {2, 3, 5, 1, 6};
        int k = 2;

        int maxSum = 0;
        int currSum = 0;

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i; j < i+k; j++) {
                if(j == inputArray.length)
                    break;
                else
                    currSum += inputArray[j];
            }

            maxSum = Math.max(currSum, maxSum);
            currSum = 0;
        }
        System.out.println(maxSum);
    }
}
/*
alts:

int solution(int[] inputArray, int k) {
    int largestSum = 0, currSum = 0;
    // use a for loop with an elegant algorithm to avoid nested-loops
    for (int i = 0; i < inputArray.length; i++) {
        if ((i - k) >= 0) currSum -= inputArray[i - k]; // start deleting unnecessary elements
        currSum += inputArray[i]; // add the element to be added
        if (currSum > largestSum) largestSum = currSum; // check for the largest sum
    }
    return largestSum;
}
***
int solution(int[] a, int k) {
    ArrayList l = new ArrayList();
    for (int i = 0; i < a.length - k + 1; i++) {
        int s = 0;
        for (int j = i; j < k + i; j++) {
            s += a[j];}
        l.add(s);}
    return (int) Collections.max(l);}
***
int solution(int[] inputArray, int k) {
    int max = inputArray[0];
    for (int i = 0; i <= inputArray.length - k; i++) {
        int sum = 0;
        for (int j = 0; j < k; j++)
             sum += inputArray[i + j];

        if (max < sum) max = sum;
    }

    return max;
}
***
int solution(int[] array, int k)
{
    List<Integer> sums = new ArrayList<>();
        int sum = 0;

        for(int i = 0; i < array.length - k+ 1; i++){
            for (int j = 0; j < k; j++) {
                sum += array[i+j];
            }
            sums.add(sum);
            sum = 0;
        }
        return sums.stream().max(Integer::compareTo).get();
}

***
 */
