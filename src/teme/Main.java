package teme;

// Write an application that consists of few classes:
//a. Author class, representing an author – poem writer, which consists of fields surname
//and nationality (both of type String)
//b. Poem class, representing poem, which consists of fields creator (type Author) and
//stropheNumbers (type int – numbers of strophes in poem)
//c. Main class, with main method, inside which you will:
//i. Create  three  instances  of  Poem  class,  fill  them  with  data  (using  constructor
//and/or setters) and store them in array
//ii. Write a surname of an author, that wrote a longest poem (let your application
//calculate it!)

public class Main {

    public static class Authors{
    //instance variables
        String surname;
        String nationality;
    // constructor
        public Authors (String surname_value, String nationality_value){
            surname = surname_value;
            nationality = nationality_value;
        }
    // instance methods
    }
    public static class Poems {
        // instance variables
        Authors creator;
        int lines;
        // constructor
        public Poems (Authors creator_value, int lines_value){
            creator = creator_value;
            lines = lines_value;
        }
        // methods
    }

    public static void main(String[] args) {
        Authors first_author = new Authors("Eminescu", "RO");
        Authors second_author = new Authors("Cosbuc", "RO");
        Authors third_author = new Authors ("Minulwescu", "RO");
        Poems first_poet = new Poems(first_author,89);
        Poems second_poet = new Poems(second_author, 67);
        Poems third_poet = new Poems(third_author, 25);

        int max_number = first_poet.lines;
        Authors max_poems = first_poet.creator;
        if (second_poet.lines > max_number){max_number = second_poet.lines;
        max_poems = second_poet.creator;}
        if (third_poet.lines > max_number){max_number = third_poet.lines;
        max_poems = third_poet.creator;}

        System.out.println(max_poems.surname);

    }
}
