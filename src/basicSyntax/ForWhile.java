package basicSyntax;

public class ForWhile {

	public static void main(String[] args) {
		
		for(int num = 1; num <= 100; num++) {
			if((num % 3) == 0 && (num % 5) == 0) {
				System.out.println("FizzBuzz");
				continue;
			}
			else if((num % 3) == 0) {
				System.out.println("Fizz");
				continue;
			}
			else if((num % 5) == 0) {
				System.out.println("Buzz");
				continue;
			}
			else {
				System.out.println(num);
			}
		}

		System.out.println("～～～～～　お題１：パターン２　～～～～～");
		
		int index = 0;
		String[] pgLang = {"Ruby", "Golang", "Java", "Python", "TypeScript", "HTML", "JavaScript"};
		while(index < pgLang.length) {
			switch(pgLang[index]){
			case "Java":
				System.out.println("現在学習中の言語は" + pgLang[index] + "です");
				break;
				
			case "HTML":
				System.out.println(pgLang[index] + "はプログラミング言語ではありません");
				break;
				
			default:
				System.out.println(pgLang[index]);
				break;
			}

			if(pgLang[index] == "HTML") {
				break;
			}
			
			index++;
		}
	}

}
