package aufgabe4;

public class TestDrivenDevelopment {
	
	public static int singleNumber(int[] nums) 
	{
		if (nums.length == 1)
		{
		return nums[0];
		}
		else
		{
			//Array wird sortiert
			for (int i = nums.length-1; i >=0; i--)
			{
				for (int j=0; j<i; j++)
				{
					if (nums[j] > nums[j+1])
					{
						int change = nums[j];
						nums[j] = nums[j+1];
						nums[j+1] = change;
					}
				}
			}
			
			// prüfen welchen Wert es nur 1 mal gibt
			
			for (int p=0; p<nums.length-1; p= p+2)
			{
				if (nums[p]!= nums[p+1])
				{
					return nums[p];
				}
			}
			return nums[nums.length-1];
		}
	}

	//public static void main(String[] args) 
	

}
