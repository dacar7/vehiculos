package vehiculos.estadisticas.estadisticas.infraestructura;

import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConf {

    @Bean
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory("elephant.rmq.cloudamqp.com");
        //connectionFactory.setPort(5672);
        connectionFactory.setUsername("");
        connectionFactory.setPassword("");
        connectionFactory.setChannelCheckoutTimeout(1000);
        connectionFactory.setRequestedHeartBeat(300);
        connectionFactory.setVirtualHost("");

        return connectionFactory;
    }

    @Bean
    public SimpleMessageListenerContainer container(ConnectionFactory connectionFactory) {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        container.setQueueNames("vehiculo.registrado.estadisticas");
        container.setMessageListener(new Consumidor());
        container.setAcknowledgeMode(AcknowledgeMode.AUTO);
        return container;
    }
}
