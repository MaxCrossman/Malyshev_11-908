public class string58 {
    public static void main(String [] args) {
    	// строка должна содержать путь, например, C:/users/user/videos/96GB's of Fun.mp4
        String fn = "96GB's of Fun.mp4";
        System.out.println(fn);
        fn = fn.substring(0,fn.lastIndexOf('.'));
        System.out.println(fn);
    }
}