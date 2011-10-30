package com.meistermeier.android.jugsample.util;

import com.meistermeier.android.jugsample.domain.Book;

import java.util.ArrayList;
import java.util.List;

public class BookBuilderUtil {

    public static List<Book> createSampleBooks() {
        List<Book> books = new ArrayList<Book>();
        Book book = new Book("3596164532", "Der Schwarm", "Von der Buchrückseite:\n" +
                "\"Vor Peru verschwindet ein Fischer. Spurlos. Norwegische Ölbohrexperten stossen auf merkwürdige Organismen, die Hunderte Quadratkilometer Meeresboden in Besitz genommen haben. Währenddessen geht mit den Walen entlang der Küste British Columbias eine unheimliche Veränderung vor. Nichts von alledem scheint miteinander in Zusammenhang zu stehen. Doch Sigur Johanson, Biologe und Schöngeist, glaubt nicht an Zufälle. Auch der indianische Walforscher Leon Anawak gelangt zu beunruhigenden Schlüssen: Eine Katastrophe kündigt sich an. Die Suche nach dem Urheber konfrontiert die Forscher mit ihren schlimmsten Albträumen.\"");
        books.add(book);
        book = new Book("0434019569", "The Second Coming", "\"GOD'S COMING -- LOOK BUSY!\" God really is coming, and he is going to be pissed... Having left his son in charge God treats himself to a week off at the beginning of the seventeenth century. He returns to find out that things on earth haven't gone quite to plan.");
        books.add(book);
        book = new Book("0261102389", "The Lord of the rings", "'Extraordinarily imaginative, and wholly exciting.' The Times 'The story itself is superb.' Observer 'A most remarkable feat.' Guardian 'An astonishing imaginative tour de force.' Daily Telegraph 'Tolkien was a storyteller of genius.' Literary Review 'Amongst the greatest works of imaginative fiction of the twentieth century.' Sunday Telegraph");
        books.add(book);
        book = new Book("0132350882", "Clean Code", "Even bad code can function. But if code isn't clean, it can bring a development organization to its knees. Every year, countless hours and significant resources are lost because of poorly written code. But it doesn't have to be that way. Noted software expert Robert C. Martin presents a revolutionary paradigm with Clean Code: A Handbook of Agile Software Craftsmanship.");
        books.add(book);
        book = new Book("0321146530", "Test Driven Development", "Quite simply, test-driven development is meant to eliminate fear in application development. While some fear is healthy (often viewed as a conscience that tells programmers to \"be careful!\"), the author believes that byproducts of fear include tentative, grumpy, and uncommunicative programmers who are unable to absorb constructive criticism. When programming teams buy into TDD, they immediately see positive results.");
        books.add(book);
        book = new Book("1935182757", "Scala in Action", "Even within a single application, programming problems often lend themselves to a particular style of programming - functional, imperative, dynamic - but most languages require you to choose a single approach before you start. Scala is a statically typed, JVM-compatible programming language that blends the object oriented and functional programming models, giving one the flexibility to use the right approach for each specific case.");
        books.add(book);
        return books;
    }

}
