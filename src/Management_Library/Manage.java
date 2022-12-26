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
            switch (choose) {
                case 1 -> {
                    System.out.println("Add new document");
                    System.out.println("-------------------");
                    addNewDocument();
                }
                case 2 -> {
                    System.out.println("Delete document by id");
                    System.out.println("-------------------");
                    System.out.println("Enter id: ");
                    String id = scanner.nextLine();
                    deleteDocumentByID(id, documents);
                    System.out.println("remove success");
                }
                case 3 -> {
                    System.out.println("Show document by id");
                    System.out.println("-------------------");
                    System.out.println("Enter id: ");
                    String id1 = scanner.nextLine();
                    showDocumentById(id1, documents);
                }
                case 4 -> {
                    System.out.println("Search document by type");
                    System.out.println("-------------------");
                    System.out.println("Type document: ");
                    System.out.println("1.Book");
                    System.out.println("2.Magazine");
                    System.out.println("3.Paper");
                    System.out.println("Enter type: ");
                    int type = Integer.parseInt(scanner.nextLine());
                    searchDocumentByType(type);
                }
                case 5 -> {
                    System.out.println("List of documents: ");
                    showListDocuments(documents);
                }
                case 6 -> System.exit(1);
                default -> {
                }
            }
        }
    }

    public void searchDocumentByType(int type) {
        switch (type) {
            case 1 -> searchByBook();
            case 2 -> searchByMagazine();
            case 3 -> searchByPaper();
            default -> System.out.println("type is invalid!");
        }
    }

    public void searchByBook() {
        this.documents.stream().filter(doc -> doc instanceof Book).forEach(doc ->
                System.out.println(doc.toString()));
    }

    public void searchByMagazine() {
        this.documents.stream().filter(doc -> doc instanceof Magazine).forEach(doc ->
                System.out.println(doc.toString()));
    }

    public void searchByPaper() {
        this.documents.stream().filter(doc -> doc instanceof Paper).forEach(doc ->
                System.out.println(doc.toString()));
    }

    private void showDocumentById(String id, List<Document> documents) {
        for (Document document: documents){
            if(document.getDoc_id().contains(id)){
                System.out.println("Document is: "+document);
            }
        }
    }

    private void showListDocuments(List<Document> documents) {
        for (Document document: documents){
            System.out.println(document);
        }
    }

    private void deleteDocumentByID(String id, List<Document> documents) {
        documents.removeIf(document -> document.getDoc_id().contains(id));
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
        System.out.println("1.Book");
        System.out.println("2.Magazine");
        System.out.println("3.Paper");

        int type = Integer.parseInt(scanner.nextLine());
        switch (type) {
            case 1 -> {
                System.out.println("Enter author name: ");
                String author_name = scanner.nextLine();
                System.out.println("Enter pages: ");
                int pages = Integer.parseInt(scanner.nextLine());
                Document book = new Book(doc_id, publisher, release_number, author_name, pages);
                documents.add(book);
                System.out.println("Add new book successfully!");
                System.out.println(book);
            }
            case 2 -> {
                System.out.println("Enter issue number: ");
                int issue_number = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter release_month: ");
                int release_month = Integer.parseInt(scanner.nextLine());
                Document magazine = new Magazine(doc_id, publisher, release_number, issue_number, release_month);
                documents.add(magazine);
                System.out.println("Add new magazine successfully!");
                System.out.println(magazine);
            }
            case 3 -> {
                System.out.println("Enter release day: ");
                int day = Integer.parseInt(scanner.nextLine());
                Document paper = new Paper(doc_id, publisher, release_number, day);
                documents.add(paper);
                System.out.println("Add new paper successfully!");
                System.out.println(paper);
            }
            default -> System.out.println("type is invalid!");
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

    public void find(){

    }
}
