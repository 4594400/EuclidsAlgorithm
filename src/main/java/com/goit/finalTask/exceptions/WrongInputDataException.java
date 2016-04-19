package com.goit.finalTask.exceptions;

public class WrongInputDataException extends NumberFormatException {
    private String message = "Only integers are allowed. Try again or enter \"quit\" to exit the program! ->";

        public WrongInputDataException(String message) {
        this.message = message;
    }

    public String getMessaage() {
        return message;
    }

}
//
//    // Это наше поле для хранения информации, присущей данному
//    // классу-исключению. Поле немножко надуманное, но здесь может быть
//    // и достаточно важная информация
//    private int errorCode;
//
//    // переопределяем конструктор
//    public SimpleException(String message)
//    {
//        this(0, message);
//    }
//
//    // Создаем свой конструктор
//    public SimpleException(int errorCode, String message)
//    {
//        // Вызываем конструктор предка
//        super(message);
//        // Добавляем инициализацию своего поля
//        this.errorCode = errorCode;
//    }
//
//    // Метод для получения кода ошибки
//    public int getErrorCode()
//    {
//        return errorCode;
//    }
//}