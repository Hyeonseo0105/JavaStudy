package com.sist.client;
import java.awt.CardLayout;

import javax.swing.*;
public class ControllPanel extends JPanel{
	public HomePanel hp;
	//public SearchPanel sp=new SearchPanel();
	public ChatPanel cp=new ChatPanel();
	public BoardListPanel blp;
	public NewsPanel np=new NewsPanel();
	public BoardInsertPanel bip;
	public BoardDetailPanel bdp;
	public BoardDeletePanel bdel;
	public BoardUpdatePanel bup;
	public FoodCategoryListPanel fcp;
	public FoodDetailPanel fdp;
	public CardLayout card=new CardLayout();
	public FoodFindPanel ffp;
	// MVC  C(Controller) ==> 해당클래스를 찾아서 처리 -> 화면이동
	//      V(View) ==> 화면 UI => ~Panel  (프론트)
	//      M(Manager) ==>                (백)
	public ControllPanel()
	{
		hp=new HomePanel(this);
		blp=new BoardListPanel(this);    //화면 이동   // 현재 떠있는 창으로 이동 => 생성자,this
		bip=new BoardInsertPanel(this);
		bdp=new BoardDetailPanel(this);  //자체에서 이동
		bdel=new BoardDeletePanel(this);
		bup=new BoardUpdatePanel(this);
		fcp=new FoodCategoryListPanel(this);
		fdp=new FoodDetailPanel(this);
		ffp=new FoodFindPanel(this);
		setLayout(card);
		add("home",hp);
		//add("search",sp);
		add("chat",cp);
		add("board",blp);
		add("news",np);
		add("insert",bip);
		add("detail",bdp);  //화면이동
		add("delete",bdel);
		add("update",bup);
		// Spring/Spring-Boot => @RequestMappin("")   =>  "update.jsp"
		// NodeJS => app.get("")  =>  "update"a
		add("catefood",fcp);
		add("fdetail",fdp);
		add("find",ffp);
	}

}
