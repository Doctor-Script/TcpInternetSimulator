package inetTCPTesting;

import java.net.Socket;

public interface IConnectionHandler {
	void start();
	void setSocket(Socket socket);
}
