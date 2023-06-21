package Ch28;

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import Ch26.ServerRecvThread;

public class ServerBackground {
	ServerSocket server;
	ServerUI gui;
	Map<String,DataOutputStream> ClientList; //!!
	Socket client;
	
	
	ServerBackground(ServerUI ui)
	{
		gui = ui;
		ClientList = new HashMap();
		Collections.synchronizedMap(ClientList);//�÷��� ����ȭ 
		
	}
	
	
	public void Setting() {
		try {
			
			server = new ServerSocket(5555);

			while(true) {
				gui.area.append("���� ���� ��û �����....\n");
				client=server.accept();
				gui.area.append(client.getInetAddress()+" ���� ������..\n");
				
				//���� ������ ó�� 
				ServerRecvThread recv = new ServerRecvThread(client,this,gui);
				Thread th = new Thread(recv);
				th.start();
				
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	
	public void addClient(String nick, DataOutputStream Dout) {
		broadCast(nick  + " ���� �����ϼ̽��ϴ�" +client.getInetAddress()+"\n");
		ClientList.put(nick, Dout);
		
	}
	public void removeClient(String nick) {
		gui.area.append(nick + " ���� �����ϼ̽��ϴ�\n");
		ClientList.remove(nick);
	}
	public void broadCast(String msg) {
	
		for(String key : ClientList.keySet()) {
			try {		
				ClientList.get(key).writeUTF(msg);
				ClientList.get(key).flush();		
			}catch(Exception e) {}
			
		}
		
		
		
	}
	
	public void broadCast(String nick, String msg) {
		Iterator<String> iter = ClientList.keySet().iterator();
		String key="";
		while(iter.hasNext()) {
			key = iter.next();
			try {
				if(!key.equals(nick))
				{
					ClientList.get(key).writeUTF(msg);
					ClientList.get(key).flush();
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	

}