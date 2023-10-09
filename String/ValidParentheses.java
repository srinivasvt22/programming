//TC :O(n)
	private static boolean isValid(String str) {
		
		Stack<Character> stack= new Stack();
		
		for(char ch: str.toCharArray()) {
			
			if(ch=='(' || ch=='{' || ch=='[') {
				stack.push(ch);
			}else if(ch==')' && !stack.isEmpty() && stack.peek()=='(') {
				stack.pop();
			}else if(ch=='}' && !stack.isEmpty() && stack.peek()=='{') {
				stack.pop();
			}else if(ch==']' && !stack.isEmpty() && stack.peek()=='[') {
				stack.pop();
			}else {
				return false;
			}
		}
		return stack.isEmpty();
	}
