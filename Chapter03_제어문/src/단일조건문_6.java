/* 책 p.54
 *   형식)
 *    if(조건문)
 *    {
 *    	조건문이 true일때 실행하는 문장
 *      ----(true/false)
 *          ------------
 *           비교연산자, 논리연산자, 부정연산자
 *    }
 *    
 *    단일 조건문 : 독립수행
 *              ------- if문이 한개문장으로 사용
 *       
 * 책 p.55 : 중첩 if
 *     형식)
 *     if(조건문) ===> if(조건문 && 조건문)
 *     {
 *     	if(조건문)
 *     	{
 *     	}
 *     }
 */
public class 단일조건문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//가위 바위 보
		int com=(int)(Math.random()*3);
//		System.out.println("com:"+com);
		if(com==0)
			System.out.println("가위");
		if(com==1)
			System.out.println("바위");
		if(com==2)
			System.out.println("보");
	}

}
