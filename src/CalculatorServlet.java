import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calculate")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();

        String number1String = request.getParameter("number1");
        String number2String = request.getParameter("number2");
        String operationString = request.getParameter("operation");

        int number1 = Integer.parseInt(number1String);
        int number2 = Integer.parseInt(number2String);

        Operation calculationOperation = Operation.valueOf(operationString);

        int result = calculationOperation.performOperation(number1, number2);

        writer.println("Liczba 1: " + number1String + "<br/>");
        writer.println("Liczba 2: " + number2String + "<br/");
        writer.println("Wybrana operacja: " + calculationOperation + "<br/>");
        writer.println("Wynik: " + result + "<br/>");
        System.out.println("Ktos wszedł na strone /calculate");
    }
}
