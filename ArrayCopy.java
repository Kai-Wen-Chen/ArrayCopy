package arrayCopy;

public class ArrayCopy {
	public static void main(String[] args){
		int array[] = {1,2,3,4,5,6};
		int hold[] = {10,9,8,7,6,5,4,3,2,1};
		System.arraycopy(array, 0, hold, 0, array.length);
		//(srcArray, srcStartPos, dstArray, dstStartPos, srcCopyLength)
		//in this case, hold = {1,2,3,4,5,6,4,3,2,1}
		for (int i : hold){
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
