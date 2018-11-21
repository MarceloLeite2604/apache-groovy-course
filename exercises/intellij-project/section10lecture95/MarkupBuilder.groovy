groovy.xml.MarkupBuilder xmlMarkupBuilder = new groovy.xml.MarkupBuilder()

List books = [
        [isbn: "978-1935182443", title: "Groovy in Action 2nd Edition", author: "Dierk Koenig", price: 50.58],
        [isbn: "978-1935182948", title: "Making Java Groovy", author: "Ken Kousen", price: 33.96],
        [isbn: "978-1937785307", title: "Programming Groovy 2: Dynamic Productivity for the Java Developer", author: "Venkat Subramaniam", price: 28.92]
]



xmlMarkupBuilder.books {
    books.each { book ->
        xmlMarkupBuilder.book(isbn: book.isbn) {
            title book.title
            author book.author
            price book.price
        }
    }
}

FileWriter htmlFileWriter = new FileWriter("../section11lecture101/html/output.html")
groovy.xml.MarkupBuilder htmlMarkupBuilder = new groovy.xml.MarkupBuilder(htmlFileWriter)

htmlMarkupBuilder.html {
    head {
        title "Books for sale"
    }
    body {
        h1 "The following books are available for sale"
        table {
            tr {
                th "ISBN"
                th "Title"
                th "Author"
                th "Price"
            }
            books.each { book ->
                htmlMarkupBuilder.tr {
                    td book.isbn
                    td book.title
                    td book.author
                    td book.price
                }
            }
        }
    }
}