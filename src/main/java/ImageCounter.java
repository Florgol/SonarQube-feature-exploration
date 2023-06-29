public class ImageCounter {
    public int countImages(String html) {

        // We are converting the entire html to lower case
        // so we make sure that we also count "<Img"-tags
        // (This is not the most efficient solution)
        html = html.toLowerCase();
  
        int count = 0;
        int index = 0;
        while ((index = html.indexOf("<img", index)) != -1) {
            count++;
            index += "<img".length();
        }
        return count;
    }


}