package OOADclient;

import OOADlogic.*;

public class TestLibrary {
    public static void main(String[] args) {
        Library library = new Library();
        ReadingMaterial b1 = new Book("Book 1", 15.99, "ISBN123");
        library.addMaterial(b1);
        ReadingMaterial c1 = new CD("CD 1", 9.99, 60);
        library.addMaterial(c1);
        ReadingMaterial m1 = new Magzine("Magazine 1", 5.99,
                "January");
        library.addMaterial(m1);

// Adding reading materials to the library
        library.addMaterial(new Book("Book 2", 15.99, "ISBN123"));
        library.addMaterial(new CD("CD 2", 9.99, 60));
        library.addMaterial(new Magzine("Magazine 2", 5.99,
                "January"));

        library.display();

        Member member1 = new Member("TEJASWINI");
        library.checkOut(member1, b1);
        System.out.println(library.materialFind(c1));
        library.checkOut(member1, c1);

        library.display();
        member1.displayMemberMaterialList();
    }
}
