package chap09.book.exercise.p06;

public class Chatting {
	void startChat(String chatId) {
		
		String nickName = null;
//		nickName = chatId; // 값이 두번 할당되어 오류가남
		
		Chat chat = new Chat() {
			@Override
			void start() {
				while (true) {
					String inputDate = "안녕하세요";
					String message = "[" + nickName + "] " + inputDate;
					sendMessage(message);
				}
			}
		};
	}

	class Chat {
		void start() {

		}

		void sendMessage(String message) {

		}
	}
}