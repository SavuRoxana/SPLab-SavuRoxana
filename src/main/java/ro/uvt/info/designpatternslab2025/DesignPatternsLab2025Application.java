package ro.uvt.info.designpatternslab2025;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ro.uvt.info.designpatternslab2025.difexample.ClientComponent;
import ro.uvt.info.designpatternslab2025.difexample.SingletonComponent;
import ro.uvt.info.designpatternslab2025.difexample.TransientComponent;

@SpringBootApplication
public class DesignPatternsLab2025Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DesignPatternsLab2025Application.class, args);

        TransientComponent transientBean = context.getBean(TransientComponent.class);
        transientBean.operation();

        transientBean = context.getBean(TransientComponent.class);
        transientBean.operation();

        SingletonComponent singletonBean = context.getBean(SingletonComponent.class);
        singletonBean.operation();

        singletonBean = context.getBean(SingletonComponent.class);
        singletonBean.operation();

        ClientComponent c = context.getBean(ClientComponent.class);
        c.operation();
    }

}
