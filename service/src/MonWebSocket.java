import org.glassfish.grizzly.GrizzlyFuture;
import org.glassfish.grizzly.websockets.DataFrame;
import org.glassfish.grizzly.websockets.WebSocket;
import org.glassfish.grizzly.websockets.WebSocketListener;

public class MonWebSocket implements WebSocket
	{

		@Override
		public boolean add(WebSocketListener arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void broadcast(Iterable<? extends WebSocket> arg0, String arg1) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void broadcast(Iterable<? extends WebSocket> arg0, byte[] arg1) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void broadcastFragment(Iterable<? extends WebSocket> arg0, String arg1, boolean arg2) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void broadcastFragment(Iterable<? extends WebSocket> arg0, byte[] arg1, boolean arg2) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void close() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void close(int arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void close(int arg0, String arg1) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean isConnected() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void onClose(DataFrame arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onConnect() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onFragment(boolean arg0, String arg1) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onFragment(boolean arg0, byte[] arg1) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onMessage(String arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onMessage(byte[] arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onPing(DataFrame arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onPong(DataFrame arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean remove(WebSocketListener arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public GrizzlyFuture<DataFrame> send(String arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public GrizzlyFuture<DataFrame> send(byte[] arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public GrizzlyFuture<DataFrame> sendPing(byte[] arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public GrizzlyFuture<DataFrame> sendPong(byte[] arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public GrizzlyFuture<DataFrame> stream(boolean arg0, String arg1) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public GrizzlyFuture<DataFrame> stream(boolean arg0, byte[] arg1, int arg2, int arg3) {
			// TODO Auto-generated method stub
			return null;
		}
	}
