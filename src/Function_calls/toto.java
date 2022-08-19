package Function_calls;

public class toto {
	public int fTotal(int[] nums) {
		int total =0;
		for(int i=0;i<nums.length;i++) {
			total=total+nums[i];
		}

		return total;
	}
}
