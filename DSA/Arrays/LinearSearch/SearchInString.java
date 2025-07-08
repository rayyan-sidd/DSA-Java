package LinearSearch;

class SearchInString{
    public static void main(String[] args) {
        String str = "Rayyan";
        char target = 'y';
        System.out.println(search(str, target));

    }
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for(char ch: str.toCharArray()){ //this is kindof foreach loop available in python.
            if(ch == target){
                return true;
            }
        }

        return false;
    }
}