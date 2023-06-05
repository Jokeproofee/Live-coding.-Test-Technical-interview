import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //Практическая задача билета №10: Дан массив пар названий книг и авторов. Необходимо привести каждую пару в строку вида: "Название книги" Имя Отчество Фамилия автора.
        System.out.println("Практическая задача билета №10:");

        Map<String,String> books = new HashMap<>();
        books.put("Война и мир","Лев Николаевич Толстой");
        books.put("Преступление и наказание","Фёдор Михайлович Достоевский");
        books.put("Отцы и дети","Иван Сергеевич Тургенев");

        List<String> stringList = new ArrayList<>();
        for (Map.Entry<String, String> entry : books.entrySet()) {
            stringList.add("Название книги: " + entry.getKey() + " Автор: " + entry.getValue());
        }
        for (String s : stringList) {
            System.out.println(s);
        }
    }
}