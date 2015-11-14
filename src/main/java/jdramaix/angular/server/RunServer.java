package jdramaix.angular.server;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.util.resource.ResourceCollection;

public class RunServer {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        //Client - static files & compile mode output handler
        ServletContextHandler contextHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        contextHandler.setWelcomeFiles(new String[]{"Angular.html"});
        contextHandler.setContextPath("/");
        contextHandler.setBaseResource(new ResourceCollection(new String[]{
                "src/main/webapp",
                "build/gwt/out/"
        }));

        ServletHolder clientResourceHolder = new ServletHolder(new DefaultServlet());
        clientResourceHolder.setInitParameter("useFileMappedBuffer", "false");
        clientResourceHolder.setInitOrder(1);
        contextHandler.addServlet(clientResourceHolder, "/");

        // Add the ResourceHandler to the server.
        HandlerList handlers = new HandlerList();
        handlers.setHandlers(new Handler[]{contextHandler});
        server.setHandler(handlers);

        server.start();
    }
}