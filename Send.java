import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Send {

    public Send() throws Exception {
        String host="192.168.98.130";
        int port=9898;
        Socket s=new Socket(host,port);
        InputStream si=s.getInputStream();
        OutputStream so=s.getOutputStream();
        
        
        so.write(pe.read());

        so.flush();
        Thread.sleep(2);
        s.close();
    }
}
