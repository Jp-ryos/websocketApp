/**
 * 	@author R.Shibata
 *  @since 2018/12/02
 */
package ryos.java.server;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/WebSocketServer")
public class WebSocketServer {
	
	@OnMessage
	public String onMessage(String message)
	{
		System.out.println("Get Message :" + message);
		return message;
	}

	@OnClose
	public void onClose(Session session)
	{
		System.out.println("***WebSocket Session's Close!***");
	}

	@OnError
	public void onError(Throwable th)
	{
		System.out.println("WebSocket Error" + th.getMessage());
	}
}
