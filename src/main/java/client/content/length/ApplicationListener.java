package client.content.length;


import io.micronaut.context.annotation.Value;
import io.micronaut.context.event.ApplicationEventListener;
import io.micronaut.discovery.event.ServiceStartedEvent;

public class ApplicationListener implements ApplicationEventListener<ServiceStartedEvent> {

    @Value("${micronaut.http.client.max-content-length}")
    Object maxContentLength;

    @Value("${micronaut.http.client.max-content}")
    Object maxContent;

    @Value("${micronaut.http.client.max-content-length-test}")
    Object maxContentLengthTest;

    @Override
    public void onApplicationEvent(ServiceStartedEvent event) {

        System.out.println("maxContentLength "+maxContentLength);
        System.out.println("maxContent "+maxContent);
        System.out.println("maxContentLengthTest "+maxContentLengthTest);

    }
}
