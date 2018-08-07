package vehiculos.motorsoft.motorsoft.infraestructura;

import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.plaf.basic.BasicRadioButtonMenuItemUI;

@Configuration
public class RabbitConf {

    @Bean
    public ConnectionFactory connectionFactory(){
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory("elephant.rmq.cloudamqp.com");
        //connectionFactory.setPort(5672);
        connectionFactory.setUsername("");
        connectionFactory.setPassword("");
        connectionFactory.setChannelCheckoutTimeout(1000);
        connectionFactory.setRequestedHeartBeat(300);
        connectionFactory.setVirtualHost("xjlvzwua");

        return connectionFactory;
    }

    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory){
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        return  rabbitTemplate;
    }

}
