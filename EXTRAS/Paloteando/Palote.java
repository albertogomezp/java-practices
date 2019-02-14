public class Palote{
  public static String parsePalotes(int num){
    char[] numChar = String.valueOf(num).toCharArray();
    String paloteString ="";
    for(int x = 0; x < numChar.length; x++){
      for(int y = 1; y < (numChar[x]-47); y++){
        paloteString = paloteString.concat("|");
      }
      if(x != (numChar.length-1)){
        paloteString = paloteString.concat("-");
      }
    }
    return paloteString;
  }
}