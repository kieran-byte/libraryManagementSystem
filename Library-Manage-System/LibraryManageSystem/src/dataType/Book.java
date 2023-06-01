package dataType;

public class Book {
	private String _bookName;
	private String _bookAuthor;
	private String _pubDate;
	private boolean _avail = true;

	/**
	 * Create instance of Book object
	 * @param bookName Title of the book
	 * @param bookAuthor Author of the book
	 * @param pubDate Date of book publication in dd/mm/yyyy format
	 *
	 */
	public Book(String bookName, String bookAuthor, String pubDate) {
		_bookName = bookName;
		_bookAuthor = bookAuthor;
		_pubDate = pubDate;
	}

	/**
	 * Getter for Book title
	 * @return A string of the book title
	 */
	public String getBookName() {
		return _bookName;
	}

	/**
	 * Getter for Book Author
	 * @return A string of the author
	 */
	public String getBookAuthor() {
		return _bookAuthor;
	}

	/**
	 * Getter for Book publication date
	 * @return A string of the publication date
	 */
	public String getPubDate() {
		return _pubDate;
	}

	/**
	 * Getter for Book availability
	 * @return A string of the publication date
	 */
	public boolean getAvail(){return _avail;}

	/**
	 * Generates a string summary of the book
	 * @return A string with all fields of the Book
	 */
	public String printBook(){
		String prntLine = "The title of the book is: " + getBookName() + "\n";
		prntLine += "The author of the book is: " + getBookAuthor() + "\n";
		prntLine += "The publish date of the book is: " + getPubDate() + "\n";
		prntLine += "The book is: ";

		if(getAvail()){
			prntLine += "Available";
		}
		else{
			prntLine += "Not available";
		}

		//System.out.print(prntLine);
        return prntLine;
    }

}
