package composicaoEx2.application;

import composicaoEx2.entities.Comment;
import composicaoEx2.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow that's awesome");

        Post p1 = new Post(12,
                "I'm going to visit this wonderful country!",
                "Travelling to New Zeland",
                sdf.parse("01/10/2024 15:46:00"));

        p1.addComments(c1);
        p1.addComments(c2);

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the force be with you");

        Post p2 = new Post(5,
                "See you tomorrow",
                "Good night guys",
                sdf.parse("23/01/2024 21:30:00"));

        p2.addComments(c3);
        p2.addComments(c4);

        System.out.println(p1);
        System.out.println(p2);
    }
}
