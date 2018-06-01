package DAO;

import SQLInterface.emotionBaseDataSQLinterface;
import SQLInterface.wordBaseinterface;
import com.example.demo.Documents;
import com.example.demo.msAPI;
import com.alibaba.fastjson.*;
import emotionEntity.emotionBasedata;
import emotionEntity.wordBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;


@Service
public class emotionSQL {
    @Autowired
    private emotionBaseDataSQLinterface emotionBaseDataSQLinterface;
    @Autowired
    private wordBaseinterface wordBaseinterface;

    public void saveemotionData(String[] text){
            //List<emotionBasedata>emotionBasedatalist = new ArrayList<>();
            emotionBasedata[] emotionBasedata = new emotionBasedata[10];
            try {
                Documents documents = new Documents ();
                documents.add ("1", "en", text[0]);
                documents.add ("2", "en", text[1]);
                documents.add ("3", "en", text[2]);
                documents.add ("4", "en", text[3]);
                documents.add ("5", "en", text[4]);
                documents.add ("6", "en", text[5]);
                documents.add ("7", "en", text[6]);
                documents.add ("8", "en", text[7]);
                documents.add ("9", "en", text[8]);
                documents.add ("10", "en", text[9]);
                //documents.add ("2", "es", "Este ha sido un dia terrible, llegué tarde al trabajo debido a un accidente automobilistico.");

                String keywordresponse = msAPI.GetSentiment (documents,1);

                JSONObject keyjson = JSONObject.parseObject(keywordresponse);
                JSONArray keyjsonarray = keyjson.getJSONArray("documents");
                for(int i = 0;i<keyjsonarray.size();i++){
                    List<String>keylist = new ArrayList<>();
                    JSONObject jsonObject= keyjsonarray.getJSONObject(i);

                    String keyword = jsonObject.getString("keyPhrases");
                    int sentenceid = jsonObject.getIntValue("id");
                    //System.out.println(keyword);
                    keyword  = keyword.replace("[","");
                    keyword  = keyword.replace("]","");
                    keyword = keyword.replace("\"","");
                    String[] keyitem = null;
                    keyitem = keyword.split(",");
                    for(int k = 0;k< keyitem.length;k++){
                        if(wordBaseinterface.findBykeyword(keyitem[k]).isEmpty()){
                                 wordBase wordBase = new wordBase();
                                 wordBase.setKeyword(keyitem[k]);
                                 wordBaseinterface.save(wordBase);
                        }

                            switch (k){
                            case 0:
                                emotionBasedata[sentenceid-1].setKeyword_1(keyitem[k]);
                            break;
                            case 1:
                                emotionBasedata[sentenceid-1].setKeyword_2(keyitem[k]);
                                break;
                            case 2:
                                emotionBasedata[sentenceid-1].setKeyword_3(keyitem[k]);
                                break;
                            case 3:
                                emotionBasedata[sentenceid-1].setKeyword_4(keyitem[k]);
                                break;
                            case 4:
                                emotionBasedata[sentenceid-1].setKeyword_5(keyitem[k]);
                                break;
                            case 5:
                                emotionBasedata[sentenceid-1].setKeyword_6(keyitem[k]);
                                break;
                            case 6:
                                emotionBasedata[sentenceid-1].setKeyword_7(keyitem[k]);
                                break;
                            case 7:
                                emotionBasedata[sentenceid-1].setKeyword_8(keyitem[k]);
                                break;
                            case 8:
                                emotionBasedata[sentenceid-1].setKeyword_9(keyitem[k]);
                                break;
                            case 9:
                                emotionBasedata[sentenceid-1].setKeyword_10(keyitem[k]);
                                break;
                            case 10:
                                emotionBasedata[sentenceid-1].setKeyword_11(keyitem[k]);
                                break;
                            case 11:
                                emotionBasedata[sentenceid-1].setKeyword_12(keyitem[k]);
                                break;
                            case 12:
                                emotionBasedata[sentenceid-1].setKeyword_13(keyitem[k]);
                                break;
                            case 13:
                                emotionBasedata[sentenceid-1].setKeyword_14(keyitem[k]);
                                break;
                            case 14:
                                emotionBasedata[sentenceid-1].setKeyword_15(keyitem[k]);
                                break;
                            case 15:
                                emotionBasedata[sentenceid-1].setKeyword_16(keyitem[k]);
                                break;
                            case 16:
                                emotionBasedata[sentenceid-1].setKeyword_17(keyitem[k]);
                                break;
                            case 17:
                                emotionBasedata[sentenceid-1].setKeyword_18(keyitem[k]);
                                break;
                            case 18:
                                emotionBasedata[sentenceid-1].setKeyword_19(keyitem[k]);
                                break;
                            case 19:
                                emotionBasedata[sentenceid-1].setKeyword_20(keyitem[k]);
                                break;
                                default:
                                break;
                        }

                    }

                    //System.out.println(keyitem[0]);


                }

                String emotionresponse = msAPI.GetSentiment (documents,2);

                JSONObject emotionjson = JSONObject.parseObject(emotionresponse);
                JSONArray emotionjsonarray = emotionjson.getJSONArray("documents");
                for(int e = 0;e<emotionjsonarray.size();e++){
                    JSONObject scorejsonobject = emotionjsonarray.getJSONObject(e);
                    String score = scorejsonobject.getString("score");
                    int scoreid = scorejsonobject.getIntValue("id");
                    emotionBasedata[scoreid-1].setEmotion_value(score);
                }

                //emotionBaseDataSQLinterface emotionBaseDataSQLinterface = null;
                for(int s = 0;s<10;s++) {
                    emotionBaseDataSQLinterface.save(emotionBasedata[s]);
                }
            }
            catch (Exception e) {
                System.out.println (e);
            }
        }

}
