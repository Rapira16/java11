public class StackOnQueueTest {
    public static void main(String[] args) {
        StackOnQueue stack = new StackOnQueue();

        // Добавление значений в стек
        stack.push(1);
        stack.push(2);

        // Вывод объекта на вершине стека (без удаления)
        System.out.println("Топ стека: " + stack.top()); // Ожидается 2

        // Удаление объекта на вершине стека и вывод
        System.out.println("Удаленный элемент: " + stack.pop()); // Ожидается 2

        // Проверка стека на пустоту
        System.out.println("Стек пуст? " + stack.empty()); // Ожидается false

        // Вывод информации о всех элементах стека
        System.out.println("Элементы стека: " + stack); // Ожидается [1]
    }
}
