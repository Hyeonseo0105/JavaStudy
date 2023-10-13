package com.sist.client;
import javax.swing.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 *    Container : 윈도우창
 *      => JFrame : 닫기 , 확대 , 축소
 *      => JDialog
 *          = Modal (창이 떴을 때 다른거 클릭못하게 하는 거)
 *          = Modaless
 *      => JWindow : title바가 없다 (프로그램열때 프로그램 이름디자인창)
 *      => JPanel : 단독으로 실행이 안된다
 *         -----> Button,TextField 묶어서 사용
 *      => JTable , JTree , 
 *    Component : => 단독으로 실행할 수 없다
 *      버튼
 *       = 일반 버튼 : JButton
 *       = 토글 버튼 : JRadioButton , JCheckBox
 *       = 메뉴     : JMenuItem
 *      입력
 *       = 한줄입력 : JTextField
 *       = 여러줄 입력 : JTextArea
 *       = 비밀번호 입력 : JPasswordField
 *      기타
 *       = 문자출력 , 이미지출력 : ***JLabel
 *       = 목록출력 : ***JTable , JList
 *       = ***JTabbedPane , JEditPane , JTextPane(이모티콘,파일전송)  
 */
public class ClientMain implements ActionListener{
	//생성자 => 오버로딩
	private JFrame fr=new JFrame("네트워크 미니 프로젝트");
	Login login=new Login();
//	private JButton b1=new JButton("홈");
//	private JButton b2=new JButton("맛집");
//	private JButton b3=new JButton("레시피");
//	private JButton b4=new JButton("서울여행");
//	JMenuItem home=new JMenuItem("홈");
//	JMenuItem house=new JMenuItem("맛집");
//	JMenuItem recipe=new JMenuItem("레시피");
//	JMenuItem seoul=new JMenuItem("서울여행");
	private JTabbedPane pan=new JTabbedPane();
	// 생성자 => 시작과 동시 처리 => 윈도우
	// 네트워크 => 서버 구동
	// 변수의 초기화
	
	public ClientMain()
	{
		pan.setTabPlacement(JTabbedPane.TOP);
		pan.addTab("홈",new JPanel());
		pan.addTab("맛집",new JPanel());
		pan.addTab("레시피",new JPanel());
		pan.addTab("서울여행",new JPanel());
		fr.add("Center",pan);
		
//		JMenu menu=new JMenu("메뉴");
//		menu.add(home);
//		menu.add(house);
//		menu.add(recipe);
//		menu.add(seoul);
//		JMenuBar bar=new JMenuBar();
//		bar.add(menu);
//		fr.setJMenuBar(bar);
		
//		JPanel p=new JPanel();
//		p.add(b1);
//		p.add(b2);
//		p.add(b3);
//		p.add(b4);
//		fr.add("North",p);
//		fr.setSize(1024, 768);
		//fr.setVisible(true);
		login.b1.addActionListener(this);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");

		}catch(Exception ex) {}
		new ClientMain();  //생성자 호출
	}
	@Override     //버튼처리메소드
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b1)
		{
			login.fr.setVisible(false);
			fr.setVisible(true);
		}
	}

}
