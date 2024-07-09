// Write a Java program to implement a lambda expression to reverse a string.
package Java8_Task;

import java.util.function.Function;

public class LambdaExpressionTask3 {
	public static void main(String[] args)
	{
		Function<String,String> reverse = s -> new StringBuilder(s).reverse().toString();
		String original="Hello";
		String Result=reverse.apply(original);
		System.out.println("original string is : " + original);
		System.out.println("Reverse string is : " + Result);
	}

}
//StringBuilder is a mutable sequence of characters, which means it can be modified after it's created, unlike String which is immutable.
//The reverse() method reverses the sequence of characters in the StringBuilder and returns the same StringBuilder object with the characters in reverse order.
//The toString() method converts the StringBuilder object back into a String.
//This is necessary because the lambda function needs to return a String, not a StringBuilder.
