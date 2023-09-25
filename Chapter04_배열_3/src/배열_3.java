import java.util.*;
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		         //100 200 300
		//int[] arr2=arr.clone();//arr의 메모리에 있는 모든 내용을 copy해서 새로운 메모리에 저장
		System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(arr2));
		System.out.println("arr="+arr);      //┐
		//System.out.println("arr2="+arr2);  //┘ arr,arr2 둘은 주소다름
		// 깊은복사 
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		int[] arr2=arr.clone();         //clone쓰는 위치에 따라 다름
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));   //주소 다르니까 arr값 바꿔도 arr2는 변화 없음
		//clone => prototype
		
	}

}

//import java.util.*;
//public class 배열_3 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] arr= {10,20,30,40,50};
//		         //100 200 300
//		//int[] arr2=arr.clone();//arr의 메모리에 있는 모든 내용을 copy해서 새로운 메모리에 저장
//		System.out.println(Arrays.toString(arr));
//		//System.out.println(Arrays.toString(arr2));
//		System.out.println("arr="+arr);    //┐
//		//System.out.println("arr2="+arr2);  //┘ arr,arr2 둘은 주소다름
//		// 깊은복사 
//		arr[0]=100;
//		arr[1]=200;
//		arr[2]=300;
//		int[] arr2=arr.clone();
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(arr2));   //주소 다르니까 arr값 바꿔도 arr2는 변화 없음
//	}
//
//}
