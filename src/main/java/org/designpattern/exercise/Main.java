package org.designpattern.exercise;

import org.designpattern.exercise.observer.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Account user1 = new Account("Juan", "Perez", "jperez", "jperez@gmail.com");
        Channel channel1 = new Channel("PlayGames", user1);

        Account user2 = new Account("Julia", "Martinez", "jmartinez", "jmartinez@gmail.com");
        Channel channel2 = new Channel("HealthyFood", user2);

        Account user3 = new Account("Jose Carlos", "Morales", "jcmorales", "jcmorales@gmail.com");
        Account user4 = new Account("Anabel", "Sanjinez", "asanjinez", "asanjinez@gmail.com");
        Account user5 = new Account("Melina", "Galvez", "mgalvez", "mgalvez@gmail.com");

        IObserver observer1 = new VideoObserver(user1);
        IObserver observer2 = new VideoObserver(user2);
        IObserver observer3 = new VideoObserver(user3);
        IObserver observer4 = new VideoObserver(user4);
        IObserver observer5 = new VideoObserver(user5);
        IObserver observer6 = new VideoObserver(user5);


        channel1.subscribe(observer2);
        channel1.subscribe(observer3);
        channel1.subscribe(observer5);

        channel2.subscribe(observer1);
        channel2.subscribe(observer4);
        channel2.subscribe(observer6);

        Video gameVideo = new Video("FreeFire new tips", "Usefull dota tips", new Date());
        channel1.uploadVideo(gameVideo);

        Video foodVideo = new Video("How to make a cake", "How to make a cake", new Date());
        channel2.uploadVideo(foodVideo);

        channel2.unSubscribe(observer1);

        Video foodVideo2 = new Video("How to make a pizza", "How to make a pizza", new Date());
        channel2.uploadVideo(foodVideo2);
    }
}
