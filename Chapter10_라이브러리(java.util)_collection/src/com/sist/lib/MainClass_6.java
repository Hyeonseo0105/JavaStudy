package com.sist.lib;
// 멜론:곡명  ,  지니뮤직:곡명 => 중복이 안된 노래만 추출
// 공통 / 차집합 / 교집합 / 합집합
import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MainClass_6 {
	public static Set<String> genieMusic()
	{
		Set<String> set=new HashSet<String>();
		try
		{
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title=doc.select("table.list-wrap a.title");
			for(int i=0;i<title.size();i++)
			{
				set.add(title.get(i).text());
			}
			
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return set;
	}
	
	public static Set<String> melonMusic()
	{
		Set<String> set=new HashSet<String>();
		try
		{
			Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			Elements title=doc.select("div.wrap_song_info div.rank01 a");
			for(int i=0;i<title.size();i++)
			{
				set.add(title.get(i).text());
			}
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return set;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============= Genie Music =============");
		Set<String> genie=genieMusic();
		for(String title:genie)
		{
			System.out.println(title);
		}
		System.out.println("============= Melon Music =============");
		Set<String> melon=melonMusic();
		for(String title:melon)
		{
			System.out.println(title);
		}
//		System.out.println("========== Genie에만 있는 노래 ==========");
//		//차집합 => removeAll()  =>  MINUS(오라클)
//		//[1,2,3,4,5]-[1,2,3,6,7] = [4,5]
//		genie.removeAll(melon);
//		for(String title:genie)
//		{
//			System.out.println(title);
//		}
		
		//교집합 => retainAll()
//		System.out.println("======= Genie와 melon의 동일한 노래 =======");
//		genie.retainAll(melon);
//		System.out.println("곡수:"+genie.size());
//		for(String title:genie)
//		{
//			System.out.println(title);
//		}
		
		
		// 장바구니 => 동일상품 관계없이 처리  ==>  List
		
		System.out.println("======== Genie와 melon의 모든 노래 ========");
		List<String> list=new ArrayList<String>();    //list:중복허용   set:중복제거
		list.addAll(genie);
		list.addAll(melon);   //데이터값 전체 추가 addAll
		// UNION ALL
		System.out.println("곡 갯수:"+list.size());
		for(String title:list)
		{
			System.out.println(title);
		}
		
		System.out.println("================ 합집합 ====================");
		// UNION
		Set<String> hap=new HashSet<String>();
		hap.addAll(genie);
		hap.addAll(melon);
		System.out.println("곡 갯수:"+hap.size());
		for(String title:hap)
		{
			System.out.println(title);
		}
	}

}
