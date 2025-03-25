public class App {
    public static void main(String[] args) throws Exception {
        
        ChannelFactory tcpf = new TCPFactory();
        ChannelFactory udpf = new UDPFactory();
        
        Channel tcp = tcpf.create();
        Channel udp = udpf.create();

        tcp.connect();
        udp.connect();

    }
}
