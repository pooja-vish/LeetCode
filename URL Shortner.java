public class Codec {
    private Map<Integer, String> urls = new HashMap<>();
    private int id = 0;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        urls.put(id,longUrl);
        return "https.//tinyurl.com/" + (id++);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int key =Integer.parseInt( shortUrl.replace("https.//tinyurl.com/",""));
        return urls.get(key);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));