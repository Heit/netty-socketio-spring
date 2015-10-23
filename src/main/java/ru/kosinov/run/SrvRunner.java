package ru.kosinov.run;

import com.corundumstudio.socketio.SocketIOServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Kosinov_KV
 * on 22.10.2015. netty-socketio-spring.
 */
@Component
public class SrvRunner implements CommandLineRunner {

    private final SocketIOServer server;

    @Autowired
    public SrvRunner(SocketIOServer server) {
        this.server = server;
    }

    @Override
    public void run(String... args) throws Exception {
        server.start();
        Thread.sleep(Integer.MAX_VALUE);
        server.stop();
    }

}
