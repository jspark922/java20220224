package chap18.lecture.p07network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class App02Server {
	public static void main(String[] args) throws Exception {
		ServerSocket serversocket = new ServerSocket();
		serversocket.bind(new InetSocketAddress("172.30.1.20", 38080));

		System.out.println("[클라이언트 연결 기다림]");
		Socket socket = serversocket.accept();

		InputStream is = socket.getInputStream();
		Reader rd = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(rd);

		System.out.println("[클라이언트가 보낸 메세지 출력]");
		System.out.println(br.readLine());

		br.close();
		rd.close();
		is.close();
		socket.close();
		serversocket.close();
		System.out.println("서버 프로그램 종료!!");
	}
}
