import java.util.*;
import java.lang.*;
class URL_Shortener {

        public static HashMap<String, String> urlmap = new HashMap<>();
        public static final String characters = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        public static final int url_length = 6;
        public static String shortenUrl(String longurl)
        {
            if (urlmap.containsValue(longurl)) {
                for (Map.Entry<String, String> entry : urlmap.entrySet()) {
                    if (entry.getValue().equals(longurl))
                        return entry.getKey();
                }
            }
            StringBuilder sb = new StringBuilder();
            Random random = new Random();
            for (int i = 0; i < url_length; i++)
                sb.append(characters.charAt(random.nextInt(characters.length())));
            String short_url =sb.toString();
            urlmap.put(short_url, longurl);
            return short_url;
        }

        public static String longUrl(String shorturl) {
            return urlmap.getOrDefault(shorturl,"Url not found");
        }
        public static void main(String[] args) {
            String long_url = "https://www.google.com/search";
            System.out.println("Shortened URL: " +shortenUrl(long_url));
            String short_url = "gxyzmj";
            System.out.println("Long URL:" +longUrl(short_url));
        }
}

