package chap18.lecture.p07network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class App03Server {
	public static void main(String[] args) throws Exception {
		ServerSocket serversocket = new ServerSocket();
		serversocket.bind(new InetSocketAddress("172.30.1.20", 38080), 5000);

		System.out.println("[클라이언트 연결 기다림]");
		Socket socket = serversocket.accept();
		System.out.println("[클라이언트 연결 성공]");

		System.out.println("[클라이언트가 보낸 파일 받기]");
		InputStream is = socket.getInputStream();
		BufferedInputStream bis = new BufferedInputStream(is);

		byte[] datas = new byte[1024];
		int len = 0;

		String path = "output/NetWorkEx1.dat";
		FileOutputStream fos = new FileOutputStream(path);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		while ((len = bis.read(datas)) != -1) {
			bos.write(datas, 0, len);
		}

		System.out.println("[클라이언트가 받은 파일 다 받음]");
		bos.close();
		fos.close();
		bis.close();
		is.close();
		socket.close();
		serversocket.close();

		System.out.println("서버 프로그램 종료");
	}
}
