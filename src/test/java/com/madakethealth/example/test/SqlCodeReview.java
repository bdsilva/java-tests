package com.madakethealth.example.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.madakethealth.example.Application;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@ActiveProfiles("test")
public class SqlCodeReview {

    /**
     * As as code reviewer to this method; what would you suggest the developer 
     * does to ensure multiple threads can work on the method without any 
     * concurrency issues.
     * 
     * Table LinkedList:
     *    | id | prev_id | next_id| val | 
     *    | 1  | null    |  2     | tom |
     *    | 2  | 1       |  3     | alice |
     *    | 3  | 2       |  4     | jerry |
     *    | 4  | 3       |  5     | max |
     *     
     * @return
     */
    public static void addToLinkedList(String previousId, String nextId, String val) {
//      long id = "select max(id)+1 from LinkedList";
//      "insert into LinkedList(id, prev_id, next_id, val) values(id, prev_id, next_id, val)";
//      "update LinkedList set prev_id=? where id=?";
//      "update LinkedList set next_id=? where id=?";
    }

    @Test
    public void testDBStatements() {
        // do nothing;
    }
}
