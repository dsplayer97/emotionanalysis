package com.example.demo;

import java.io.*;
import java.net.*;
import javax.net.ssl.HttpsURLConnection;

/*
 * Gson: https://github.com/google/gson
 * Maven info:
 *     groupId: com.google.code.gson
 *     artifactId: gson
 *     version: 2.8.1
 *
 * Once you have compiled or downloaded gson-2.8.1.jar, assuming you have placed it in the
 * same folder as this file (GetSentiment.java), you can compile and run this program at
 * the command line as follows.
 *
 * javac GetSentiment.java -classpath .;gson-2.8.1.jar -encoding UTF-8
 * java -cp .;gson-2.8.1.jar GetSentiment
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;





public class msAPI {

// ***********************************************
// *** Update or verify the following values. ***
// **********************************************

    // Replace the accessKey string value with your valid access key.
    static String accessKey = "b31b7dca89ca43efab940f2dfde34e4f";

// Replace or verify the region.

// You must use the same region in your REST API call as you used to obtain your access keys.
// For example, if you obtained your access keys from the westus region, replace
// "westcentralus" in the URI below with "westus".

    // NOTE: Free trial access keys are generated in the westcentralus region, so if you are using
// a free trial access key, you should not need to change this region.
    static String host = "https://westcentralus.api.cognitive.microsoft.com";

    static String path1 = "/text/analytics/v2.0/keyPhrases";

    static String path2 = "/text/analytics/v2.0/sentiment";

    public static String GetSentiment (Documents documents,int posttype) throws Exception {
        URL url;
        String text = new Gson().toJson(documents);
        byte[] encoded_text = text.getBytes("UTF-8");
        if(posttype == 1) {
             url = new URL(host + path1);
        }else{
             url = new URL(host + path2);
        }
        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "text/json");
        connection.setRequestProperty("Ocp-Apim-Subscription-Key", accessKey);
        connection.setDoOutput(true);

        DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
        wr.write(encoded_text, 0, encoded_text.length);
        wr.flush();
        wr.close();

        StringBuilder response = new StringBuilder ();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        String line;
        while ((line = in.readLine()) != null) {
            response.append(line);
        }
        in.close();

        return response.toString();
    }

    public static String prettify(String json_text) {
        JsonParser parser = new JsonParser();
        JsonObject json = parser.parse(json_text).getAsJsonObject();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(json);
        //return json;
    }

    public static void main (String[] args) {
       /* try {
            Documents documents = new Documents ();
            documents.add ("1", "en", "I really enjoy the new XBox One S. It has a clean look, it has 4K/HDR resolution and it is affordable.");
            documents.add ("2", "es", "Este ha sido un dia terrible, llegué tarde al trabajo debido a un accidente automobilistico.");

            String response = GetSentiment (documents,1);
            System.out.println (prettify (response));
        }
        catch (Exception e) {
            System.out.println (e);
        }*/

       // emotionSQL emotionSQL = new emotionSQL();
        //emotionSQL.saveemotionData();




    }
}