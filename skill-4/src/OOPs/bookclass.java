package OOPs;

public class bookclass {
		private String title;
		private String author;
		private double price;
		public void Settitle(String title) {
			this.title=title;
		}
		public void Setauthor(String author) {
			this.author=author;
		}
		public void Setprice(double price) {
			this.price=price;
		}
		public String getTitle() {
			return title;
		}
		public String getauthor() {
			return author;
		}
		public double getprice() {
			return price;
		}
		public String toString() {
			return "Title: " + title + "\nAuthor: " + author + "\nPrice: $" + price;
		}
	}


