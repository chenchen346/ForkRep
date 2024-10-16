package P2;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L2022212024_17_Test {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findRepeatedDnaSequences() {
//        示例1
        /*
        * @param String s:长度任意，由ATCG四个字母组成
        * @result List<String> 长度不小于10的重复序列
        *           s<=10时，输出为空
        * 示例1
        * 输入：s，有两条长重复链的DNA
        *
        * */
        /*
        *  s.lenth()>10,有两条重复链
        * */

        String s="AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> answer=new ArrayList<>();
        answer.add("AAAAACCCCC");
        answer.add("CCCCCAAAAA");
        Solution solution=new Solution();
        List<String> list =solution.findRepeatedDnaSequences(s);
        System.out.println(s+"exg1");
        assertEquals(answer,list);

        /*
        * s>10,只有一条重复链
        * */
        solution = new Solution();
        s = "AAAAAAAAAAAAA";
        List<String> expected = Arrays.asList("AAAAAAAAAA");
        List<String> result = solution.findRepeatedDnaSequences(s);
        System.out.println(s+"exg2");
        assertEquals(expected, result);
//        示例3
/*      s<10
* */
        s = "AAAAAAAAA";
        answer.clear();
        List<String> empty=new ArrayList<String>();
        list=solution.findRepeatedDnaSequences(s);
        System.out.println(s+"exg3");
        assertEquals(empty,list);

    }
}
