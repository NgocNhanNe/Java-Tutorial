package Management_Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manage {
    Scanner scanner = new Scanner(System.in);
    List<Document> documents = new ArrayList<>();

    public void menu(){
        while (true){
            System.out.println("Menu: \n1. Add new document \n2. Delete document by id \n3. Show document by id \n4. Search document by type \n5. Show all documents \n6. Exit");
            System.out.println("-------------------");
            System.out.print("Enter your choose: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Add new document");
                    System.out.println("-------------------");
                    addNewDocument();
                    break;
                case 2:
                    System.out.println("Delete document by id");
                    System.out.println("-------------------");
                    System.out.println("Enter id: ");
                    String id = scanner.nextLine();
                    deleteDocumentbyID(id,documents);
                    System.out.println("remove success");
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("List of documents: ");
                    showListDocuments(documents);
                    break;
                case 6:
                    System.exit(1);
                    break;
                default:
            }
        }
    }

    private void showListDocuments(List<Document> documents) {
        for (Document document: documents){
            System.out.println(document);
        }
    }

    private void deleteDocumentbyID(String id, List<Document> documents) {
        for (Document document: documents){
            if(document.getDoc_id().contains(id)){
               documents.remove(document);
            }
        }
        System.out.println(documents);
    }

    private void addNewDocument() {
        System.out.println("Enter doc_id: ");
        String doc_id = scanner.nextLine();
        checkID(doc_id,documents);

        System.out.println("Enter publisher: ");
        String publisher = scanner.nextLine();

        System.out.println("Enter release_number: ");
        int release_number = Integer.parseInt(scanner.nextLine());

        System.out.println("Choose type document: ");

        int type = Integer.parseInt(scanner.nextLine());
        switch (type){
            case 1:
                System.out.println("Enter author name: ");
                String author_name = scanner.nextLine();

                System.out.println("Enter pages: ");
                int pages = Integer.parseInt(scanner.nextLine());

                Document book = new Book(doc_id,publisher,release_number,author_name,pages);
                documents.add(book);
                System.out.println("Add new book successfully!");
                System.out.println(book);
                break;
            case 2:
                System.out.println("Enter issue number: ");
                int issue_number = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter release_month: ");
                int release_month = Integer.parseInt(scanner.nextLine());
                Document magazine = new Magazine(doc_id,publisher,release_number,issue_number,release_month);
                documents.add(magazine);
                System.out.println("Add new magazine successfully!");
                System.out.println(magazine);
                break;
            case 3:
                System.out.println("Enter release day: ");
                int day = Integer.parseInt(scanner.nextLine());
                Document paper = new Paper(doc_id,publisher,release_number,day);
                documents.add(paper);
                System.out.println("Add new paper successfully!");
                System.out.println(paper);
                break;
            default:
                System.out.println("type is invalid!");
        }

    }

    public void checkID(String doc_id, List<Document> documents) {
        for (Document document: documents){
            if(document.getDoc_id().contains(doc_id)){
                System.out.println("Enter again");
                addNewDocument();
            }
        }
    }
}
