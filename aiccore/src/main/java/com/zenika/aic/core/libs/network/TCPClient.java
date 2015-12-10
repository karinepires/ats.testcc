package com.zenika.aic.core.libs.network;

import com.zenika.aic.core.libs.sensor.SensorsPacket;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * Created by thomas on 24/02/15.
 */
public final class TCPClient {


    private final String SENSOR_HOST = "127.0.0.1";
	private Socket socket;

	/**
	 *
	 * @param port
	 * @param packet
	 */

	/*public TCPClient(String host, int port, byte[] data) {
		try {
			socket = new Socket(host,port);
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.write(data);
			dos.flush();
			dos.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}*/

    public TCPClient(int port, SensorsPacket.sensors_packet packet) {
        try {
			SocketChannel serverSocket;
			serverSocket = SocketChannel.open();
			serverSocket.socket().setReuseAddress(true);
			serverSocket.connect(new InetSocketAddress(SENSOR_HOST, port));
			serverSocket.configureBlocking(true);

			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			packet.writeDelimitedTo(baos);

			ByteBuffer socketBuffer = ByteBuffer.wrap(baos.toByteArray());

			while (socketBuffer.hasRemaining())
				serverSocket.write(socketBuffer);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
