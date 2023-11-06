package com.sist.sever;
import java.net.*;
import java.io.*;
import java.util.*;

import javax.net.ssl.HostnameVerifier;
import com.sist.common.Function3;

public class Server3 implements Runnable {
	private Vector<Client> waitVc=new Vector<Client>();
	private ServerSocket ss;
	private final int PORT=10000;
	
	public Server3()
	{
		try
		{
			ss=new ServerSocket(PORT); 
			System.out.println("Server Start...");
		}catch(Exception ex) {}
	}
	public void run()
	{
		try
		{
			while(true)
			{
				Socket s=ss.accept();
				
				Client client=new Client(s);
				client.start();
			}
		}catch(Exception ex) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server3 server=new Server3();
		new Thread(server).start();
	}
	
	//통신 담당 => 따로 작동 => 쓰레드
	class Client extends Thread
	{
		String id,name,sex,pos;
		Socket s;
		BufferedReader in; 
		OutputStream out;     
		public Client(Socket s)
		{
			this.s=s;  
			try
			{
				in=new BufferedReader(new InputStreamReader(s.getInputStream())); 
				out=s.getOutputStream();  
			}catch(Exception ex) {}
		}
		public void run()
		{
			try
			{
				while(true)
				{
					String msg=in.readLine();
					System.out.println("Client=>"+msg);
					//로그인 => 100
					StringTokenizer st=new StringTokenizer(msg,"|");
					int protocol=Integer.parseInt(st.nextToken());
					switch(protocol)
					{
						case Function3.LOGIN:
						{
							id=st.nextToken();
							name=st.nextToken();
							sex=st.nextToken();
							pos="대기실";
							
							// 접속되어 있는 사람들에게 전송
							messageAll(Function3.LOGIN+"|"+id+"|"+name+"|"+sex+"|"+pos);
							messageAll(Function3.WAITCHAT+"|[알림 ☞]"+name+"님 입장하셨습니다|red");
							// waitVc => 저장
							waitVc.add(this);
							// Login창을 닫고, main을 보여준다
							messageTo(Function3.MYLOG+"|"+id);
							// 접속사 명단을 보낸다
							for(Client client:waitVc)
							{
								messageTo(Function3.LOGIN+"|"+client.id+"|"
															+client.name+"|"
															+client.sex+"|"
															+client.pos);
							}
							// 개설된 방을 전송 ==> (X)
						}
						break;
						case Function3.WAITCHAT:
						{
							String data=st.nextToken();
							String color=st.nextToken();
							messageAll(Function3.WAITCHAT+"|["+name+"]"+data+"|"+color);
						}
						break;
						case Function3.EXIT:
						{
							messageAll(Function3.WAITCHAT+"|[알림 ☞]"+name+"님 퇴장하셨습니다|red");
							messageAll(Function3.EXIT+"|"+id);
							// id를 테이블에서 제거
							for(int i=0;i<waitVc.size();i++)
							{
								Client client=waitVc.get(i);
								if(client.id.equals(id))
								{
									messageTo(Function3.MYEXIT+"|");
									waitVc.remove(i);
									try
									{
										// 송수신 종료
										in.close();
										out.close();
									}catch(Exception ex) {}
									break;
								}
							}
						}
						break;
					}
				}
			}catch(Exception ex) {}
			
		}
		// 처리 방식 => 2개
		// 1. 접속자 전체로 전송 => 로그인(먼저 로그인 사람) / 나가기(남은 / 채팅
		public synchronized void messageAll(String msg)
		{
			//synchronized => 동기방식(쓰레드)
			try
			{
				for(Client client:waitVc)
				{
					client.messageTo(msg);
				}
			}catch(Exception ex) {}
		}
		// 2. 로그인 , 나가기
		public synchronized void messageTo(String msg)
		{
			try
			{
				this.out.write((msg+"\n").getBytes());
			}catch(Exception ex) {}
		}
	}
}
