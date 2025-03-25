public class TCPFactory extends ChannelFactory {

    public Channel create () {
        return new TCPChannel();
    }

}