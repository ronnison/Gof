public class UDPFactory extends ChannelFactory {

    public Channel create () {
        return new UDPChannel();
    }

}