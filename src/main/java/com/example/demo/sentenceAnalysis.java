package com.example.demo;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.corpus.dependency.CoNll.CoNLLSentence;
import com.hankcs.hanlp.corpus.dependency.CoNll.CoNLLWord;
import com.hankcs.hanlp.model.crf.CRFLexicalAnalyzer;
import com.hankcs.hanlp.model.perceptron.PerceptronLexicalAnalyzer;
import com.hankcs.hanlp.model.perceptron.PerceptronPOSTagger;
import com.hankcs.hanlp.model.perceptron.PerceptronSegmenter;

import java.io.IOException;
import java.util.Arrays;

public class sentenceAnalysis {
    //public static final String SENTENCE = "香港特别行政区的张朝阳说商品和服务是三原县鲁桥食品厂的主营业务";
    public static void main(String[] args) throws IOException {
        CoNLLSentence sentence = HanLP.parseDependency("收到第二个offer-countrycitymark一下，自从拿到南航的之后就很佛系面试了很多面试都会因为天气太热或路途太远选择不去很怕秋招会被这些企业拉黑[允悲][允悲]心里已经有答案那就去试试吧不是很厉害的人但也可以算是比较努力的人");
        System.out.println(sentence);
        // 可以方便地遍历它
        for (CoNLLWord word : sentence)
        {
            //System.out.printf("%s --(%s)--> %s\n", word.LEMMA, word.DEPREL, word.HEAD.LEMMA);
            if((word.LEMMA).equals("南航")){

            }

        }
        // 也可以直接拿到数组，任意顺序或逆序遍历
        CoNLLWord[] wordArray = sentence.getWordArray();
        for (int i = wordArray.length - 1; i >= 0; i--)
        {
            CoNLLWord word = wordArray[i];
            System.out.printf("%s --(%s)--> %s\n", word.LEMMA, word.DEPREL, word.HEAD.LEMMA);
        }
        // 还可以直接遍历子树，从某棵子树的某个节点一路遍历到虚根
        CoNLLWord head = wordArray[12];
        while ((head = head.HEAD) != null)
        {
            if (head == CoNLLWord.ROOT) System.out.println(head.LEMMA);
            else System.out.printf("%s --(%s)--> ", head.LEMMA, head.DEPREL);
        }
    }
}
