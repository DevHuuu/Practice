package chap9.exercise;

public class Chatting {
	void startChat(String chatId) {
		String nickName = null;
		nickName = chatId;
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;	//로컬클래스 내부에서는 메소드의
					sendMessage(message);								//final로 지정되지 않은 로컬 변수, 매개변수에 접근 할 수 없다.
				}
			}
		};
		chat.start();
	}
	
	class Chat {
		void start() {}
		void sendMessage(String message) {}
	}
}
