import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the BookService bean
        BookService bookService = (BookService) context.getBean("bookService");

        // Verify that the BookRepository has been injected
        if (bookService != null && bookService.getBookRepository() != null) {
            System.out.println("Dependency Injection successful: BookRepository has been injected into BookService.");
        } else {
            System.out.println("Dependency Injection failed.");
        }
        bookService.someMethod();

	}

}
