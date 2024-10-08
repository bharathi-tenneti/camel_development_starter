package com.redhat.lab;

import java.util.List;
import java.util.Random;

import org.apache.camel.Exchange;
import io.quarkus.arc.Unremovable;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton
@Unremovable
@Named("messageBean")
public class MessageBean {

    List<String> fruits = List.of("apple", "banana", "cherry", "melon");
    List<String> cars = List.of("audi", "bmw", "ferrari", "tesla");
    List<String> teams = List.of("lakers", "celtics", "mavs", "spurs");
    List<String> colors = List.of("yellow", "red", "blue", "green");
    List<String> seasons = List.of("winter", "summer", "autumn", "spring");

    public void createMessage(Exchange exchange){

         Random random = new Random();

         exchange.getIn().setHeader("col1", fruits.get(random.nextInt(fruits.size())));
         exchange.getIn().setHeader("col2", cars.get(random.nextInt(cars.size())));
         exchange.getIn().setHeader("col3", teams.get(random.nextInt(teams.size())));
         exchange.getIn().setHeader("col4", colors.get(random.nextInt(colors.size())));
         exchange.getIn().setHeader("col5", seasons.get(random.nextInt(seasons.size())));

         exchange.getIn().setBody("insert into messages (column1,column2,column3,column4,column5) values (:?col1, :?col2, :?col3, :?col4,:?col5)");

    }
    
}
