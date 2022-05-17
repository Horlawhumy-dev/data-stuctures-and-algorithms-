boolean isPalindrome(String inputString) {
    String[] arr = inputString.split("");
    int lastIndex = arr.length-1;
    String[] resultArr = new String[arr.length];
    for (int i = 0; i < arr.length; i++) {
        resultArr[i] = arr[lastIndex];
        lastIndex--;
    }
    
    String reverseStr = String.join("", resultArr);
    
    if (inputString.equalsIgnoreCase(reverseStr)) {
        return true;
    }
    return false;
}
