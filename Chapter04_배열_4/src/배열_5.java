/*
 *    40 30 10 50 20 ==> ASC
 *    -- --
 *    30 40
 *       -- --
 *       10 40
 *          -- --
 *          40 50
 *             -- --
 *             20 50(고정)   0-4
 *    -------------------
 *    30 10 40 20 50
 *                고정
 *    -- --
 *    10 30
 *       -- --
 *       30 40
 *          -- --
 *          20 40(고정)      1-3
 *    -------------------  
 *    10 30 20 40 50
 *             고  정
 *    -- --
 *    10 30
 *       -- --
 *       20 30(고정)         2-3
 *    -------------------
 *    10 20 30 40 50
 *          고     정
 *    -- --
 *    10 20                 3-1
 *    -------------------
 *    10 20 30 40 50
 *    
 *    i   j
 *    0   4
 *    1   3
 *    2   2
 *    3   1 ==> j=4(length-1)-i
 */
/*
 *  => 관련된 종류의 데이터 3개 이상인 경우
 *  => 선언 => 초기값
 *           -----
 *             |
 *           1) 명시적
 *           2) new
 *              ---
 *               |
 *               자동초기화
 *               int => 0
 *               double => 0.0
 *               char => 
 *               String => null
 */

import java.util.Arrays;

public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		//초기화
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			
		}
		System.out.println(" ========== 정렬전 ==========");
		System.out.println(Arrays.toString(arr));
		
		//System.out.println(" ========== 정렬후 ==========");	
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.println("  ========= "+(i+1)+"Round =========");
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(" ========== 정렬후 ==========");
		System.out.println(Arrays.toString(arr));
	}

}
