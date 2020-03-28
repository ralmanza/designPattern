package org.designpattern.exercise;

import org.designpattern.exercise.interpreter.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = format.parse("2020/03/28 22:24:08");
        DriveFile file = new DriveFile("Cat Jedi.mp4", "mp4", 2, "/Videos/Funny/Cats", date, date, date);
        IExpression expression = new AndExpression(
                new EqualsExpression("mp4"),
                new ContainsExpression("cat")
        );
        System.out.println(expression.evaluate(file));
        System.out.println("==========================");
        Date limitDate = format.parse("2020/03/28 22:24:10");
        IExpression expression2 = new AndExpression(
                new OrExpression(new EqualsExpression("mp4"), new EqualsExpression("mkv")),
                new GreaterThanExpression(limitDate));
        System.out.println(expression2.evaluate(file));
    }
}