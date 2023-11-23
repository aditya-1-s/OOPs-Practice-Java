class TestBookArr {
    public static void main(String[] args) {
        Author[] arr = new Author[2];
        arr[0] = new Author("ejdd", "dwdef", 'm');
        arr[1] = new Author("fwefc", "dwdwef", 'm');
        // BookArr book = new BookArr("Python", new Author[] { new Author("Gia Kinh",
        // "giakinh2000@gmail.com", 'm'),
        // new Author("Lan anh", "lanh@gmail.com", 'f'), new Author("adi", "@gmail.com",
        // 'm') }, 200.5, 30);
        BookArr book = new BookArr("honey pajji", arr, 256, 6);
        // System.out.println(book.getAuthorNames());
        System.out.println(book.toString());
    }
}