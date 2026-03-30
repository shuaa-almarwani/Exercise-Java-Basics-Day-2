//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

//
//Exercise (Java Basics) # Day 2


    Scanner scanner = new Scanner(System.in);

//# 1. Develop a program that takes the weight (in kilograms) and height (in meters) as input
// and calculates the BMI, then prints it.

    System.out.print("Weight (kg): ");
    double weight = scanner.nextDouble();
    System.out.print("Height (m): ");
    double height = scanner.nextDouble();
    System.out.println("BMI: " + weight / (height * height));

// # 2. Write a program that takes the obtained marks and total marks as input
// and calculates the percentage, then prints it.
    System.out.print("Obtained Marks : ");
    int obtainedMarks = scanner.nextInt();
    System.out.print("Total Marks: ");
    int totalMarks = scanner.nextInt();
    System.out.println("Percentage: " + ((double) obtainedMarks / totalMarks) * 100 + " %");

    // # 3. Create a program that takes an amount in one currency and an exchange rate
    //as input, then converts and prints the amount in another currency.

    System.out.print("Amount in USD : ");
    double amountUSD = scanner.nextDouble();
    System.out.print("Exchange Rate (USD to EUR) : ");
    double exchangeRate = scanner.nextDouble();
    ;
    System.out.println("Amount in EUR : " + ((double) +amountUSD * exchangeRate));
    scanner.nextLine();

// # 4. Create a program that takes a string as input, calculates its length, and then
//reverses the string using the StringBuilder class, finally printing both the length and
//reversed string.

    System.out.print("Enter the string : ");
    String stringInput = scanner.nextLine();
    StringBuilder stringBuilder = new StringBuilder(stringInput);
    System.out.println("Length of the string: " + stringInput.length() + " And Reversed string: " + stringBuilder.reverse());

    // # 5. Develop a program that takes a sentence as input and extracts a substring from
    //it, then prints the extracted substring.


    System.out.print("Enter the sentence : ");
    String sentence = scanner.nextLine();
    System.out.print("Start Index= ");
    int startIndex = scanner.nextInt();
    System.out.print("End Index= ");
    int endIndex = scanner.nextInt();
    System.out.println(sentence.substring(startIndex, endIndex));


//# 6. Write a program that takes a sentence and a keyword as input, then check if
//the keyword is present in the sentence and prints the result.
    scanner.nextLine();
    System.out.print("Enter the sentence : ");
    String sentence2 = scanner.nextLine();

    System.out.print("Enter the keyword : ");
    String keyword = scanner.nextLine();

    if (sentence2.contains(keyword)) {
        System.out.println(" Keyword " + keyword + " is present in the sentence.");
    } else {
        System.out.println(" Keyword " + keyword + " is not present in the sentence.");
    }

// # 7. Develop a program that takes a sentence and a word to replace as input, then
//replace all occurrences of the word with another word and prints the modified
//sentence.

    System.out.print("Enter the sentence : ");
    String sentence3 = scanner.nextLine();
    System.out.print("Enter the Word To Replace : ");
    String wordToReplace = scanner.nextLine();
    System.out.print("Enter the Replacement Word : ");
    String replacementWord = scanner.nextLine();

    System.out.println(sentence3.replace(wordToReplace, replacementWord));


    // # 8. Write a program that takes two strings as input and check if they are equal,
    //ignoring the case, then prints whether they are equal or not.


    System.out.print("Enter String 1 : ");
    String string1 = scanner.nextLine();

    System.out.print("Enter String 2 : ");
    String string2 = scanner.nextLine();
    System.out.println(string1.equalsIgnoreCase(string2) ? " Strings are equal (ignoring case)." : "");

}