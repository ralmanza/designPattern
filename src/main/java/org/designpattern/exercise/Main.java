package org.designpattern.exercise;

import org.designpattern.exercise.composite.Directory;
import org.designpattern.exercise.composite.File;
import org.designpattern.exercise.visitor.FileVisitor;
import org.designpattern.exercise.visitor.IVisitor;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Composite pattern
        Date date = new Date();
        Directory root = new Directory("Root", date, date);
        Directory music = new Directory("Music", date, date);
        Directory photos = new Directory("Photos", date, date);
        Directory family = new Directory("Family", date, date);
        Directory travel = new Directory("travels", date, date);
        Directory movies = new Directory("movies", date, date);

        File track1 = new File("Don't wary", "mp3", 15, "", date, date, date);
        File track2 = new File("track2", "mp3", 11, "", date, date, date);
        File track4 = new File("Resist", "mkv", 9, "", date, date, date);
        File track5 = new File("virus of beethoven", "mp3", 24, "", date, date, date);

        File video1 = new File("Hobbit 1", "mkv", 3986, "", date, date, date);
        File video2 = new File("Hobbit 2", "mkv", 3589, "", date, date, date);
        File video4 = new File("Hobbit 3", "mkv", 4562, "", date, date, date);
        File video5 = new File("Espectral", "avi", 1569, "", date, date, date);

        File photo1 = new File("IMG_235", "jpeg", 26, "", date, date, date);
        File photo2 = new File("IMG_236", "jpeg", 26, "", date, date, date);
        File photo4 = new File("IMG_237", "jpeg", 26, "", date, date, date);
        File photo5 = new File("IMG_238", "jpeg", 26, "", date, date, date);
        File photo6 = new File("IMG_239", "jpeg", 21, "", date, date, date);
        File photo7 = new File("IMG_240", "jpeg", 26, "", date, date, date);
        File photo8 = new File("IMG_241", "jpeg", 27, "", date, date, date);
        File photo9 = new File("IMG_242", "jpeg", 24, "", date, date, date);
        File photo11 = new File("IMG_1235", "jpeg", 26, "", date, date, date);
        File photo12 = new File("IMG_1236", "jpeg", 26, "", date, date, date);
        File photo14 = new File("IMG_1237", "jpeg", 26, "", date, date, date);
        File photo15 = new File("IMG_1238", "jpeg", 26, "", date, date, date);
        File photo16 = new File("IMG_1239", "jpeg", 21, "", date, date, date);
        File photo17 = new File("IMG_1240", "jpeg", 26, "", date, date, date);
        File photo18 = new File("IMG_1241", "jpeg", 27, "", date, date, date);
        File photo19 = new File("IMG_1242", "jpeg", 24, "", date, date, date);

        music.addFile(track1);
        music.addFile(track2);
        music.addFile(track4);
        music.addFile(track5);

        family.addFile(photo1);
        family.addFile(photo2);
        family.addFile(photo4);
        family.addFile(photo5);
        family.addFile(photo6);
        family.addFile(photo7);
        family.addFile(photo8);
        family.addFile(photo9);

        travel.addFile(photo11);
        travel.addFile(photo12);
        travel.addFile(photo14);
        travel.addFile(photo15);
        travel.addFile(photo16);
        travel.addFile(photo17);
        travel.addFile(photo18);
        travel.addFile(photo19);

        movies.addFile(video1);
        movies.addFile(video2);
        movies.addFile(video4);
        movies.addFile(video5);

        photos.addFile(family);
        photos.addFile(travel);

        root.addFile(photos);
        root.addFile(movies);
        root.addFile(music);

        // Visitor pattern
        FileVisitor fileVisitor = new FileVisitor("mkv");
        root.accept(fileVisitor);

        List<File> mp3 = fileVisitor.getResult();
        mp3.forEach(file -> System.out.println(file.getName() + "." + file.getExtension()));
    }
}
