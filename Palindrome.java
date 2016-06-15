import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("abcba"));
		
		System.out.println(isPalindromeByStacks("aibohphobia"));
		
		System.out.println(isPalindromeByQueues("aibohphobia"));
	}
	
	public static boolean isPalindrome(String s){
		if(s.length() < 2)
			return false;
		for(int i = 0; i < s.length()/2; i++){
			if(s.charAt(i) != s.charAt(s.length()-1-i)){
				return false;
			}
		}		
		return true;
	}
	
	//Stacks
	public static boolean isPalindromeByStacks(String s){
			Stack s1 = new Stack();
			Stack s2 = new Stack();
			for(int i = 0; i < s.length(); i++){
				s1.push(s.toCharArray()[i]);
			}
			
			for(int i = 0; i <s.length()/2; i++){
				s2.push(s1.pop());
			}
			
			if(s1.size() > s2.size()){
				s1.pop();
			}
			for(int i = 0; i <s.length()/2; i++){
				if(s1.pop() != s2.pop()){
					return false;
				}
			}
						
			return true;
		}
	
	//Queues
	public static boolean isPalindromeByQueues(String s){
		Queue q1 = new LinkedList();
		Queue q2 = new LinkedList();
		Stack s1 = new Stack();
		for(int i = 0; i< s.length();i++){
			q1.add(s.toCharArray()[i]);
			
		}
		for(int i = 0; i < s.length()/2; i++){
			s1.push(q1.remove());
		}
		for(int i = 0; i < s.length()/2; i++){
			q2.add(s1.pop());
		}
		if(q1.size() > q2.size()){
			q1.remove();
		}
		
		for(int i = 0; i < s.length()/2; i++){
			if(q1.remove() != q2.remove()){
				return false;
			}
		}
		return true;
	}
}
