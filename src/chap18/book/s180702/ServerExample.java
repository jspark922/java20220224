package chap18.book.s180702;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serversocker = null;
		try {
			serversocker = new ServerSocket();
			serversocker.bind(new InetSocketAddress("localhost", 5001));
			while(true) {
				System.out.println("[연결 기다림]");
				Socket socket = serversocker.accept();
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함]" + isa.getHostName());
			}
		} catch (Exception e) {
			if (!serversocker.isClosed()) {
				try {
					serversocker.close();
				} catch (Exception e1) {
					// TODO: handle exception
				}
			}
		}
	}
}
